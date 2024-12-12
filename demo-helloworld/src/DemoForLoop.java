public class DemoForLoop {
    public static void main(String[] args) {
        // 2^100
        int x = 2;
        x = x * 2;
        x *= 2;
        System.out.println(x);

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
            System.out.println(sum);
            // System.out.println(i); // ! i is declared within the for loop

        // sum up all odd numbers between 0 - 10
        int sum2 = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 1) {
                sum2 = sum2 + i;
            }
            }
                System.out.println(sum2);

        
    }
}


    
