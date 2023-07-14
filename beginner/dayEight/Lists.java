package beginner.dayEight;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Grocery List Manager
 * Create a program that allows a user to manage their grocery list. 
 * The program should perform the following operations:
 * Requirements:
 * Add items to the grocery list.
 * Remove items from the grocery list.
 * Print the current grocery list.
 * Check if a specific item is already on the grocery list.
 * Clear the entire grocery list.
 * 
 */
public class Lists {
    
    public static void main(String... args) {

        List<String> groceryList = new ArrayList<String>();

        // Adding items to the groceryList;

        groceryList.add("Chocolate Cake");
        groceryList.add("Vanilla Brownie");
        groceryList.add("Candy");
        groceryList.add("Lollypop");
        groceryList.add("Lemon pie");

        System.out.println(groceryList);

        // Removing items from the grocerList

        groceryList.remove("Lemon pie");

        // Printing the groceryList;
        System.out.println(groceryList);

        // Checking  if there is an specific item in the groceryList
        boolean containsCake = false;
        containsCake = groceryList.contains("Chocolate Cake");
        System.out.println(containsCake);

        //ear the groceryList
        groceryList.clear();

        System.out.println(groceryList);




        
    }
}
;