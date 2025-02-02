import java.math.BigDecimal;

public class Square1 extends Shape1 {
    private double side;


    public Square1(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    @Override
    public double area() {
        return BigDecimal.valueOf(Math.pow(this.side,2)).doubleValue();
    }

    public static void main(String[] args) {
  
    }
}