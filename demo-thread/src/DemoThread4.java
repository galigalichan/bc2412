import java.util.ArrayList;
import java.util.Vector;

// Solution
// 1. Native Data structure (AtomicXXXX)
// 2. Lock the action (synchronized)
public class DemoThread4 {
    private Vector<Integer> integers; // Not thread-safe

    public DemoThread4() {
        this.integers = new Vector<Integer>(); // polymorphism: data type (ArrayList, LinkedList, Vector, Stack) can change easily to fit the shifting requirement
    }
    
    // public ArrayList<Integer> getIntegers() {
    //     return this.integers;
    // }

    // public synchronized boolean add(Integer integer) {
    //     return this.integers.add(integer);
    // }

    public boolean add(Integer integer) {
        return this.integers.add(integer); // lock this line of code // Vector locks every single method -> slow
    }

    public int size() {
        return this.integers.size();
    }

    public static void main(String[] args) {
        DemoThread4 central = new DemoThread4();
        Runnable addMillionElements = () -> {
            for (int i = 0; i < 1_000_000; i++) {
                central.add(i);
                // central.getIntegers().add(i);
            }
        };

        Thread workerB = new Thread(addMillionElements);
        workerB.start(); // main thread initializes another thread (workerB) to execute the task
        // The workerB executes the task ONLY.

        Thread workerC = new Thread(addMillionElements);
        workerC.start(); // main thread initializes another thread (workerC)

        // Main Thread
        try {
            workerB.join(); // main thread waits until workerB completes the task
            workerC.join(); // main thread waits until workerC completes the task
        } catch (InterruptedException e) {

        }

        System.out.println(central.size()); // 2000000
        // System.out.println(central.getIntegers().size()); // 12XXXXX
    }
}
