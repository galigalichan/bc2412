public class DemoRecursion {
    public static void main(String[] args) {
        //  1 + 2 + 3... + 10
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum); // 55

        // Recursion
        System.out.println(sum(10)); // 55

        int n = 8;
        int result = n % 2 == 1 ? product(n) : product(n-1); // better if not altering the flow of recursion -> set the critieria for odd numbers outside

        System.out.println(result); // 105
    }

        // 1 * 3 * 5 * 7 * .... * n

        public static int product(int n) {
            // base criteria (exit)
            if (n <= 1)
                return 1;
            // invoke myself
            return n * product(n - 2);
        }

        public static int sum(int value) {
            // base criteria (exit)
            if (value <= 1)
                return value;
            // invoke myself
            return value + sum(value - 1);
        }
    
}
