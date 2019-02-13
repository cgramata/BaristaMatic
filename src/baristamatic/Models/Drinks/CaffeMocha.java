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
public class CaffeMocha extends Drink{
    
    public CaffeMocha() {
        super("Caffe Mocha");
        drinkRecipe.put(Ingredient.ESPRESSO, 1);
        drinkRecipe.put(Ingredient.COCOA, 1);
        drinkRecipe.put(Ingredient.STEAMED_MILK, 1);
        drinkRecipe.put(Ingredient.WHIPPED_CREAM, 1);
        
    }
    
}
