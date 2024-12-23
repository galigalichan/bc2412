public class Product { // class
    // attributes
    private String productName;
    private boolean fromOverseas;
    private double unitPrice;
    private String unit;

    // constructor
    public Product(String productName, boolean fromOverseas, double unitPrice, String unit) {
        this.productName = productName;
        this.fromOverseas = fromOverseas;
        this.unitPrice = unitPrice;
        this.unit = unit;
    }

    // getter (instance Method)
    public String getProductName() {
        return this.productName;
    }

    public boolean getFromOverseas() {
        return this.fromOverseas;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public String getUnit() {
        return this.unit;
    }

    public static void main(String[] args) {
        Product p1 = new Product("Brazilian Shrimp", true, 56.0, "lb" );
        Product p2 = new Product("Boston Lobster", true, 130.50, "kg" );
        Product p3 = new Product("Local Clams", false, 26.3, "catty" );
        Product p4 = new Product("Local Abalone", false, 59, "lb" );

        Product[] products = new Product[] {p1, p2, p3, p4};
        for (Product p: products) {
            System.out.println(p.getProductName() + ", " + p.getFromOverseas() + ", " + p.getUnitPrice() + ", " + p.getUnit());
        }

    }

}
