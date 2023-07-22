package intermediate.dayTen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * Assignment: Implementing the "Add to Cart" Feature
 * Objective:
 * Implement the "Add to Cart" feature in an e-commerce application using Java.
 * Requirements: 
1. Create a `Product` class with attributes: 
  `productId`, `productName`, `price`, and `quantity`.

2. Create a `Cart` class with methods:
- `addToCart(Product product)`: Adds a product to the cart.
- `removeFromCart(Product product)`: Removes a product from the cart.
- `updateQuantity(Product product, int quantity)`: Updates the quantity of a product in the cart.
- `viewCart()`: Displays the products in the cart.
- `checkout()`: Proceeds to the checkout process.

3. Use a `Main` class to demonstrate the feature:
- Create product instances.
- Create a cart instance.
- Add products to the cart.
- Display the cart.
- Update quantity or remove a product.
- Display the updated cart.
- Proceed to checkout.

Instructions:
1. Implement the `Product` class with the specified attributes and appropriate methods.

2. Implement the `Cart` class with the required methods to handle product addition, removal, quantity updates, and cart display.

3. Use the `Main` class to simulate the feature's usage. Create instances, perform operations on the cart, and display the results.

4. Test the program with different scenarios, including adding multiple products, updating quantities, and removing products. 
   Ensure the cart functions as expected.

5. Add comments to your code for clarity and explanation of each class 
   and method's functionality.

6. Compile and run your program to verify its correctness.

Note: Maintain good coding practices, structure, and error handling in your implementation.

 * 
 */
public class Main {

   public static void main(String[] args) {

      ProductProvisioning provisioning = new ProductProvisioning();

      try {
         provisioning.provisionProducts();
      } catch (FileNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }


   }
}
