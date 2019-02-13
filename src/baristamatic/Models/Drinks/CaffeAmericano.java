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
public class CaffeAmericano extends Drink{
    
    public CaffeAmericano() {
        super("Caffe Americano");
        drinkRecipe.put(Ingredient.ESPRESSO, 3);
    }
    
}
