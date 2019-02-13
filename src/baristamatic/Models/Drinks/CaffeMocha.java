package baristamatic.Models.Drinks;

import baristamatic.Models.Ingredient;

/**
 * Sub class of Drink, represents the Caffe Mocha option
 * 
 * @author carlgramata
 * @since 11Feb2019
 */
public class CaffeMocha extends Drink{
    /**
     * Constructor that passes the drink name to the parent class constructor
     * Also puts the recipe into the drinkRecipe map
     */
    public CaffeMocha() {
        super("Caffe Mocha");
        drinkRecipe.put(Ingredient.ESPRESSO, 1);
        drinkRecipe.put(Ingredient.COCOA, 1);
        drinkRecipe.put(Ingredient.STEAMED_MILK, 1);
        drinkRecipe.put(Ingredient.WHIPPED_CREAM, 1);
        
    }
    
}
