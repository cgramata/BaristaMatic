/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baristamatic.Models.Drinks;

import baristamatic.Models.Ingredient;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author carlgramata
 */
public abstract class Drink implements Comparable<Drink>{
    String drinkName; 
    Double drinkPrice;
    DecimalFormat roundToTwo = new DecimalFormat(".00");
    Map<Ingredient, Integer> drinkRecipe = new HashMap<Ingredient, Integer>();
    
    public String getDrinkName() {
        return drinkName;
    }
    
    protected Drink(String drinkName){
        this.drinkName = drinkName;
    }
    
    public Map<Ingredient, Integer> getDrinkRecipe() {
        return drinkRecipe;
    }
    
    public String getDrinkPrice(){
        this.drinkPrice = 0.0;
        for(Ingredient entry : drinkRecipe.keySet()) {
            this.drinkPrice += entry.getIngredientPrice() * drinkRecipe.get(entry);
        }
        return roundToTwo.format(drinkPrice);
    }
    
    @Override 
    public int compareTo(Drink drink) {
        return drinkName.compareTo(drink.getDrinkName());
    }
    
}
