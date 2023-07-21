package intermediate.daySeven;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import intermediate.daySix.FileExists;
import intermediate.daySix.FileRead;

/**
 * Assignments:
 * Write a Java program that prompts the user to enter a sentence,
 * and then writes that sentence to a file named "output.txt" in the project
 * directory.
 * 
 */
public class FileWrite {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        String fileName = "output.txt";
        String filePath = "intermediate/daySeven/";

        FileExists fileExists = new FileExists();
        boolean isFileAvailable = fileExists.existsFile(filePath,fileName);
        fileName = filePath.concat(fileName);

        if (isFileAvailable) {

            try (FileWriter handler = new FileWriter(fileName)) {
                
                handler.write(text);

                System.out.print("File Processed....This is its content! \n");

            } catch (IOException e) {

                e.printStackTrace();

            } finally {

                input.close();
            }

            FileRead fileRead = new FileRead();

            fileRead.readFile(fileName);
        }

        input.close();
    }

}
