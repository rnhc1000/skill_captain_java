package intermediate.dayTen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductProvisioning {


    public Map<Integer, Product> provisionProducts() {

        Map<Integer, Product> provisioning = new HashMap<Integer,Product>();

        BufferedReader br = null;
        List<String> listOfProducts = Arrays.asList(
            "refrigerator",
            "stoven",
            "oven",
            "tv"
        );
      try {
         String sCurrentLine;
         br = new BufferedReader(new FileReader("intermediate/dayTen/refrigerator.txt"));// file name with path
         while ((sCurrentLine = br.readLine()) != null) {
            String[] strArr = sCurrentLine.split("\\:");
            for (String str : strArr) {
               System.out.println(str);
            }
         }

      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         try {
            if (br != null)
               br.close();
         } catch (IOException ex) {
            ex.printStackTrace();
         }
      }

        

        return provisioning;

    }
    
}
