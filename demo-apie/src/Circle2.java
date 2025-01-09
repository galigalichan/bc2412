import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle2 implements Shape2 {
    private double radius;


    public Circle2(double radius) {
        this.radius = radius;
    }


    @Override
    public double area() {
        return BigDecimal.valueOf(Math.pow(this.radius, 2))
        .multiply(BigDecimal.valueOf(Math.PI))
        .setScale(2,RoundingMode.HALF_UP)
        .doubleValue();
    }

}

