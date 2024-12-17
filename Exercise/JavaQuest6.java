public class JavaQuest6 {
    /**
   * Expected output:
   * 0 1 1 2 3 5 8 13 21 ...
   * 
   */
  public static void main(String[] args) {
    int first = 0, second = 1;
    // for loop to print first 15 numbers in Fibonacci Sequence

    int n = 15;
    int[] fibonacci = new int[n];

    fibonacci[0] = 0;
    fibonacci[1] = 1;

    for (int i = 2; i < n; i++) {
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
    }

    for (int i = 0; i < n; i++) {
        System.out.print(fibonacci[i] + " ");
    }

  }
}
