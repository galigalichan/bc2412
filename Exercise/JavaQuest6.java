public class JavaQuest6 {
    /**
   * Expected output:
   * 0 1 1 2 3 5 8 13 21 ...
   * 
   */
  public static void main(String[] args) {
    int first = 0, second = 1;
    // for loop to print first 15 numbers in Fibonacci Sequence

    int count = 0;
    System.out.println(first);
    System.out.println(second);
    for (int i = 0; count < 15; i++) {
      i += i;
    System.out.println(i);
    count++;}

  }
}
