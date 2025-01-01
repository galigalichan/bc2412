public class DemoString {
    public static void main(String[] args) {
        String s = "hello"; // leverage Literal Pool
        String s2 = "hello"; // leverage Literal Pool
        String s3 = s; // s3 and s pointing to the same object
        String s4 = "hello!";
        String s5 = new String("hello");
        String s6 = String.valueOf("hello"); //Leverage literal pool. Simplify method signature instead of valueOfFromDouble / valueOfFromFloat ...
        String s7 = new String("hello");

        // identityHashCode -> Object reference (address)
        System.out.println(System.identityHashCode(s)); // 1933863327
        System.out.println(System.identityHashCode(s3)); // 1933863327
        System.out.println(System.identityHashCode(s2)); // 1933863327
        System.out.println(System.identityHashCode(s4)); // 112810359
        System.out.println(System.identityHashCode(s5)); // 1128103594
        System.out.println(System.identityHashCode(s6)); // 1933863327
        // six pointers, two "hello"s, one "hello!"
        System.out.println(System.identityHashCode(s7)); // 146589023
        // By default, Java does not create new objects if it detects the same ones in order to preserve memory.

        // equals(), ==
        // If you use "==" for non-primitive, you are checking the object reference
        // Besides, s.equals() is checking the String value itself.
        System.out.println(s == s2); // true
        System.out.println(s.equals(s2)); // true

        System.out.println(s == s5); // false
        System.out.println(s.equals(s5)); // true

        System.out.println(s5 == s7); // false
        
        // String is immutable. (Purpose: Reduce risk)
        // Question: after appending "?", is "s" still the same object? No
        s = s + "?";
        System.out.println(System.identityHashCode(s)); // 349885916



        
    }
}
