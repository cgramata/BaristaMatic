package baristamatic.Models;

/**
 * Holds the ingredient name and pricing, which stays constant
 * 
 * @author carlgramata
 * @since 11Feb2019
 */
public enum Ingredient {
    /**
     * Creates the constant pricing and names
     */
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
    
    /**
     * @return the ingredient name
     */
    public String getIngredientName() {
        return ingredientName;
    }
    
    /**
     * @return the ingredient price
     */
    public Double getIngredientPrice() {
        return ingredientPrice;
    }
}
