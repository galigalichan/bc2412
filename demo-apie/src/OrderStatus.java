public enum OrderStatus {
    PAID(1), READY_FOR_SHIP(2), DELIVERING(3), DELIVERED(4),;

    private final int value;

    private OrderStatus(int value) {
        this.value = value;
    }


    public OrderStatus next() {
        for (OrderStatus os : OrderStatus.values()) {
            if (os.value == this.value + 1)
            return os;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(OrderStatus.READY_FOR_SHIP.next()); // DELIVERING // toString()
        System.out.println(OrderStatus.READY_FOR_SHIP.next().name()); // DELIVERING
        System.out.println(OrderStatus.PAID.name()); // PAID

        System.out.println(OrderStatus.valueOf("PAID") == OrderStatus.PAID); // true

        System.out.println(OrderStatus.valueOf("paid") == OrderStatus.PAID);
        // java.lang.IllegalArgumentException

    }
}

