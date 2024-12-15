public class DemoForLoop {
    public static void main(String[] args) {
        // 2^100
        int x = 2;
        x = x * 2;
        x *= 2;
        System.out.println(x); // 8

        // For Loop
        // ! for ( ; ; ) {
        // }

        // "i < 3" -> continue criteria
        // "i++" -> modifier
        // ! You have to let the modifier work with "continue criteria"
        // ! so that the continue criteria at the end becomes false.
        for (int i = 0; i < 3; i++) { // 3 - 0; looped three times
            System.out.println("hello");
        }
        // Step 1: int i = 0;
        // Step 2: i < 3 (question) -> true
        // Step 3: if true, print hello
        // Step 4: i++, i become 1
        // Step 5: 1 < 3 (question) -> true
        // Step 6: if true, print hello
        // Step 7: i++, i become 2
        // Step 8: 1 < 3 (question) -> true
        // Step 9: if true, print hello
        // Step 10: i++, i become 3
        // Step 11: 1 < 3 (question) -> false
        // Step 12: exit for loop

        for (int i = 0; i < 5; i++) { // 0,1,2,3,4
            System.out.println(i);
        } 

        // print even numbers
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) { // even number definition
                System.out.println(i);
            }
        }

        // print 0 - 100, can be divided by 3 and divided by 4
        // for + if
        for (int i = 0; i < 101; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
        }
    }

        // sum up 0 - 20: 0 + 1 + 2... + 20
        int sum = 0;
        for (int i = 0; i <= 20; i++) {
            sum = sum + i;
        }
            System.out.println(sum); // 210
            // System.out.println(i); // ! i is declared within the for loop

        // sum up all odd numbers between 0 - 10
        // sum up all even numbers between 0 - 10
        // ! Find the difference between evenSum and oddSum -> positive number 
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 1)
                oddSum += i;
            else
                evenSum += i;
            }
        
        // int diff = -1;
        // if (oddsum > evensum) {
        //    diff = oddsum - evensum;
        // } else {
        //    diff = evensum - oddsum;
        //}
            int diff = oddSum > evenSum ? oddSum - evenSum : evenSum - oddSum;
            System.out.println(diff); // 5

        // Searching
        String str = "abcdefijk";

        // 1. Check if 'd' exists in the string.
        // for loop + if + charAt
        boolean found = false; //assume 'd' cannot be found
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'd') {
                found = true;
                break; // break the nearest loop
            }
        }
            System.out.println(found);
        
        
        // Test case:
        // 1. "abcdefijk"
        // 2. "abcefijk"
        // 3. ""
        // 4. "abcdefijkd"

        // 2. Check if the string value contains given substring
        String substr = "loq";
        String str2 = "hello";
        // hel vs loq
        // ell vs loq
        // llo vs loq
        // lo  vs loq

        // for loop + substring
        boolean isSubstringExist = false;
        for (int i = 0; i < str2.length() - substr.length() + 1; i++) {
            if (str2.substring(i, i + substr.length()).equals(substr) ) { // String equals string
                isSubstringExist = true;
                break;
            }
        }
        System.out.println(isSubstringExist); // true

        // Counting
        int count = 0;
        String s = "hello";
        // Count the number of 'l'
        // for + if
        for (int i = 0; i <s.length(); i++) { // length() in case of empty string; loop all values + filtering
            if (s.charAt(i) == 'l') {
                count++; // break does not apply here because you have to check till the last character
            }
        }
        System.out.println(count); // 2

        // continue - skip the rest, go to next iteration
        count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'l') {
                continue; // skip count++, go to i++
            }
            count++;
        }
        System.out.println(count); // 2

        // 1 - 100, print all numbers which can be divided by 3 and 4
        // must use continue
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 4 != 0 // event 1
            || i % 4 == 0 && i % 3 != 0 // event 2
            || i % 3 != 0 && i % 4 != 0) // event 3
            {
                continue; // skip print
            }
            System.out.println(i);
        }

        // Nested Loop
        for (int i = 0; i < 3; i++) { // outer loop
            for (int j = 0; j < 4; j++) { // inner loop
                // System.out.println("*"); // print and next line
                System.out.print("*"); // print
            }
        }
        System.out.println();
        // ! Step 1: i = 0, j = 0, print *
        // Step 2: i = 0, j = 1, print *
        // Step 3: i = 0, j = 2, print *
        // Step 4: i = 0, j = 3, print *
        // ! Step 5: i = 1, j = 0, print *
        // Step 6: i = 1, j = 1, print *
        // Step 7: i = 1, j = 2, print *
        // Step 8: i = 1, j = 3, print *
        // ! Step 9: i = 2, j = 0, print *
        // Step 10: i = 2, j = 1, print *
        // Step 11: i = 2, j = 2, print *
        // Step 12: i = 2, j = 3, print *

        //*
        //**
        //***
        //****

        int n = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //    *
        //   ***
        //  *****
        // *******

    

    }
}

    
