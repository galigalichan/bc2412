import java.math.BigDecimal;
import java.util.Arrays;

public class LoopExercise {
    public static void main(String[] args) {
      // 1. Print 6 times hello
      // Use: for loop
      String x = "hello";
      for (int i = 0; i < 6; i++){
      System.out.println(x);}

      // 2. Expected output: "0,1,2,3,4"
      // Use: for loop
      int[] arr = new int[5];
      for (int i = 0; i < 5; i++) {
        arr[i] = i;
    }
        System.out.println(Arrays.toString(arr));
      
      // 3. Print even numbers between 2 and 20
      // Use: for loop + if
      for (int i = 2; i <= 20; i++) {
        if (i % 2 == 0) {
            System.out.println(i);   
        }
      }
  
      // 4. Print the numbers, which can be divided by 3 or 5
      // Use: for loop + if
      for (int i = 2; i <= 20; i++) {
        if (i % 2 == 0 && i % 3 == 0 || i % 5 == 0) {
            System.out.println(i);   
        }
      }

  
      // 5. Sum up the numbers between 0 and 15 and print it
      // Use: for loop
      int sum = 0;
      for (int i = 0; i < 16; i++) {
        sum += i;
      }
      System.out.println(sum);
  
      // 6. sum up all odd numbers betwen 0 - 10
      // Sum up all even numbers betwen 0 - 10
      // Find the product of evenSum and oddSum
      // Use: for loop + if
      int sumOfOdd = 0;
      int sumOfEven = 0;

      for (int i = 0; i <= 10; i++) {
        if (i % 2 == 1){
            sumOfOdd += i;
        }
      }

      for (int i = 0; i <= 10; i++) {
        if (i % 2 == 0){
            sumOfEven += i;
        }
      }

      int product = sumOfOdd * sumOfEven;
      System.out.println(product);
  
      // 7. Check if 'd' exists in the string.
      // print "d is found."
      // otherwise, print "d is not found."
      int count = 0;
      String str7 = "ijkabcpodi";
      for (int i = 0; i < str7.length(); i++) {
        if (str7.charAt(i) == 'd') {
            count += 1;}}
        
        if (count > 0) {
        System.out.println("d is found.");}
        else {
        System.out.println("d is not found.");    
        }

      // 8. Check if the string s8b is a substring of s8a
      // print "s8b is a substring."
      // otherwise, print "s8b is not a substring."
      // Use: for loop + if + substring method
      String s8a = "abcba";
      String s8b = "cba";
    
      for (int i = 0; i < s8a.length()-2; i++) {
        if (s8a.substring(i, i+3) == s8b) {
        System.out.println("s8b is a substring.");
        break;}
        else {
        System.out.println("s8b is not a substring.");
        break;
        }
        }

  
      // 9. Count the number of char value in the given String s9
      // print "count=2"
      // Use: for loop + if
      String s9 = "pampers";
      char c9 = 'p';
      int count2 = 0;
      for (int i = 0; i < s9.length(); i++) {
        if (s9.charAt(i) == c9) {
            count2 += 1;
        }
      } System.out.println("count="+count2);
  
      // 10. Replace all char value 'x' in the given String array by 'k'
      // Print arr10: ["akc", "kkk", "k", "kbk", "mkk"]
      // Use: for loop + replace method
      String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};

  
      // 11. Count the number of Uppercase char value in the given string s11
      // Print "count uppercase=4"
      // Use: for loop + if
      String s11 = "kLKloOOu";
    

  
      // 12. Print the following pattern of * value
      // *****
      // *****
      // *****
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 5; j++) {
            System.out.print("*");
        }
            System.out.println("");
      }
      
  
      // 13. Given a string value s13, each of the char value has its score.
      // Calculate the total score
      // Use: switch + for loop
  
      // l -> 1 score
      // r -> 3 score
      // d -> 2 score
      // u -> 4 score
      // for other character, -1 score
      String s13 = "lrlaudbucp";


      
      // 14. Assign the long values of 1, 4, 9, -4 to the given array arr14
      long[] arr14 = new long[4];
      arr14[0] = 1L;
      arr14[1] = 4L;
      arr14[2] = 9L;
      arr14[3] = -4L;
  
      // 15. Find the max value and min value in arr14
      // Use One Loop + if
      int temp = 0;
      for (int i = 0; i < arr14.length - 1; i++) {
        if (arr14[i] > arr14[i+1]) {
            temp = (int) arr14[i+1];
            arr14[i+1] = arr14[i];
            arr14[i] = temp;
        }
      } System.out.println(temp);
  
      // 16. Declare a float value (arr16) array with value 0.2, 0.3, 0.6
      float[] arr16 = new float[3];
      arr16[0] = 0.2f;
      arr16[1] = 0.3f;
      arr16[2] = 0.6f;
  
      // 17. Add value 0.1 to each of value in array arr16
      // Print: [0.3, 0.4, 0.7]
      // Use BigDecimal
      for (int i = 0; i < 3; i++) {
        arr16[i] += 0.1f;
      }
      System.out.println(Arrays.toString(arr16));
  
      // 18. Count the number of target strings in the String[]
      String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
      String target = "Tommy";
      // Print "count name=2"
      int countName = 0;
      for (int i = 0; i < arr18.length; i++) {
        if (arr18[i] == target) {
            countName++;}
      } System.out.println("count name=" + countName);

      // 19. swap the max digit and min digit
      // Assumption: each digit value appear once in the String
      // Print: "49280"
      String s19 = "40289";
      for (int i = 0; i < s19.length(); i++) {
        
      }
      
  
      // 20. Find the longest String in the String array
      // Print "longest=programming"
      String[] arr20 = new String[] {"python", "array", "programming", "java", "bootcamp"};
      for (int i = 0; i < arr20.length - 1; i++) {
        if (arr20[i].length() > arr20[i+1].length()) {
            arr20[i+1] = arr20[i];
        }
      }
      System.out.println("longest=" + arr20[4]);

    }
  }