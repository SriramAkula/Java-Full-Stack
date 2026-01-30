
public class Product {
    private int productId;
    private String productName;
    private int availableStock;

    Product(int productId,String productName,int availableStock){
        this.productId=productId;
        this.productName=productName;
        this.availableStock=availableStock;
    }

    public int getAvailableStock() {
        return availableStock;
    }
    public int getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setAvailableStock(int availableStock) {
        this.availableStock = availableStock;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
}
