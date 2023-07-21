package intermediate.dayNine;

import java.util.HashMap;
import java.util.List;

public interface ProductRegistrationInterface {

    public boolean registerProduct();
    public void displayProduct(String id);
    public List<String> searchProduct(String id);
    public HashMap<String, String> statusProducts();
    
}
