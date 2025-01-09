public class SelfExercise3 {
    public static void main(String[] args) {
        outerLoop: for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if ( i * j == 6) {
                    break outerLoop;
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }

        // i: 1, j: 1
        // i: 1, j: 2
        // i: 1, j: 3
        // i: 2, j: 1
        // i: 2, j: 2


        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i * j == 6) {
                    break;
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }

        // i: 1, j: 1
        // i: 1, j: 2
        // i: 1, j: 3
        // i: 2, j: 1
        // i: 2, j: 2
        // i: 3, j: 1


        String searchMe = "peter piper picked a peck of pickled peppers";
        int num = 0;

        for (int i = 0; i < searchMe.length(); i++) {
            if (searchMe.charAt(i) != 'p') {
                continue;
            }
            num++;
        }
        System.out.println("Found " + num + " p's in the string."); // Found 9 p's in the string.


        byte value = 127;

        for (int i = 0; i < 10; i++) {
            value++;
            System.out.println("value: " + value);
        }

        // value: -128
        // value: -127
        // value: -126
        // value: -125
        // value: -124
        // value: -123
        // value: -122
        // value: -121
        // value: -120
        // value: -119

    }
}
