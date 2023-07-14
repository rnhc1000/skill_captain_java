package beginner.dayTen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * 
 * Unique Number Checker
 * Create a program that allows a user to enter a series of numbers
 * and checks if each number is unique or has been previously entered.
 * The program should display whether each number is unique or a duplicate.
 * Requirements:
 * Use a Set to store the unique numbers.
 * Prompt the user to enter a series of numbers, one at a time.
 * Check if each number is already present in the set.
 * Display whether each number is unique or a duplicate.
 *
 */

public class SetDS {
    public static void main(String... args) {

        Scanner input = new Scanner(System.in);

        // double number = input.nextDouble();

        List<Integer> numbers = Arrays.stream(input.nextLine()
                .split(" "))
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        System.out.println(numbers);

        Set<Integer> unique = new HashSet<Integer>();
        List<Integer> duplicates = new ArrayList<Integer>();


        for (Integer x : numbers) {

            if (unique.contains(x)) {
                duplicates.add(x);
            } else {
                unique.add(x);
            }          
        }

        // for (Integer x : numbers) {

        //     if (!unique.contains(x)){

        //         duplicates.add(x);


        //     };
        // }
        System.out.println(duplicates);
        HashSet<Integer> sortedUnique = unique.stream()
        .sorted()
        .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(unique);
        System.out.println(sortedUnique);

    }

}
