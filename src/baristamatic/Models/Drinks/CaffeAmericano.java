package baristamatic.Models.Drinks;

import baristamatic.Models.Ingredient;

/**
 *
 * @author carlgramata
 */
public class CaffeAmericano extends Drink{
    
    public CaffeAmericano() {
        super("Caffe Americano");
        drinkRecipe.put(Ingredient.ESPRESSO, 3);
    }
    
}
