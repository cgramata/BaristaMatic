package baristamatic.Models.Drinks;

import baristamatic.Models.Ingredient;

/**
 * Sub class of Drink, represents the Caffe Americano option
 * 
 * @author carlgramata
 * @since 11Feb2019
 */
public class CaffeAmericano extends Drink{
    /**
     * Constructor that passes the drink name to the parent class constructor
     * Also puts the recipe into the drinkRecipe map
     */
    public CaffeAmericano() {
        super("Caffe Americano");
        drinkRecipe.put(Ingredient.ESPRESSO, 3);
    }
    
}
