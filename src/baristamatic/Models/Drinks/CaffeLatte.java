package baristamatic.Models.Drinks;

import baristamatic.Models.Ingredient;

/**
 *
 * @author carlgramata
 */
public class CaffeLatte extends Drink{
    
    public CaffeLatte() {
        super("Caffe Latte");
        drinkRecipe.put(Ingredient.ESPRESSO, 2);
        drinkRecipe.put(Ingredient.STEAMED_MILK, 1);
    }
}
