/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
