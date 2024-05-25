package beginner.dayFour;
/**
 * Write a Java program that takes in two integer values from the user 
 * and outputs the larger of the two values using a conditional statement.
 */
import java.util.Scanner;

public class LargerNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number -> ");
        int numberOne = input.nextInt();
        System.out.print("Input the second number -> ");
        int numberTwo = input.nextInt();
        int largerNumber = (numberOne > numberTwo) ? numberOne : numberTwo;
        input.close();
        System.out.println("Number " + largerNumber + " is the largest");
    }
}
