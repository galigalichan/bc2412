public class App {
    public static void main(String[] args) {
        // Foresee -> Avoid
        // 1. ArithmeticException: / by zero
        int q = 0;
        // int x = 10 / q;
        if (q != 0) {
            int x = 10 / q;
        } else {
            System.out.println("Q is zero.");
        }

        // Handle Exception
        try {
            int a = 10 / q; // Java by default throw exception for some scenario (i.e. / 0)
        } catch (ArithmeticException e) {
            System.out.println("Cannot be divided by zero.");
        }
        // Don't use try & catch if "if" can handle it.
        // Content in method() may change while arithmatic (e.g. x divided by zero is undefined) does not. 
        // Use try & catch if you cannot determine the input. (you are not the user.)

        // 2. NullPointerException (NPE)
        String s = null;
        // Avoid
        if (s != null) {
            System.out.println(s.charAt(0));
        }
        // System.out.println(s.charAt(0)); // error

        String result = null; // the scope of the variable "result" is in the main

        // try & catch
        try {
        result = concat("world", "abc"); // method caller
        } catch (IllegalArgumentException e) {
            // 1. catch class
            // 2. When something wrong happens within the try block
            System.out.println("Ignore the bomb.");
        }
        System.out.println(result);

        // 3. Integer.parseInt
        String input2 = "-3.";
        int x2 = 0;
        try {
        x2 = Integer.parseInt(input2); // from String to int
        } catch (NumberFormatException e) {
            x2 = -1;
        }
        System.out.println(x2); // -1

        // 4. java.lang.ArrayIndexOutOfBoundsException
        // Avoid
        String[] arr = new String[] {"abc", "def", "ijk"};
        // System.out.println(arr[3]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 5. java.lang.StringIndexOutOfBoundException
        String x3 = "hello";
        // System.out.println(x3.length());


        }

        public static String concat(String x, String y) { // x can be null
            if (x == null)
                throw new IllegalArgumentException(); // complain method input parameters
                // throw an object
            return x.concat(y);

        }

}
