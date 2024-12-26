public class Customer { // Person "has" name, age
    private long id;
    private Order[] orders; // Not object; just reference pointing to object

// 1. Normally Customer can be created without orders.
// public Customer(long id, Order[] orders) {
//     this.id = id;
//     this.orders = orders;
// }

public Customer(long id, Order[] orders) {
    this.id = id;
    this.orders = new Order[0]; // new order is an address
}

// order id -> item[] // order history
public Item[] getItem(long orderId) {

}
// totalOrderAmount by order id?
public double getTotalOrderAmount(long orderId) {

}
// isVip() -> 100_000 (total amount of all orders)
public boolean isVip() {

}


// 2. Customer can place order after creating the customer account.
public void placeOrder(Order order) {
    Order[] newOrders = new Order[this.orders.length + 1];
    for (int i = 0; i < this.orders.length; i++) {
        newOrders[i] = this.orders[i];
    }
    newOrders[newOrders.length - 1] = order;
    this.orders = newOrders;
}

// getOrder

public static void main(String[] args) {
    // Order[] orders = new Order[3];
    // orders[0] = new Order();
    // orders[1] = new Order();
    // orders[2] = new Order();
    c1.placeOrder(new Order());

    Item i1 = new Item("Chocolate", 90.0, 5);
    Item i2 = new Item("Chips", 12.50, 9);
    Item i3 = new Item("Cookies", 50, 4);
    Item i4 = new Item("Seaweed", 9.9, 12);
    Item i5 = new Item("Soft Candies", 18, 3);
    Item i6 = new Item("Granola Bar", 20.5, 6);

    Order o1 = new Order(001, new Item[] {i1, i2, i3});
    Order o2 = new Order(002, new Item[] {i4, i5});
    Order o3 = new Order(003, new Item[] {i6});

    Customer c1 = new Customer(001, new Order[] {o1, o2});
    



}





}

