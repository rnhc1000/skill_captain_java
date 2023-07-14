package beginner.dayNine;

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
 * Iterate over a HashMap...
 * keySet() -> Key
 * values() -> Value
 * 
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
        String modifiedText = text.replaceAll("\\s+", "");

        System.out.println(modifiedText);

        String str[] = text.split("\\s+");
        modifiedText = modifiedText.toLowerCase();

        char direct[] = modifiedText.toCharArray();

        int n = direct.length;
        int maxKey = n-1;

        char reverse[] = new char[n];

        for(int i=0; i<n;i++) {

            reverse[i]=direct[maxKey-i];
        }

        System.out.println(Arrays.toString(str));
        
        System.out.println(Arrays.toString(direct));
        System.out.println(Arrays.toString(reverse));

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
                // Display the word and its frequency
                System.out.println("\nWord Frequency:");
                // for (Map.Entry entry : map.entrySet()) {
                //     String word = entry.getKey();
                //     int frequency = entry.getValue();
                //     System.out.println(word + ": " + frequency);
                // }

                for(String i : map.keySet()) {

                    System.out.println(i);

                }

                for(Integer i : map.values()) {

                    System.out.println(i);

                }


                for(String i : map.keySet()){

                    System.out.println("Key -> " + i + " ... Value -> " + map.get(i));

                }

                System.out.println(map);

        }


    }

