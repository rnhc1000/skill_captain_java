package intermediate.dayEight;

public class UserData {

    // private Integer id;
    private String name;
    private String emailAddress;
    private String password;
    private String shippingAddress;

    // public UserData(Integer id, String name, String emailAddress, String password, String shippingAddress) {
    //     this.id = id;
    //     this.name = name;
    //     this.emailAddress = emailAddress;
    //     this.password = password;
    //     this.shippingAddress = shippingAddress;
    // }

    public UserData(String name, String emailAddress, String password, String shippingAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.password = password;
        this.shippingAddress = shippingAddress;
    }

    public UserData() {
    }


    // public void setId(Integer id) {
    //     this.id = id;
    // }

    // public Integer getId() {
    //     return this.id;
    // }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

 
    @Override
    public String toString() {
        return "UserData [name=" + name + ", emailAddress=" + emailAddress + ", password=" + password
                + ", shippingAddress=" + shippingAddress + "]";
    }

    

    
    
    
}
