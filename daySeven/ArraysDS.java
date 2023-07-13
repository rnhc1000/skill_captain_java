package daySeven;

import java.util.Arrays;

/**
 * Write a Java program that prompts the user to enter 5 integer values
 * and stores them in an array.
 * The program should then find and print the sum, average, maximum, and minimum
 * of the values in the array.
 */
public class ArraysDS {

    public static void main(String args[]) {

        Integer array[] = new Integer[5];
        int max = 1000;
        int min = 1;
        int range = max - min;
        for (int x = 0; x < 5; x++) {
            array[x] = (int) (Math.random() * range);
        }
        int lenArray = array.length;
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        int sum = 0;
        int average = 0;
        int maxValue = Integer.MIN_VALUE;
        int minValue = 0;
        

        for (Integer x : array) {
            sum += x;
        }
        System.out.println("Sum -> " + sum);

        average = sum / lenArray;

        System.out.println("Average ->" + average);

        for (int i = 0; i < lenArray; i++) {

            maxValue = (array[i] > maxValue) ? array[i] : maxValue;

        }

        minValue = maxValue;

        for (int i = 0; i < lenArray; i++) {

            minValue = (array[i] < minValue) ? array[i] : minValue;

        }

        System.out.println("Max -> " + maxValue);
        System.out.println("Min -> " + minValue);
    }
}
