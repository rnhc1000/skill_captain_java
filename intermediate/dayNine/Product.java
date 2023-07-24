package intermediate.dayNine;

public class Product {

    private String  productId;
    private String  productName;
    private String  description;
    private String  manufacturer;
    private Integer warrantyPeriod;

    public Product() {
    }

    public Product(String productId,
            String productName,
            String description,
            String manufacturer,
            Integer warrantyPeriod) {

        this.productId = productId;
        this.productName = productName;
        this.description = description;
        this.manufacturer = manufacturer;
        this.warrantyPeriod = warrantyPeriod;

    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(Integer warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((productId == null) ? 0 : productId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (productId == null) {
            if (other.productId != null)
                return false;
        } else if (!productId.equals(other.productId))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Product [productId=" + productId + ", productName=" + productName + ", description=" + description
                + ", manufacturer=" + manufacturer + ", warrantyPeriod=" + warrantyPeriod + "]";
    }
    
    
    
}
