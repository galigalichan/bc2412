import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DemoThread5 {
    private Map<Integer, String> map; // HashMap is not thread-safe

    public DemoThread5() {
        // this.map = new HashMap<>(); // HashMap = Array + LinkedList
        // this.map = Collections.synchronizedMap(new HashMap<>());
        this.map = new Hashtable<>(); // HashTable
        // this.map = new ConcurrentHashMap<>(); // try different data structures
    }

    public String put(Integer key, String value) {
        return this.map.put(key, value);
    }

    public int size() {
        return this.map.size();
    }


    public static void main(String[] args) {
        // put (i, )
        DemoThread5 central = new DemoThread5();
        Runnable putEntryTask1 = () -> {
        for (int i = 0; i < 1_000_000; i++) {
            central.put(i, "abc");
            }
        };

        Runnable putEntryTask2 = () -> {
        for (int i = 1_000_000; i < 2_000_000; i++) {
            central.put(i, "abc");
            }
        };

        Thread workerB = new Thread(putEntryTask1);
        workerB.start(); // main thread initializes another thread (workerB) to execute the task
        // The workerB executes the task ONLY.

        Thread workerC = new Thread(putEntryTask2);
        workerC.start(); // main thread initializes another thread (workerC)

        // Main Thread
        try {
            workerB.join(); // main thread waits until workerB completes the task
            workerC.join(); // main thread waits until workerC completes the task
        } catch (InterruptedException e) {

        }

        System.out.println(central.size());
        // 16XXXX (by HashMap)
        // 200000 (by HashTable)


    }
}
