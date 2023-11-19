package br.dev.ferreiras;

import java.util.Scanner;

import br.dev.ferreiras.FactorialCalculator;

/**
 * Hello world!
 *
 */
public class App {
    
    public static void main( String[] args )  {

        Scanner input = new Scanner(System.in);
        System.out.print("Input the number to be factoried...: ");
        int numberToBeFactoried = input.nextInt();

        FactorialCalculator factorial = new FactorialCalculator();

        int numberFactoried= factorial.calculateFactorial(numberToBeFactoried);

        System.out.println(numberFactoried);
        input.close();
    }
}
