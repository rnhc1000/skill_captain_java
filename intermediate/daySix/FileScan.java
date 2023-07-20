package intermediate.daySix;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FileScan {

    private String filePath;

    public void fileScan(String filePath) {

        List<String> listOfWords = new ArrayList<>();

        try (Scanner reader = new Scanner(new FileReader(filePath))) {
            while (reader.hasNext()) {

                listOfWords.add(reader.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        Pattern pattern = Pattern.compile("Java");

        List<String> javaCount = listOfWords.stream().filter(pattern.asPredicate()).collect(Collectors.toList());

        System.out.println("Total occurences of 'Java': "+ javaCount.size());


    }
    
}

