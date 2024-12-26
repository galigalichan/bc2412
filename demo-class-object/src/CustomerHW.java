public class CustomerHW { // blueprint
    // attributes
    private String name;
    private int telNo;
    private String deliveryArea;

    // constructor
    public CustomerHW(String name, int telNo, String deliveryArea) {
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

    // setter
    public void setName(String name) {
        this.name = name;
    }
    
    public void setTelNo(int telNo) {
        this.telNo = telNo;
    }

    public void setDeliveryArea(String deliveryArea) {
        this.deliveryArea = deliveryArea;
    }

    public static void main(String[] args) {
    
        CustomerHW c1 = new CustomerHW("Peninsula", 21234567, "Tsim Sha Tsui");
        CustomerHW c2 = new CustomerHW("Grand Hyatt", 28901234, "Wan Chai");
        CustomerHW c3 = new CustomerHW("Rosewood", 25678901, "Tsim Sha Tsui");
    
        CustomerHW[] customers = new CustomerHW[] {c1, c2, c3};
        for (CustomerHW c: customers) {
            System.out.println(c.getName() + ", " + c.getTelNo() + ", " + c.getDeliveryArea()); 
        }
    }
}
