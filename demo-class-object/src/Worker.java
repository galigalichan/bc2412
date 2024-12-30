public class Worker {
    private static int workerCount = 0; // static -> can share
    private Supermarket supermarket; // private -> cannot share

    public Worker(Supermarket supermarket) {
        this.supermarket = supermarket;
        Worker.workerCount++;
    }
    
    // if read private static variable, we should use a static method
    public static int getWorkerCount() {
        return Worker.workerCount;
    }

    public void moveIn(int quantity) {
        supermarket.setAvailableStock(supermarket.getAvailableStock() + quantity);
    }

    public void moveOut(int quantity) {
        supermarket.setAvailableStock(supermarket.getAvailableStock() - quantity);
    }
}


