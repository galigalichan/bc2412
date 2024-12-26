import java.math.BigDecimal;

public class Item {
    private String productName;
    private double price;
    private int quantity;

public Item(String productName, double price, int quantity) {
    this.productName = productName;
    this.price = price;
    this.quantity = quantity;
}

public String getProductName() {
    return this.productName;
}

public double getPrice() {
    return this.price;
}

public int getQuantity() {
    return this.quantity;

}

public void setQuantity (int quantity) {
    this.quantity = quantity;
}

// instance method
public double itemSubtotal() {
    return BigDecimal.valueOf(this.price).multiply(BigDecimal.valueOf(this.quantity)).doubleValue();
}

public static void main(String[] args) {


  
}





}
