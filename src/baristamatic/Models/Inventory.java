package baristamatic.Models;

import java.util.HashMap;
import java.util.Map;

/**
 * The InventoryClass keeps track of the ingredient count, the stock is updated
 * every time a drink is dispensed as specified. 
 * 
 * @author carlgramata
 * @since 11Feb2019
 */
public class Inventory {
    /**
     * A map that contains the ingredient and its amount.
     */
    private Map<Ingredient, Integer> inventory = new HashMap<>();
    
    /**
     * Used to retrieve the ingredient count from 'inventory' map.
     * 
     * @param   ingredient   Ingredient 'enum' parameter
     * @return               the amount left of the ingredient in 'int'            
     */
    public int getIngredientStock(Ingredient ingredient) {
        return inventory.get(ingredient);
    }
    
    /**
     * Used for the initial stocking of the shelf and to restock once the inventory is depleted.
     */
    public void restockInventory() {
        inventory.clear();  //redundant but safe
        for(Ingredient ingredient: Ingredient.values()) {
            inventory.put(ingredient, 10);
        }
    }
    
    /**
     * Used to print out the current inventory and the respective amounts.
     */
    public void printInventory() {
        System.out.println("Inventory:");
        for(Ingredient ingredient: Ingredient.values()) {
            System.out.printf("%s,%s\n", ingredient.getIngredientName(), (inventory.get(ingredient)));
        }
    }
    
    /**
     * Used to update the inventory after the drink is dispensed.
     * 
     * @param drinkRecipe a map, Key ingredient, Value amount
     */
    public void updateInventory(Map<Ingredient, Integer> drinkRecipe){
        for(Ingredient ingredient : drinkRecipe.keySet()) {
            inventory.put(ingredient, (inventory.get(ingredient) - drinkRecipe.get(ingredient)));
        }
    }
    
    /**
     * Used to see if a drink can be made with the available inventory.
     * 
     * @param checkAvailability a map, Key ingredient, Value amount
     * @return                  a boolean whether a drink is possible to make
     */
    public boolean checkAvailability(Map<Ingredient, Integer> drinkRecipe) {
        for (Ingredient ingredient : drinkRecipe.keySet()) {
            if(drinkRecipe.get(ingredient) > inventory.get(ingredient)) {
                return false;
            }
        }
        return true;
    }
}
