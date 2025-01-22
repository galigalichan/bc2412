import java.util.concurrent.atomic.AtomicInteger;

public class DemoThread2 {
    // private int x; // Primitive (Not thread-safe)
    private AtomicInteger x = new AtomicInteger(0); // Primitive (thread-safe)

    public int getX() {
        // return this.x;
        return this.x.get();
    }

    public void addOne() {
        // this.x++;
        this.x.getAndIncrement();
    }

    public static void main(String[] args) {
        DemoThread2 place = new DemoThread2();
        place.addOne();
        System.out.println(place.getX()); // 1

        DemoThread2 central = new DemoThread2();
    
        Runnable placeAddMillionTask = () -> {
            System.out.println("Thread ID: " + Thread.currentThread().getId());
            for (int i = 0; i < 1_000_000; i++) {
                central.addOne();
            }
        };

        Thread workerB = new Thread(placeAddMillionTask);
        workerB.start();

        Thread workerC = new Thread(placeAddMillionTask);
        workerC.start();

        try {
            workerB.join(); // main thread waits until workerB completes the task
            workerC.join(); // main thread waits until workerC completes the task
        } catch (InterruptedException e) {

        }

        System.out.println(central.getX()); // 19XXXXX (different every time, just not 2,000,000)
        // x has to be taken out to execute AddOne() for 1 million times each for WorkerB and WorkerC
        // But WorkerB and WorkerC are competing for the same object X.
        // So some increments are missed.
        // Solution: AtomicInteger -> lock x in a room with a key. X can only be accessed with the key. (slow but accurate)
        // after using AtomicInteger, x become 2_000_000

        // 1
        // Thread ID: 24 (so that we can use static to store the progress of this thread)
        // Thread ID: 23 (so that we can use static to store the progress of this thread)
        // 2000000
    }
}
