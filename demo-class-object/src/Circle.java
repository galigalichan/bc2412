import java.math.BigDecimal;

public class Circle {
    private double radius;
    private String color;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // getter
    public double getRadius() {
        return this.radius;
    }

    // setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // instance method (above the object)
    public double calculateArea() {
        return BigDecimal.valueOf(this.radius)
        .multiply(BigDecimal.valueOf(this.radius))
        .multiply(BigDecimal.valueOf(Math.PI))
        .doubleValue();
    }

    // static method: CANNOT call "this"
    // Design Definition: input -> output
    public static double calculateArea2(double radius) {
        return BigDecimal.valueOf(radius)
        .multiply(BigDecimal.valueOf(radius))
        .multiply(BigDecimal.valueOf(Math.PI))
        .doubleValue();
    }

    public static void main(String[] args) {
        // area
        // BigDecimal
        Circle c1 = new Circle(3.0);

        //Presentation
        System.out.println(c1.calculateArea()); // ~28.27 // c1 is an obect with method calculateArea

        // Formula
        System.out.println(Circle.calculateArea2(3.0)); // ~~28.27
    }
}
