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
public class CaffeLatte extends Drink{
    
    public CaffeLatte() {
        super("Caffe Latte");
        drinkRecipe.put(Ingredient.ESPRESSO, 2);
        drinkRecipe.put(Ingredient.STEAMED_MILK, 1);
    }
}
