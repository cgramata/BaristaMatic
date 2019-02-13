package baristamatic.Models.Drinks;

import baristamatic.Models.Ingredient;

/**
 *
 * @author carlgramata
 */
public class Coffee extends Drink {
    
    public Coffee() {
        super("Coffee");
        drinkRecipe.put(Ingredient.COFFEE, 3);
        drinkRecipe.put(Ingredient.SUGAR, 1);
        drinkRecipe.put(Ingredient.CREAM, 1);
        
    }

}
