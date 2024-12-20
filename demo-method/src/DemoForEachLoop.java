import java.util.Arrays;

public class DemoForEachLoop {
    public static void main(String[] args) {
        // for loop, while loop, for-each loop
        int[] arr = new int[] {3, 4, 5};
        
        // Just get one value for each iteration
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 3 + 4
        // 4 + 5
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + arr[i + 1]);
        }

        // for loop is prone to error (imagine there are 10000 lines)
        int temp = -1;
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.println(arr[i] + arr[i + 1]);
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr)); // [5, 4, 3]


        // for-each (preferred: higher readability)
        for (int integer: arr) { // Just get one value for each iteration
            System.out.println(integer); 
        }

        char[] arr2 = new char[] {'p', 't', 'e'};
        // for-each loop -> "pte"
        String str = "";
        for (char c: arr2) {
            str += c;
        }
        System.out.println(str); 

        String[] arr3 = new String[] {"abc", "ijk", "def"};
        String target = "ijk";
        // true
        for (String x: arr3) {
            if 
        }

    }
}
