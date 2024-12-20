public class Customer { // blueprint
    // attributes
    private String name;
    private int telNo;
    private String deliveryArea;

    // constructor
    public Customer(String name, int telNo, String deliveryArea) {
        this.name = name;
        this.telNo = telNo;
        this.deliveryArea = deliveryArea;
    }

    // getter (instance Method)
    public String getName() {
        return this.name;
    }

    public int getTelNo() {
        return this.telNo;
    }

    public String getDeliveryArea() {
        return this.deliveryArea;
    }
    

    public static void main(String[] args) {
    
        Customer c1 = new Customer("Peninsula", 21234567, "Tsim Sha Tsui");
        Customer c2 = new Customer("Grand Hyatt", 28901234, "Wan Chai");
        Customer c3 = new Customer("Rosewood", 25678901, "Tsim Sha Tsui");
    
        Customer[] customers = new Customer[] {c1, c2, c3};
        for (Customer c: customers) {
            System.out.println(c.getName() + ", " + c.getTelNo() + ", " + c.getDeliveryArea()); 
        }
    }
}
