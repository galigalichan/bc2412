import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DemoWhileLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        // ! While Loop vs For Loop
        int j = 0; // ! 1. declare the counter outside the loop
        while (j < 3) { // continue criteria
            System.out.println(j);
            j++; // ! 2. flexible to control the j // j = 1
            j++; // j = 2
            j++; // j = 3 -> stop
        }

        String s = "hello";
        char target = 'e';
        boolean found = false;
        // for
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target) {
                found = true;
                break;
        }
        }

        int k = 0;
        found = false;
        while (k < s.length()) {
            if (s.charAt(k) == target) {
                found = true;
                break;
            }
            k++;
            }
        System.out.println(found);

        // Random
        int number = new Random().nextInt(3); // 0-2
        System.out.println(number);

        int marksix = new Random().nextInt(49) + 1; // (0-48) + 1
        System.out.println(marksix);

        int[] marksixArr = new int[6];
        // check if duplicate exists
        int count = 0;
        int value = 0;
        while (count < 6) {
           value = (new Random().nextInt(49) + 1);
           if (!isDuplicated(marksixArr, value)) {
            marksixArr[count] = value;
            count++;
            }
            }
        System.out.println(Arrays.toString(marksixArr)); // random: [ , , , , , ]

        // ! Game Starts:
        // Please pick a number between 1 - 100
        // User: 4
        // Please pick a number between 5 - 100
        // User: 67
        // Please pick a number between 5 - 66
        // User: 47
        // Bomb!
        
        // While, Scanner, Random (Use While Loop instead because we do not know when it will stop)
        int min = 1;
        int max = 100;
        int bomb = new Random().nextInt(100) + 1; // 1-100
        int input = -1;
        Scanner scanner = new Scanner(System.in);
        while (bomb != input) {
            System.out.println("Please pick a number between " + min + " - " + max);
            input = scanner.nextInt();
            if (input < min || input > max)
                continue;
            // min, max
            if (input < bomb) {
                min = input + 1;    
            }   else {
                max = input -1;
            }
            }
            System.out.println("Bomb!");
            scanner.close();
            
    }
                
    public static boolean isDuplicated(int[] arr, int newValue) {
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] == newValue)
        return true;
        }
        return false;
            
    }   
}