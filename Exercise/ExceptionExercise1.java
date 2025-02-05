   import java.math.BigDecimal;
import java.util.Scanner;

public class ExceptionExercise1 {
  // Question: Write a program that divides two numbers provided by the user. Handle the
  // ArithmeticException when dividing by zero and display an appropriate message.

  // 1. If exception is caught, print "Error: Cannot divide by zero.", otherwise print "Result: X"
  // 2. No matter if the exception is caught, finally print ""Division operation completed.""
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter numerator: ");
    int numerator = scanner.nextInt();
    System.out.print("Enter denominator: ");
    int denominator = scanner.nextInt();

    // code here ...
    try {
      divide(numerator,denominator);
      System.out.println("Result: " + divide(numerator, denominator));
    } catch (ArithmeticException e) {
      System.out.println("Error: Cannot divide by zero.");
    } finally {
      System.out.println("Division operation completed.");
    }

    scanner.close();
  }

  public static double divide(int numerator, int denominator) {
    if (denominator == 0)
        throw new ArithmeticException(); // complain method input parameters
        // throw an object
    return BigDecimal.valueOf(numerator).divide(BigDecimal.valueOf(denominator)).doubleValue();

}

}

