package baristamatic.Models.Drinks;

import baristamatic.Models.Ingredient;

/**
 * Sub class of Drink, represents the Caffe Latte option
 * 
 * @author carlgramata
 * @since 11Feb2019
 */
public class CaffeLatte extends Drink{
    /**
     * Constructor that passes the drink name to the parent class constructor
     * Also puts the recipe into the drinkRecipe map
     */
    public CaffeLatte() {
        super("Caffe Latte");
        drinkRecipe.put(Ingredient.ESPRESSO, 2);
        drinkRecipe.put(Ingredient.STEAMED_MILK, 1);
    }
}
