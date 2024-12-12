import java.util.Scanner;

// Java Project (load built-in tools, String, Primitives)
// proactviely import non-built-in tools (Scanner)
public class DemoScanner {
    public static void main(String[] args) {
        String s = "abc";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number:");
        int day = scanner.nextInt(); // scanner.next
        // num = num * 2;
        // System.out.println("num=" + num); // String + int -> String

        // scanner.nextLine();

        // System.out.println("Please input a String:");
        // String str = scanner.nextLine();
        // System.out.println("str=" + str);

        //for (int i = 0; i < num ; i++) {
        //    System.out.println("hello");
        // }

        // num -> number of days
        // for loop
        int totalMinutes = 0;
        int hour = 24;
        for (int i = 0; i < day; i++) {
            for ( int j = 0; j < hour; j++)
            totalMinutes += 60;
        }
        System.out.println(totalMinutes);




    }
}