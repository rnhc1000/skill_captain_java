package intermediate.daySix;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * How to Read a File in Java
 * To read a file in Java, follow these steps:
 * 1. Create a File object that represents the file you want to read.
 * 2. Create a FileReader object that will allow you to read the contents of the
 * file.
 * 3. Read the contents of the file using methods such as read() or
 * BufferedReader.readLine().
 * 4. Close the FileReader object once you're done reading the file.
 * 
 * **Problem Statement: Word Count**
 * You are given a text file named "input.txt" that contains a collection of
 * sentences.
 * Your task is to write a program in Java that reads the contents of the file
 * and
 * counts the number of occurrences of the word "Java".
 * The program should then print the total count to the console.
 * The File class from the java.io package, allows us to work with files.
 * 
 */

public class FileRead {

    private String filePath;

    public FileRead() {

    }

    public void readFile(String filePath) throws IOException {

        List<String> text = new ArrayList<>();
        BufferedReader br = null;

        try {

            br = new BufferedReader(new FileReader(filePath));
            String line = "";
            while ((line = br.readLine()) != null) {

                text.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (br != null) {
                br.close();
            }

        }
    }
}
