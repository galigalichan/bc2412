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




        
    }
}