import java.math.BigDecimal;

public class Square2 implements Shape2 {
    private double length;

    public Square2(double length) {
        this.length = length;
    }

    public double area() {
        return BigDecimal.valueOf(Math.pow(this.length,2)).doubleValue();
    }

    public static void main(String[] args) {
        Square2 square = new Square2(3.0);
        System.out.println(square.area()); // 9.0
        System.out.println(square.calculate()); // 12.0
    }
}
