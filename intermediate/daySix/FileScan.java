package intermediate.daySix;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.Collection;

public class FileScan {

    private String filePath;

    public void fileScan(String filePath) {

        List<String> r = new ArrayList<>();

        try (Scanner s = new Scanner(new FileReader(filePath))) {
            while (s.hasNext()) {

                r.add(s.next());
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //System.out.println(r);

        //r.forEach(c -> System.out.print(c + " "));
        //System.out.println(r.size());

        Pattern pattern = Pattern.compile("Java");
        r.stream().filter(s -> s.equalsIgnoreCase("Java")).forEach(System.out::println);

        List<String> x = r.stream().filter(pattern.asPredicate()).collect(Collectors.toList());

        System.out.println("Total occurences of 'Java': "+x.size());


    }
    
}

