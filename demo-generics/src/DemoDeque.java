import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DemoDeque {
    
    public static void main(String[] args) {
        //
        Deque<String> strings = new LinkedList<>();
        strings.add("Lucas"); // addLast
        strings.add("Vincent");
        strings.add("Oscar");
        strings.addFirst("Jenny");
        System.out.println(strings); // [Jenny, Lucas, Vincent, Oscar]
        System.out.println(strings.poll()); // Jenny, pollFirst()
        System.out.println(strings.pollLast()); // Oscar
        System.out.println(strings.peek()); // Lucas, peekFirst
        System.out.println(strings.peekLast()); // Vincent

        // support for loop
        // support remove
        // contains

        // Practice ArrayDeque
        Deque<String> ss2 = new ArrayDeque<>();
        Deque<String> ss3 = new ArrayDeque<>();


    }
}
