package intermediate.daySix;

import java.io.File;
import java.io.IOException;

public class FileExists {

    private String filePath;

    public FileExists() {

    }

    public boolean existsFile(String filePath) {

        try {

            File handler = new File(filePath);

            if (handler.createNewFile()) {

                System.out.println("File created with success! " + handler.getName());
            } else {

                System.out.println("File already exists!!!:-> " + handler.getName());

            }
        } catch (IOException e) {

            System.out.println("Error ocurred...!");
            e.printStackTrace();

            return false;
        }
        return true;

    }

}
