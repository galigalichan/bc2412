import java.math.BigDecimal;

public class Item {
    private String productName;
    private double price;
    private int quantity;


public Item() { // empty constuctor

}

// first time
public Item(String productName, double price, int quantity) {
    this.productName = productName;
    this.price = price;
    this.quantity = quantity;
}

public String getProductName() {  // Since the field is private, you need a getter to access it
    return this.productName;
}

public double getPrice() {
    return this.price;
}

public int getQuantity() {
    return this.quantity;

}

// Setters allow modifications to objects.
public void setQuantity(int quantity) {
    this.quantity = quantity;
}

// instance method
public double totalAmount() {
    return BigDecimal.valueOf(this.price)
        .multiply(BigDecimal.valueOf(this.quantity))
        .doubleValue();
}


}
