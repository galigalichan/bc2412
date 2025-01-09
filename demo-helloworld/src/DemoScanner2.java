import java.util.Scanner;

public class DemoScanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your month of birth: ");
        int month = scanner.nextInt();

        System.out.println("Age: " + age);
        System.out.println("Month of birth: " + month);

        scanner.close();
    }
}
