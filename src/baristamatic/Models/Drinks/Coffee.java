package baristamatic.Models.Drinks;

import baristamatic.Models.Ingredient;

/**
 * Sub class of Drink, represents the Coffee option
 * 
 * @author carlgramata
 * @since 11Feb2019
 */
public class Coffee extends Drink {
    /**
     * Constructor that passes the drink name to the parent class constructor
     * Also puts the recipe into the drinkRecipe map
     */
    public Coffee() {
        super("Coffee");
        drinkRecipe.put(Ingredient.COFFEE, 3);
        drinkRecipe.put(Ingredient.SUGAR, 1);
        drinkRecipe.put(Ingredient.CREAM, 1);
        
    }

}
