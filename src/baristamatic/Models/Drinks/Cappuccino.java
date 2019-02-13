package baristamatic.Models.Drinks;

import baristamatic.Models.Ingredient;

/**
 *
 * @author carlgramata
 */
public class Cappuccino extends Drink{

    public Cappuccino() {
        super("Cappuccino");
        drinkRecipe.put(Ingredient.ESPRESSO, 2);
        drinkRecipe.put(Ingredient.STEAMED_MILK, 1);
        drinkRecipe.put(Ingredient.FOAMED_MILK, 1);
        
    }

}
