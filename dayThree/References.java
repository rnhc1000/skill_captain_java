package dayThree;

import java.util.Scanner;

/**
 * 
 * Write a Java program that takes input from the user for their age (an integer value) 
 * and their name (a string value).
 * The program should store the age as a primitive type (int) and the name as a 
 * boxed type (String).
 * The program should then print out a message that says 
 * "Hello, [name]! You are [age] years old."
 * 
 */
public class References {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("What is your name ? -> ");
        String name = input.nextLine();
        System.out.print("What is your age ? -> ");
        int age = input.nextInt();
        
        
        input.close();
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
        
    }
}
