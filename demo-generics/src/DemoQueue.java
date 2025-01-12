import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class DemoQueue {
    public static void main(String[] args) {
        // FIFO
        Queue<String> strings = new LinkedList<>(); // Queue restricts LinkedList so that head cannot add and tail cannot remove -> only add last and remove first
        strings.add("Oscar"); //addLast
        strings.add("Vincent"); //addLast
        strings.add("Lucas"); //addLast
        System.out.println(strings); // [Oscar, Vincent, Lucas]

        String head = strings.poll(); // removeFirst
        System.out.println(head); // Oscar
        System.out.println(strings); // [Vincent, Lucas]

        // strings.removeLast() 
        // Queue Interface hides lots of functions of LinkedList
        strings.remove(); // similar to poll(), but cannot return null
        System.out.println(strings.contains("Lucas")); // true

        // look up the head element, not pick up
        System.out.println(strings.peek()); // Lucas
        System.out.println(strings.size()); // 1
        strings.offer("Jenny");

        // ArrayBlockingQueue
        Queue<String> qq = new ArrayBlockingQueue<>(3); 
        System.out.println(qq.offer("ABC")); // true
        System.out.println(qq.offer("DEF")); // true
        System.out.println(qq.offer("IJK")); // true
        System.out.println(qq.offer("XYZ")); // false

        // for-each suppoers Queue
        for (String s : strings) {
            System.out.println(s); // Lucas Jenny
        }

        List<String> newStrings = new ArrayList<>();
        strings.add("AAA");
        strings.add("BBB");
        strings.addAll(newStrings);
        System.out.println(strings); // [Lucas, Jenny, AAA, BBB]
    }
}
