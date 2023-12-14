package intermediate.dayTen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ProductProvisioning {

    public Map<String, Product> provisionProducts() throws FileNotFoundException {

        Map<String, Product> provisioning = new HashMap<>();
        Product product = new Product();

        // BufferedReader br = null;
        List<String> listOfProducts = Arrays.asList(
                "refrigerator",
                "stove"
                //"vacuumCleaner",
                //"tv"
                );
        String file = "";
        String path = "intermediate/dayTen/";
        String ext = ".txt";
        // String[] strArr = new String[5];

        List<String> list = new ArrayList<>();
        //listOfProducts.forEach((c) -> System.out.println(c));
        //int sizeOfList = listOfProducts.size();
        for (String inventory : listOfProducts) {

            file = path.concat(inventory).concat(ext);

            try (Scanner s = new Scanner(new File(file))) {
                s.useDelimiter(":");
                while (s.hasNext()) {
                    list.add(s.next());
                }
                if (s!= null) 
                    s.close();
            }
            
            Double q = Double.valueOf(list.get(4));
            product.setProductName(list.get(1));
            product.setDescription(list.get(2));
            product.setPrice(Double.parseDouble(list.get(3)));
            product.setQuantity(q);
            product.setProductId(list.get(0));
            String key = product.getProductId();
            list.clear();
            provisioning.put(key, product);
            //System.out.println(provisioning);
            //return provisioning;
        }
        // } catch (IOException e) {
        // e.printStackTrace();
        // } finally {
        // try {

        // if (br != null)
        // br.close();
        // } catch (IOException ex) {;
        // ex.printStackTrace();
        // }
        // }
        // System.out.println(list.size());
        // System.out.println(Arrays.toString(strArr));
        return provisioning;
    }

}
