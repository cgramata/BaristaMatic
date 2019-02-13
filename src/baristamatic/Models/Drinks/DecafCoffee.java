package baristamatic.Models.Drinks;

import baristamatic.Models.Ingredient;

/**
 * Sub class of Drink, represents the Decaf Coffee option
 * 
 * @author carlgramata
 * @since 11Feb2019
 */
public class DecafCoffee extends Drink{
    /**
     * Constructor that passes the drink name to the parent class constructor
     * Also puts the recipe into the drinkRecipe map
     */
    public DecafCoffee() {
        super("Decaf Coffee");
        drinkRecipe.put(Ingredient.DECAF_COFFEE, 3);
        drinkRecipe.put(Ingredient.SUGAR, 1);
        drinkRecipe.put(Ingredient.CREAM, 1);
    }
    
}
