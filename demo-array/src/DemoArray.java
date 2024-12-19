import java.util.Arrays;

public class DemoArray {
    public static void main(String[] args) {
        int x1 = 3;
        int x2 = 10;
        int x3 = 11;

        // declare array
        int[] arr = new int[3];
        // assign value to array
        arr[0] = 3;
        arr[1] = 10;
        arr[2] = 11;

        // for loop -> read array values
        // Print all values, which >= 10
        for (int i = 0; i < arr.length; i++) { // i = 0,1,2
            if (arr[i] >= 10) {
                System.out.println(arr[i]);
            }
        }

        // declare double array, length = 5
        // assign value -> 10.4, 4.3, 3.3, 1.9, 9.9
        // sum up all values in the double array
        double[] arr2 = new double[5];
        arr2[0] = 10.4;
        arr2[1] = 4.3;
        arr2[2] = 3.3;
        arr2[3] = 1.9;
        arr2[4] = 9.9;

        double sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum = sum + arr2[i];
        }
        System.out.println(sum);

        // "abc", "def", "ijk"
        // "abc"
        String[] arr3 = new String[3];
        arr3[0] = "abc";
        arr3[1] = "def";
        arr3[2] = "ijk";

        String target = "abc";
        boolean isTargetExist = false;
        for (int i = 0; i < arr3.length; i++) {
            if (target.equals(arr3[i])) {
                isTargetExist = true;
            }
            System.out.println(isTargetExist); // true
        }

        char[] arr4 = new char[] { 'b', 'c', 'a', };
        // arr4[0] = 'b';
        // arr4[1] = 'c';
        // arr4[2] = 'a';

        int[] ascii = new int[arr4.length];
        for (int i = 0; i < arr4.length; i++) {
            ascii[i] = arr4[i]; // char value (arr4[i]) -> int variable (ascii[i])
        }
        for (int i = 0; i < ascii.length; i++) {
            System.out.println(ascii[i]);
        }

        // convert the char value to int value, and then assign them to a new int array
        // 98, 99, 97

