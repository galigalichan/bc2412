import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle1 extends Shape { // Parent Class: color
    // Square, triangle...
    private double radius;
    // area() return double

    public Circle1(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateCircleArea() {
        return BigDecimal.valueOf(Math.pow(this.radius, 2))
        .multiply(BigDecimal.valueOf(Math.PI))
        .setScale(2,RoundingMode.HALF_UP)
        .doubleValue();
    }

    public static void main(String[] args) {
        Circle1 circle = new Circle1("red",56);
        System.out.println(circle.calculateCircleArea());
    }

}
