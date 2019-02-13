package baristamatic.Models.Drinks;

import baristamatic.Models.Ingredient;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.HashMap;

/**
 * The parent class for the coffee beverage classes 
 *
 * @author carlgramata
 * @since 11Feb2019
 */
public abstract class Drink implements Comparable<Drink>{
    /**
     * drinkName   represents the subclass drink name
     * drinkPrice  represents the subclass drink price
     * roundToTwo  rounds a Double to two decimal places
     * drinkRecipe a map, Key ingredient, Value amount of ingredient
     */
    String drinkName; 
    Double drinkPrice;
    DecimalFormat roundToTwo = new DecimalFormat(".00");
    Map<Ingredient, Integer> drinkRecipe = new HashMap<>();
    
    /**
     * The Drink class constructor.
     * 
     * @param drinkName a string passed from the subclass 
     */
    protected Drink(String drinkName){
        this.drinkName = drinkName;
    }
    
    /**
     * Retrieves the drink name
     *
     * @return      the drink name
     */
    public String getDrinkName() {
        return drinkName;
    }
    
    /**
     * Retrieves the recipe of the drink.
     * 
     * @return      returns a map, Key ingredient, Value amount of ingredient
     */
    public Map<Ingredient, Integer> getDrinkRecipe() {
        return drinkRecipe;
    }
    
    /**
     * Retrieves the price of the drink
     * 
     * @return      a string version of the price
     */
    public String getDrinkPrice(){
        this.drinkPrice = 0.0;
        for(Ingredient entry : drinkRecipe.keySet()) {
            this.drinkPrice += entry.getIngredientPrice() * drinkRecipe.get(entry);
        }
        return roundToTwo.format(drinkPrice);
    }
    
    /**
     * Overridden method to sort the Drink class by name
     * 
     * @param drink takes in Drink type parameter 
     */
    @Override 
    public int compareTo(Drink drink) {
        return drinkName.compareTo(drink.getDrinkName());
    }
    
}
