package intermediate.daySix;

import java.io.IOException;

public class MainFileRead {

    public static void main(String[] args)  {

        System.out.println("Testing if file exists or not");

        FileExists fileExists = new FileExists();

        String filePath = "intermediate/daySix/input.txt";

        boolean isFileAvailable = fileExists.existsFile(filePath);

        System.out.println(isFileAvailable);

        FileRead fileRead= new FileRead();

        try {
            fileRead.readFile(filePath);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        FileScan fileScan = new FileScan();

        fileScan.fileScan(filePath);


    }
    
}
