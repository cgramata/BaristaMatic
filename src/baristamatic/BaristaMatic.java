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
 *Contains the main method which handles the user input and utilizes the drink objects
 * 
 * @author carlgramata
 * @since 11Feb2019
 */
public class BaristaMatic extends ArrayIndexOutOfBoundsException{

    /**
     * Prints out the drink menu and the specified fields
     * 
     * The format is as specified: "1,Drink Name,$price,availability"
     * 
     * @param inventoryObject Inventory object 
     * @param drinkMenu       Array of Drink subclass objects
     */
    public void printMenu(Inventory inventoryObject, List<Drink> drinkMenu) {
        System.out.println("Menu:");
        for (int i = 1; i <= drinkMenu.size(); i++) {                  
            System.out.println(
                    i + "," + drinkMenu.get(i-1).getDrinkName() + 
                    ",$" + drinkMenu.get(i-1).getDrinkPrice() + "," + 
                    inventoryObject.checkAvailability(drinkMenu.get(i-1).getDrinkRecipe()));
        }
    }
    
    /**
     * The main method of BaristaMatic
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Inventory inventoryObject = new Inventory();                   //Stocks the inventory first
        inventoryObject.restockInventory();
        
        List<Drink> drinkMenu = new ArrayList<>(Arrays.asList(         //Instantiate the drink objects
                new DecafCoffee(),
                new CaffeLatte(),
                new Cappuccino(),
                new CaffeAmericano(),
                new CaffeMocha(),
                new Coffee()
                ));
        Collections.sort(drinkMenu);
        
        BaristaMatic baristaMaticObject = new BaristaMatic();           //Instantiate the BaristaMatic object
        
        inventoryObject.printInventory();                               //Prints out the inventory and the menu as specified
        baristaMaticObject.printMenu(inventoryObject, drinkMenu);
        
        Scanner scan = new Scanner(System.in);
        
        OUTER:
        while (true) {                                                  //Handles the user input
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
