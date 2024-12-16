public class JavaQuest6 {
    /**
   * Expected output:
   * 0 1 1 2 3 5 8 13 21 ...
   * 
   */
  public static void main(String[] args) {
    int first = 0, second = 1;
    // for loop to print first 15 numbers in Fibonacci Sequence

    int n = 15; // Number of Fibonacci numbers to generate
    int[] fibonacci = new int[n];

    // Initialize the first two numbers in the sequence
    fibonacci[0] = 0;
    fibonacci[1] = 1;

    // Generate the Fibonacci sequence
    for (int i = 2; i < n; i++) {
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
    }

    // Print the Fibonacci sequence
    for (int i = 0; i < n; i++) {
        System.out.print(fibonacci[i] + " ");
    }

  }
}
