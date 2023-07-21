package intermediate.daySix;

import java.io.File;
import java.io.IOException;

public class FileExists {

    private String filePath;
    private String fileName;


    public FileExists() {

    }

    public boolean existsFile(String filePath, String fileName) {

        String fileToBeProcessed = filePath.concat(fileName);

        try {

            File handler = new File(fileToBeProcessed);

            if (handler.createNewFile()) {

                System.out.println("File created with success! " + handler.getName());
            } 

        } catch (IOException e) {

            System.out.println("Error ocurred...!");
            e.printStackTrace();

            return false;
        }

        return true;

    }

}
