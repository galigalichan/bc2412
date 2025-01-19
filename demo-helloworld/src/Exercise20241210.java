public class Exercise20241210 { 
    public static void main(String[] args) {
        double priceOfApple = 7.3;
        double priceOfOrange = 6.5;
        int quantityOfApple = 3;
        int quantityOfOrange = 4;

        double totalAmount = 7.3 * 3 + 6.5 * 4;
        System.out.println(totalAmount);//

        int mathScore = 73;
        int englishScore = 60;
        int historyScore = 61;
        
        double averageScore = (73 + 60 + 61) / 3.0;
        System.out.println(averageScore); // 64.6666

        // byte -> short -> int -> long
        byte maxByte = 127;

        // int value -> byte
        maxByte = (byte) (maxByte - 2); // Java: is it safe? Not safe
        // byte value + int value => int value
        // can we assign int value to byte variable? (downcasting)

        System.out.println(maxByte); // 125

        int x = maxByte; // Java:: is it safe? it is safe

        // ! Java: (1) Compile time + (2) Run time
        // (1) java file (.java) -> class file (.class): java code (~human code) -> byte code (~machine code)
        // (1.1) compile fail. for example (missing ; -> syntax error)
        // (1.2) compile success -> class file
        // (2) Java Virtual Machine (JVM) -> convert class file to machine code -> execute machine mode


        byte b = 127;
        short s = 32767;
        int j = 2147483647;
        byte maxByte2 = 126 + 1;
        System.out.println(maxByte2); // 127
        byte maxByte3 = (byte) (126 + 2);
        System.out.println(maxByte3); // -128, overflow

        byte value = 127;
        for (int i = 0; i < 10; i++) {
            value++;
            System.out.println("Value: " + value);
        }
        // Value: -128  (i = 0)
        // Value: -127  (i = 1)
        // Value: -126  (i = 2)
        // Value: -125  (i = 3)
        // Value: -124  (i = 4)
        // Value: -123  (i = 5)
        // Value: -122  (i = 6)
        // Value: -121  (i = 7)
        // Value: -120  (i = 8)
        // Value: -119  (i = 9)
    }
}
