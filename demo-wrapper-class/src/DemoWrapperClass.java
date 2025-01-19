public class DemoWrapperClass {
    public static void main(String[] args) {
        int x = 3; // x is a Primitive Type variable
        Integer x2 = x; // auto-box
        System.out.println(x2); // 3
        System.out.println(x2.doubleValue()); // 3.0
        System.out.println(x2.longValue()); // 3, "L" cannot be attached to a variable.
        System.out.println(x2); // 3

        String s = "hello";
        System.out.println(s.length()); // 5

        double d = 3.3;
        Double d2 = d; // auto-box
        System.out.println(d2); // 3.3
        System.out.println(d2.intValue()); // 3
        float f = d2.floatValue();
        System.out.println(f); // 3.3

        double d3 = d2; // un-box
        double d4 = d2.doubleValue();

        // char -> Character

        // byte -> Byte
        // short -> Short
        // long -> Long
        // float -> Float

        char c1 = 'a';
        Character c2 = c1; // auto-box
        System.out.println(c2.compareTo(('a'))); // 0
        // 0 -> Equals
        Character c3 = 'c';
        System.out.println(c3.compareTo(('a'))); // 2 (ascii of 'c' > ascii of 'a')
        Character c4 = 'A';
        System.out.println(c4.compareTo(('a'))); // -32 (ascii of 'A' < ascii of 'a')

        int asciiOfA = 'A';
        int asciiOfa = 'a';
        System.out.println(asciiOfa - asciiOfA); // 32
        System.out.println('a' - 'A'); // 32, char value - char value -> int value - int value

        char c5 = c4; // un-box
        System.out.print(c5); // A

        // boolean -> Boolean
        boolean b1 = false;
        Boolean b2 = b1;
        System.out.println(b2); // false

        boolean b3 = b2; // un-box
        System.out.println(b3); // false

        byte x3 = 4;
        Byte x4 = x3;
        System.out.println(x4);

        short x5 = 120;
        Short x6 = x5;
        System.out.println(x6);

        long x7 = 99999999;
        Long x8 = x7;
        System.out.println(x8);

        float f2 = 3.3f;
        Float f3 = f2;
        System.out.println(f3);


        Integer intNum1 = Integer.valueOf(42);
        Integer intNum2 = Integer.valueOf(42);
        System.out.println(intNum1 == intNum2); // true // Integer cache is used (range from -128 to 127)
        System.out.println(intNum1.equals(intNum2)); // true

        Integer intNum3 = Integer.valueOf(150);
        Integer intNum4 = Integer.valueOf(150);
        System.out.println(intNum3 == intNum4); // false // Integer cache is not used (out of the cache range)
        System.out.println(intNum3.equals(intNum4)); // true
    






    }
}
