
public class OrderService{
    public void placeOrder(Product product,int quantity) throws InvalidQuantityException,OutOfStockException{
        if(quantity<=0){
            throw new InvalidQuantityException("Invalid quantity");
        }
        if(quantity>product.getAvailableStock()){
            System.out.println("Order Failed!");
            throw new OutOfStockException("Reason: Out of stock. Available stock: "+product.getAvailableStock());
        }
        product.setAvailableStock(product.getAvailableStock()-quantity);

    }
}


class InvalidQuantityException extends Exception{
    InvalidQuantityException(String mess){
        super(mess);
    }

}

class OutOfStockException extends Exception{
    OutOfStockException(String mess){
        super(mess);
    }
}