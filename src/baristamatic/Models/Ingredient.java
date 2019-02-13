/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baristamatic.Models;

/**
 *
 * @author carlgramata
 */
public enum Ingredient {
    COCOA("Cocoa",.90),
    COFFEE("Coffee",.75),
    CREAM("Cream",.25),
    DECAF_COFFEE("Decaf Coffee",.75),
    ESPRESSO("Espresso",1.10),
    FOAMED_MILK("Foamed Milk",.35),
    STEAMED_MILK("Steamed Milk",.35),
    SUGAR("Sugar",.25),
    WHIPPED_CREAM("Whipped Cream",1.00);
    
    private final String ingredientName;
    private final Double ingredientPrice;
   
    
    Ingredient(String ingredientName, Double ingredientPrice) {
        this.ingredientName = ingredientName;
        this.ingredientPrice = ingredientPrice;
    }
    
    public String getIngredientName() {
        return ingredientName;
    }
    
    public Double getIngredientPrice() {
        return ingredientPrice;
    }
}
