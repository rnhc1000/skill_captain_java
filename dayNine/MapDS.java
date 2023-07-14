package dayNine;

import java.util.Arrays;
/**
 * 
 * Word Frequency Counter
 * Create a program that reads a paragraph of text and 
 * counts the frequency of each word in the paragraph. 
 * The program should display the word and its corresponding frequency.
 * Requirements:
 * Use a HashMap to store the word-frequency pairs.
 * Prompt the user to enter a paragraph of text.
 * Split the paragraph into individual words and count the frequency of each word.
 * Display the word and its frequency.
 * 
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDS {

    public static void main(String... args) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        input.close();
        // String modifiedText = text.replaceAll("\\s+", "");

        // System.out.println(modifiedText);

        String str[] = text.split("\\s+");

        // char c[] = modifiedText.toCharArray();
        System.out.println(Arrays.toString(str));
        
        for (String sanitized : str) {
            sanitized = sanitized.replaceAll("[^a-zA-Z]", "").toLowerCase();
            int f = map.getOrDefault(sanitized, 0);
            map.put(sanitized, f+1);
        }
        
        // Integer frequency = 1;

        // for (int i = 0; i < str.length; i++) {
        //     for (int j = i+1; j < str.length; j++) {
        //         System.out.println(str[i] + " " + str[j]+ " ");

        //         if (str[i].equals(str[j])) {
        //             System.out.println("-----------------");
        //             System.out.println("Iguais " + i + " str[i] " + str[i] + " " + j + " str[j] " + str[j]);
        //             System.out.println("-----------------");
        //             // j++;
        //             frequency+=1;
        //             System.out.println("Frequency " + frequency);
        //             map.put(str[i], frequency);
        //             System.out.println(map);
        //             //map.get(str[i]);
        //             //map.getOrDefault()

        //             //if (frequency >= str.length) break;
        //         } 

        //         // map.put(str[i],frequency);
        //     }

                System.out.println(map);

        }


    }

