package baristamatic.Models.Drinks;

import baristamatic.Models.Ingredient;

/**
 *
 * @author carlgramata
 */
public class DecafCoffee extends Drink{
    
    public DecafCoffee() {
        super("Decaf Coffee");
        drinkRecipe.put(Ingredient.DECAF_COFFEE, 3);
        drinkRecipe.put(Ingredient.SUGAR, 1);
        drinkRecipe.put(Ingredient.CREAM, 1);
    }
    
}
