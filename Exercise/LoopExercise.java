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
      boolean found = false;
      String str7 = "ijkabcpodi";
      for (int i = 0; i < str7.length(); i++) {
        if (str7.charAt(i) == 'd') {
            found = true;}}
        
        if (found) {
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
      boolean isSubstring = false;
    
      for (int i = 0; i < s8a.length()-2; i++) {
        if (s8a.substring(i, i+3).equals(s8b)) {
        isSubstring = true;
        }
        else {
        isSubstring = false;
        }
        }
        if (isSubstring) {
          System.out.println("s8b is a substring.");
        } else {
          System.out.println("s8b is not a substring.");
        }
        
  
      // 9. Count the number of char value in the given String s9
      // print "count=2"
      // Use: for loop + if
      String s9 = "pampers";
      char c9 = 'p';
      int count9 = 0;
      for (int i = 0; i < s9.length(); i++) {
        if (s9.charAt(i) == c9) {
            count9 += 1;
        }
      } System.out.println("count="+count9);
  
      // 10. Replace all char value 'x' in the given String array by 'k'
      // Print arr10: ["akc", "kkk", "k", "kbk", "mkk"]
      // Use: for loop + replace method
      String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};

      for (int i = 0; i < arr10.length; i++) {
        arr10[i] = arr10[i].replace("x","k");
      }
      System.out.println(Arrays.toString(arr10));

      // 11. Count the number of Uppercase char value in the given string s11
      // Print "count uppercase=4"
      // Use: for loop + if
      String s11 = "kLKloOOu";
      char[] arr11 = s11.toCharArray();
      int countOfUpperCase = 0;
      
      for (int i = 0; i < arr11.length; i++) {
        if (arr11[i] - 'a' < 0) {
          countOfUpperCase++;
        }
      }

      System.out.println("count uppercase=" + countOfUpperCase);

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
      char[] arr13 = s13.toCharArray();
      int totalScore = 0;

      for (int i = 0; i < arr13.length; i++){
      switch (i) {
        case 'l':
          totalScore += 1;
        case 'r':
          totalScore += 3;
        case 'd':
          totalScore += 2;
        case 'u':
          totalScore += 4;
        default: //! else
          totalScore -= 1;
    }}

      System.out.println(totalScore);
      


      
      // 14. Assign the long values of 1, 4, 9, -4 to the given array arr14
      long[] arr14 = new long[4];
      arr14[0] = 1L;
      arr14[1] = 4L;
      arr14[2] = 9L;
      arr14[3] = -4L;
  
      // 15. Find the max value and min value in arr14
      // Use One Loop + if
      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      for (int i = 0; i < arr14.length - 1; i++) {
        if (arr14[i] > arr14[i+1]) {
            min = (int) arr14[i+1];
            arr14[i+1] = arr14[i];
            arr14[i] = min;
        } else {
            max = (int) arr14[i+1];
            arr14[i+1] = arr14[i];
            arr14[i] = max;
        }
      } System.out.println(min);
        System.out.println(max);
  
      // 16. Declare a float value (arr16) array with value 0.2, 0.3, 0.6
      float[] arr16 = new float[3];
      arr16[0] = 0.2f;
      arr16[1] = 0.3f;
      arr16[2] = 0.6f;
    
      // 17. Add value 0.1 to each of value in array arr16
      // Print: [0.3, 0.4, 0.7]
      // Use BigDecimal // Convert to double first

      double d160 = arr16[0];
      double d161 = arr16[1];
      double d162 = arr16[2];
      BigDecimal bd160 = BigDecimal.valueOf(d160);
      BigDecimal bd161 = BigDecimal.valueOf(d161);
      BigDecimal bd162 = BigDecimal.valueOf(d162);
      BigDecimal bd163 = BigDecimal.valueOf(0.1);
      double[] dArr16 = new double[] {bd160.doubleValue(), bd161.doubleValue(), bd162.doubleValue()};

      for (int i = 0; i < dArr16.length; i++) {
        dArr16[i] += bd163.doubleValue();
      }

      System.out.println(Arrays.toString(dArr16));
  
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
      char[] arr19 = new char[s19.length()];

      for (int i = 0; i < s19.length(); i++) {
        arr19[i] = s19.charAt(i);
      }
      
      // ['4','0','2','8','9']
      int minIndex = -1;
      int maxIndex = -1;
      int min19 = Integer.MAX_VALUE;
      int max19 = Integer.MIN_VALUE;
      for (int i = 0; i < arr19.length; i++) {
        if (arr19[i] > max19) {
          max19 = arr19[i];
          maxIndex = i;
        }
        if (arr19[i] < min19) {
          min19 = arr19[i];
          minIndex = i;
        }
      }
      // swap
      char temp19 = ' ';
      temp19 = arr19[maxIndex];
      arr19[maxIndex] = arr19[minIndex];
      arr19[minIndex] = temp19;

      System.out.println(arr19);
  
      // 20. Find the longest String in the String array
      // Print "longest=programming"
      String[] arr20 = new String[] {"python", "array", "programming", "java", "bootcamp"};
      String longestString = "";
      for (int i = 0; i < arr20.length - 1; i++) {
        if (arr20[i].length() > arr20[i+1].length()) {
            longestString = arr20[i];
        }
      }
      System.out.println("longest=" + longestString);

    }
  }