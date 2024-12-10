public class Exercise20241210z {
    public static void main(String[] args) {
        byte b222 = -128;
        short s222 = -32768;
        int x222 = -2147483648;
        
        int total = b222 + s222 + x222;
        System.out.println(total);

        int total2 = b222 - s222 - x222;
        System.out.println(total2);

        int total3 = b222 * s222 / x222;
        System.out.println(total3);

        double total4 = b222 / s222 * x222;
        System.out.println(total4);

        //byte total5 = b222 + s222 + x222;
        //System.out.println(total5);

        float f5 = 14.44444444444444444444444f;
        double d5 = f5;
        System.out.println(d5);

        double d6 = 0.2 * 0.4;
        System.out.println(d6);

        double bmi = 22.8;
        boolean isFat = bmi > 22;
        System.out.println("The statement that Mary is fat is " + isFat);

        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);

        int dividend = 98;
        int divider = 6;
        int remainder = dividend % divider;
        System.out.println("The remainder is: " + remainder);

        byte minByte = -128;
        minByte = (byte) (minByte -1);
        System.out.println(minByte);
        byte minByte2 = -128 + 1;



    }
}