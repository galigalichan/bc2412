import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Circle extends Shape { 

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    // Override the parent given method
    // compiler will help to check if the parent class has area() method
    @Override
    public double area() {
        return BigDecimal.valueOf(Math.pow(this.radius, 2))
        .multiply(BigDecimal.valueOf(Math.PI))
        .setScale(2,RoundingMode.HALF_UP)
        .doubleValue();
    }

    public static void main(String[] args) {
        
    }

}
