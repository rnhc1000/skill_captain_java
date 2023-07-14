package beginner.dayFive;

import java.util.Scanner;

/**
 * Write a Java program that allows the user to perform basic arithmetic
 * operations
 * (addition, subtraction, multiplication, and division) through a
 * Command Line Interface (CLI).
 * The program should prompt the user to enter two numbers and the
 * operation they wish to perform, then display the result.
 * 
 */
public class Calculator {

    public static double mathOperations(double numberOne, double numberTwo, String math) {

        double result = 0d;
        switch (math) {

            case "+":
                result = numberOne + numberTwo;
                break;

            case "-":
                result = numberOne - numberTwo;
                break;

            case "/":
                result = numberOne/numberTwo;
                 break;

            case "*":
                result = numberOne * numberTwo;
                 break;

            default:
            break;

        }


        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input the first number -> ");
        double numberOne = input.nextDouble();
        System.out.print("Input the second number -> ");
        double numberTwo = input.nextDouble();
        System.out.print("Input:  + to sum, - to minus, / to divide or * to multiply; ");
        input.nextLine();
        String ops = input.nextLine();


        if (numberOne == 0 || numberTwo == 0) {

            System.out.println("Both number must be larger than zero!!!");
            System.out.print("Input the first number -> ");
            numberOne = input.nextDouble();
            System.out.print("Input the second number -> ");
            numberTwo = input.nextDouble();
            System.out.print("Input:  + to sum, - to minus, / to divide or * to multiply; ");
            input.nextLine();
            ops = input.nextLine();
            System.out.println("Thanks for your cooperation!!!");

        }

        double value = mathOperations(numberOne, numberTwo, ops);

        System.out.println("Operation chosen -> " + ops +  ", result ->"  + value);;


        

    }
}