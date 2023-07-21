package intermediate.dayTen;

public interface CartInterface {
    
public boolean addToCart(Product product);
public boolean removeFromCart(Product product);
public boolean updateQuantity(Product product, int quantity);
public boolean viewCart();
public boolean checkout();

}
