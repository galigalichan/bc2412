import java.math.BigDecimal;

public class Square extends Shape {
    private double side;


    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public double calculateSquareArea() {
        return BigDecimal.valueOf(Math.pow(this.side,2)).doubleValue();
    }

    public static void main(String[] args) {
        Square square = new Square("black", 40);
        System.out.println(square.calculateSquareArea());


    }
}

