import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle extends Shape {
    private double base;
    private double height;


    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return this.base;
    }

    public double getHeight() {
        return this.height;
    }

    public double calculateTriangleArea() {
        return BigDecimal.valueOf(this.base)
        .multiply(BigDecimal.valueOf(this.height))
        .divide(BigDecimal.valueOf(2.0))
        .setScale(2,RoundingMode.HALF_UP)
        .doubleValue();

    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle("yellow",50.41,78.39);
        System.out.println(triangle.calculateTriangleArea());


    }
}
