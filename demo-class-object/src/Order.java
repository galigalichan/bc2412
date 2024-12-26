public class Order {
    private long orderId;
    private Item[] items;


public Order(long orderId, Item[] items) {
    this.orderId = orderId;
    this.items = new Item[0];
}

public void addItem(Item item) {


}

public void removeItem(Item item) {


}

public long getId() {
    return this.orderId;
}

public Item[] getItems() {
    return this.items;
}

// order.totalAmount
public double totalAmount() {


}


public void pickItem(Item item) {
    Item[] newItems = new Item[this.items.length + 1];
    for (int i = 0; i < this.items.length; i++) {
        newItems[i] = this.items[i];
        }
        newItems[newItems.length - 1] = item;
        this.items = newItems;
}



}