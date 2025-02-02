public record Book2(String name, double price) { // record does not support extends, implements
    // private String author;
    public static final double PI = 3.14;

    // public Book() {

    // }
    
    public void print() {
        System.out.println(name + price);
    }

    public static void main(String[] args) {
        Book2 b1 = new Book2("ABC", 10.5);
        System.out.println(b1.name()); // ABC
        System.out.println(b1.price()); // 10.5
        System.out.println(new Book2("ABC", 10.5).equals(b1)); // true
        System.out.println(new Book2("ABC", 10.5).hashCode()); // 1078168574
        System.out.println(b1.hashCode()); // 1078168574
        System.out.println(b1); // Book[name=abc, price=10.5]
        b1.print();

        // All-arg constructor ONLY
        // renamed getter
        // no setter (immutable)
        // Spport equals() and hashCode()
        // Support toString()
        // Support static variable / method
        // Support custom instance method
        // Do not support custom attribute
        // Do not support custom constructor

    }
}
