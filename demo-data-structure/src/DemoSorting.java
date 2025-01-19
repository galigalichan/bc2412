import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoSorting {
    public static void main(String[] args) {
        // bubble sort (Nested Loop)

        List<Integer> integers = Arrays.asList(1, 3, 10, -4, 2);
        Collections.sort(integers); // why void (no return)? pass by reference
        System.out.println(integers); // [-4, 1, 2, 3, 10]

        int[] arr = new int[] {10, 2, 9};
        allZero(arr);
        System.out.println(Arrays.toString(arr)); // [0, 0, 0]

        // In Java, array & all custom types always pass by reference.
        // Primitive, wrapper class & Strings always pass by value (a copy of value)

        Book book = new Book("Sun");
        changeBookName(book); // pass by Book reference
        System.out.println(book); // Book[name= hello] // dangerous: people can sneak in and alter everything with the revealed object reference

        // Primitives or Wrapper Class
        int a = 3;
        int b = 4;
        System.out.println(sum(a, b)); // 300, passing a copy of values to the method
        System.out.println(a); // 3, but not 100, because we pass by value for primitives
        System.out.println(b); // 4, but not 200, because we pass by value for primitives

        // Sort String by Collections.sort()
        BigDecimal b1 = BigDecimal.valueOf(10);
        BigDecimal b2 = BigDecimal.valueOf(3);
        System.out.println(addBigDecimal(b1, b2).doubleValue()); // 13.0
        System.out.println(b1.doubleValue()); // 10.0 // b1 remains unaltered
        System.out.println(b2.doubleValue()); // 3.0 // b2 remains unaltered
    }

    public static int sum(int x, int y) {
        // what if there are 10000 lines...
        x = 100;
        y = 200;
        return x + y;
    }

    public static String concat(String x, String y) {
        return x.concat(y);
    }

    // overflow -> int + int -> int
    // long + long -> long -> Long
    public static Long multiply(int x, int y) {
        return (long) x * (long) y; // avoid overflow
    }

    public static void allZero(int[] arr) { // pass by object reference
    // public static int[] allZero(int[] arr) { // pass by object reference
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        // return arr;
    }

    public static void changeBookName(Book book) {
        book.setName("hello"); // pass by reference, but you provide a way for others to alter it
    }

    // BigDecimal? pass by value OR pass by reference? pass by reference
    // Similar to String (immutable: any changes would give a new BigDecimal object)
    public static BigDecimal addBigDecimal(BigDecimal original, BigDecimal delta) {
        // Can you revise the value inside a BigDecimal Object?
        return original.add(delta); // always return a new BigDecimal Object -> original cannot be altered




    }
            
}
