import java.math.BigDecimal;

public class Order {
    private long orderId;
    private Item[] items; // address / reference -> item[] array


public Order(long orderId) {
    this.orderId = orderId;
    this.items = new Item[0];
}

public void addItem(Item item) {
    Item[] newArr = new Item[this.items.length + 1];
    for (int i = 0; i< this.items.length; i++) {
        newArr[i] = this.items[i];
    }
    newArr[newArr.length - 1] = item;
    this.items = newArr;

}

public void removeItem(Item item) {
    // resize array -> -1
    // this.items -> Item array object
    // this.items[i] -> Item object
    Item[] newArr = new Item[this.items.length - 1];
    int idx = 0;
    int countTarget = 0;
    for (int i = 0; i < this.items.length; i++) {
        if (this.items[i].equals(item) && countTarget == 0) { // remove the item that has never appeared = the first occurrence
            countTarget++;
            continue; // skip copying this 
        }
        newArr[idx++] = this.items[i]; // copy
        }
        this.items = newArr;
}

public long getId() {
    return this.orderId;
}

public Item[] getItems() {
    return this.items;
}

// Order order = new Order(items);
// order.totalAmount();
public double totalAmount() {
    // 0.0 + 10.3 (new BigDecimal Object) -> 10.3 (new BigDecimal Object)
    // 10.3 + 7.7 (new BigDecimal Object) -> 18.0 (new BigDecimal Object)
    BigDecimal total = BigDecimal.valueOf(0.0);
    for (Item item: items) {
        total = total.add(BigDecimal.valueOf(item.totalAmount()));
    }
    return total.doubleValue();
}


}