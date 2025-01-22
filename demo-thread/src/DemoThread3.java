public class DemoThread3 {
    private String x = "";


    public String getX() {
        return this.x;
    }

    // public void addA() {
    //    this.x += "A";
    // }

    // Solution for String (synchronized)
    // lock the door for method addA()
        public synchronized void addA() {
        this.x += "A"; // immutable
    }

    public static void main(String[] args) {
        DemoThread3 central = new DemoThread3();
        Runnable concatATask = () -> {
            for (int i = 0; i < 100_000; i++) {
                central.addA();
            }
        };

        Thread workerB = new Thread(concatATask);
        workerB.start();

        Thread workerC = new Thread(concatATask);
        workerC.start();

        try {
            workerB.join(); // main thread waits until workerB completes the task
            workerC.join(); // main thread waits until workerC completes the task
        } catch (InterruptedException e) {

        }

        System.out.println(central.getX().length()); // 2000000


        // My writing (author) doesn't affect your reading (user). (e.g. currency conversion in e-Banking -> completed in your own personal account without any competition)
        // in case of online forum, post updates may affect a bit (a few seconds), but it won;t affect the readers.
        // user expection: high system speed is expected in stock market.
    }
}
