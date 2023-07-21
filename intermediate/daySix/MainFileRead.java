package intermediate.daySix;

import java.io.IOException;

public class MainFileRead {

    public static void main(String[] args) {

        FileExists fileExists = new FileExists();

        String filePath = "intermediate/daySix/";
        String fileName = "input.txt";

        boolean isFileAvailable = fileExists.existsFile(filePath, fileName);

        if (isFileAvailable) {

            FileRead fileRead = new FileRead();

            try {
                fileRead.readFile(filePath);
            } catch (IOException e) {
                e.printStackTrace();
            }

            FileScan fileScan = new FileScan();

            fileScan.fileScan(filePath);

        } else {

            System.out.println("File not available...");
        }

    }

}
