package beginner.daySix;

import java.util.Scanner;

/**
 * 
 * Write a Java program that uses a for loop to print out the numbers from 1 to 10.
 * Then, write another program that uses a while loop to print out the even numbers 
 * between 1 and 20.
 * Finally, write a program that uses a do-while loop to prompt the user to enter a number 
 * between 1 and 10, and keeps prompting until a valid number is entered.
 * Once a valid number is entered, the program should print out a message 
 * that says "You entered [number]."
 * 
 */
public class Loop {
    
    public static void main(String args[] ) {

        for (int i=1; i<11; i++) {
            System.out.print(i+" ");
        }
        System.out.print("\n");

        int j = 1;
        while( j < 21) {

                System.out.print(j+" ");
                j++;
        }
        System.out.println();
        Scanner input = new Scanner(System.in);
        int number;

        do {

            System.out.println("Input a number between 1 and 10");
            number = input.nextInt();


        } while (number > 10);
        System.out.println("You entered " + number);



    }
}
