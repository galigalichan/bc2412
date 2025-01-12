import java.math.BigDecimal;

public class Square extends Shape {
    private double side;


    public Square(Color color, double side) {
        this.side = side;
    }

    public Square(Color color, double side2) {
        //TODO Auto-generated constructor stub
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