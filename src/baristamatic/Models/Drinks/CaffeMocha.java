package baristamatic.Models.Drinks;

import baristamatic.Models.Ingredient;

/**
 *
 * @author carlgramata
 */
public class CaffeMocha extends Drink{
    
    public CaffeMocha() {
        super("Caffe Mocha");
        drinkRecipe.put(Ingredient.ESPRESSO, 1);
        drinkRecipe.put(Ingredient.COCOA, 1);
        drinkRecipe.put(Ingredient.STEAMED_MILK, 1);
        drinkRecipe.put(Ingredient.WHIPPED_CREAM, 1);
        
    }
    
}