        // Find the max ascii value in the int array
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ascii.length; i++) {
            if (ascii[i] > max) {
            max = ascii[i];}}

        // Step 1: i = 0, 98 > MIN_VALUE -> True -> Put 98 to max
        // Step 2: i = 1, 99 > 98 -> True -> Put 99 to max
        // Step 3: i = 1, 97 < 99 -> False -> exit
        System.out.println(max); // 99

        // Find the min value in the int array
        int[] arr5 = new int[] {9, -8, -99, 98};
        int min = Integer.MAX_VALUE; // int max value
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] < min) {
            min = arr5[i];}}

        // Step 1: i = 0, 9 < MAX_VALUE -> True -> Put 9 to min
        // Step 2: i = 1, -8 < 0 -> True -> Put -8 to min
        // Step 3: i = 2, -99 < -8 -> True -> Put -99 to min
        // Step 4: i = 3, 98 < -99 -> False -> exit
        System.out.println(min); // -99

        // sum
        int[] arr6 = new int[] {9, -8, -99, 98};
        int sum2 = 0;
        for (int i = 0; i < arr6.length; i++) {
            sum2 = sum2 + arr6[i];}
            System.out.println(sum2);

        // swap
        int left = 7;
        int right = 9;
        int temp = left; // backup left
        left = right;
        right = temp;
        System.out.println(left); // 9
        System.out.println(right); // 7

        // array
        int[] arr8 = new int[] {9, -8, 109, 99 ,98};
        // print 1 (9 + -8)
        // print 101 (-8 + 109)
        // ...
        // print 197 (99 +98)
        int sum3 = 0;
        for (int i = 0; i < arr8.length -1; i++) {
            sum3 = arr8[i] + arr8[i+1];
            System.out.println(sum3);}

        
        // array swap
        int[] arr7 = new int[] {9, -8, 109, 99 ,98};
        // move max value to the tail
        // for loop + swap
        // 9, -8, 109, 99, 98
        // -8, 9, 109, 99, 98
        // -8, 9, 99, 109, 98
        // -8, 9, 99, 98, 109
        for (int i = 0; i < arr7.length - 1; i++) {
            if (arr7[i] > arr7[i + 1]) {
              temp = arr7[i];
              arr7[i] = arr7[i + 1];
              arr7[i + 1] = temp;
            }
          }
          System.out.println(Arrays.toString(arr7)); // [x, x, x, x, 109]

        Integer [] arr11 = new Integer [] {9, 6, 4};
        // Products for all numbers
        int product = 1;
        for (int i = 0; i < arr11.length; i++) {
            product *= arr11[i];
        }
            System.out.println(product); // 216

        double [] prices = new double [] {8.2, 6.5, 10.5};
        int [] quantities = new int [] {9, 8, 3};
        // 8.2 x 9 + 6.5 x 8 + 10.5 x 3
        double totalAmount = 0.0;
        for (int i = 0; i < prices.length; i++) {
            totalAmount += prices[i] * quantities[i];}
            System.out.println(totalAmount); // 157.3

        String s = String.valueOf(123);
        System.out.println(s); // "123"
        s = String.valueOf(true);
        System.out.println(s); // "true"

        System.out.println(String.valueOf('A')); // "A"

        Integer i1 = Integer.valueOf("123");
        System.out.println(i1); // 23

        // Integer i2 = Integer.valueOf("h"); // java.lang.NumberFormatException

        // "hello" -> 'h' 'e' 'l' 'l' 'o'
        char [] chArr = "hello".toCharArray();
        // olleh
        char cTemp;
        for (int i = 0; i < chArr.length / 2; i++) {
        // chArr[i] vs chArr[chArr.length-i]
        cTemp = chArr[i];
        chArr[i] = chArr[chArr.length -1 - i];
        chArr[chArr.length -1 -i] = cTemp;
        }
        String result = "";
        for (int i = 0; i < chArr.length; i++)
        result += chArr[i];
        System.out.println(result); // olleh
    
        // h -> i, e -> f, l -> m, o -> p // encryption
        // ifmmp
        chArr = "hello".toCharArray(); // for swap
        for (int i = 0; i < chArr.length; i++) {
            chArr[i] = (char) (chArr[i] + 1);
            }
            System.out.println(String.valueOf(chArr)); // "ifmmp", char Array -> String
        
        // assume we have small letters ONLY: 26
        char[] arr12 = new char [] {'p', 'a', 'p', 'b', 'a', 'p'};
        char maxNumChar = ' ';
        //
        int [] counters = new int[26];
        for (int i = 0; i < arr12.length; i++) {
            counters[arr12[i] - 'a']++; // = counters[arr12[i] - 'a'] + 1
        }
        for (int i = 0; i < counters.length; i++) {
            System.out.println(counters[i]); // show the number of occurrence of all 26 alphabets
        }
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < counters.length; i++) {
            // max2 = Math.max(counters[i], max2);
            if (counters[i] > max2) {
                maxNumChar = (char) (i + 97);
                max2 = counters[i];
            }
        }
        System.out.println(maxNumChar); // p

        //
        int[] arr20 = new int[] {20, -20, 90, 50, -40};
        // Sorting without creating a new array
        // Move the max value to tail
        // Step 1: [X, X, X, X, 90]
        // Step 2: [X, X, X, 50, 90]
        // Step 3: [X, X, 20, 50, 90]
        // Step 4: [X, -20, 20, 50, 90]
        // Step 5: [-40, -20, 20, 50, 90]

        for (int i = 0; i < arr20.length - 1; i++) { // one loop can only swap one item
            for (int j = 0; j < arr20.length - 1; j++) {
            if (arr20[j] > arr20[j + 1]) {
                temp = arr20[j + 1];
                arr20[j + 1] = arr20[j];
                arr20[j] = temp;
            }
            }

        }

        System.out.println(Arrays.toString(arr20)); // {-40, -20, 20, 50, 90}


    }
}