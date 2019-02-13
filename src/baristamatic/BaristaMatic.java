/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baristamatic;

import baristamatic.Models.Drinks.Drink;
import baristamatic.Models.Drinks.DecafCoffee;
import baristamatic.Models.Drinks.CaffeMocha;
import baristamatic.Models.Drinks.Coffee;
import baristamatic.Models.Drinks.Cappuccino;
import baristamatic.Models.Drinks.CaffeLatte;
import baristamatic.Models.Drinks.CaffeAmericano;
import baristamatic.Models.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author carlgramata
 */
public class BaristaMatic extends ArrayIndexOutOfBoundsException{

    public void printMenu(Inventory inventoryObject, List<Drink> drinkMenu) {
        System.out.println("Menu:");
        for (int i = 1; i <= drinkMenu.size(); i++) {
            System.out.println(i + "," + drinkMenu.get(i-1).getDrinkName() + ",$" + 
                drinkMenu.get(i-1).getDrinkPrice() + "," + 
                inventoryObject.checkAvailability(drinkMenu.get(i-1).getDrinkRecipe()));
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Stocks the inventory first
        Inventory inventoryObject = new Inventory();
        inventoryObject.restockInventory();
        
        //Instantiate the drink objects
        List<Drink> drinkMenu = new ArrayList<>(Arrays.asList(
                new DecafCoffee(),
                new CaffeLatte(),
                new Cappuccino(),
                new CaffeAmericano(),
                new CaffeMocha(),
                new Coffee()
                ));
        Collections.sort(drinkMenu);
        
        //Instantiate the BaristaMatic object
        BaristaMatic baristaMaticObject = new BaristaMatic();
        
        //prints out the inventory and EVENTUALLY the menu as specified
        inventoryObject.printInventory();
        baristaMaticObject.printMenu(inventoryObject, drinkMenu);
        
        Scanner scan = new Scanner(System.in);
        
        OUTER:
        while (true) {
            String input = scan.next().toLowerCase();
            switch (input) {
                case "r":
                    inventoryObject.restockInventory();
                    inventoryObject.printInventory();
                    baristaMaticObject.printMenu(inventoryObject, drinkMenu);
                    break;
                case "q":
                    break OUTER;
                default:
                    try {
                        Integer orderInput = Integer.parseInt(input);
                        String name = drinkMenu.get(orderInput - 1).getDrinkName();
                        Map<Ingredient, Integer> recipe = drinkMenu.get(orderInput - 1).getDrinkRecipe();
                        
                        if (inventoryObject.checkAvailability(recipe)) {
                            inventoryObject.updateInventory(recipe);
                            System.out.printf("Dispensing: %s\n", name);
                            inventoryObject.printInventory();
                            baristaMaticObject.printMenu(inventoryObject, drinkMenu);
                        } else {
                            System.out.printf("Out of stock: %s\n", name);
                            inventoryObject.printInventory();
                            baristaMaticObject.printMenu(inventoryObject, drinkMenu);
                        }
                    } catch (IndexOutOfBoundsException | NumberFormatException exception) {
                        System.out.printf("Invalid selection: %s\n",input);
                        inventoryObject.printInventory();
                        baristaMaticObject.printMenu(inventoryObject, drinkMenu);
                    } 
                break;
            }
        }
    }
    
}
