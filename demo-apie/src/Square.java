import java.math.BigDecimal;
import java.util.Objects;

public class Square extends Shape {
    private double side;


    public Square(char color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
        return true;
        if (!(obj instanceof Square))
        return false;
        Square square = (Square) obj;
        return Objects.equals(square.getColor(), super.getColor())
        && Objects.equals(square.getSide(), this.side);

    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getColor(), this.side); // hash -> generate a new int number representing the object
    }

    @Override
    public String toString() {
        return "Square[" //
            + "color=" + super.getColor() //
            + ", side=" + this.side //
            + "]";
    }

    public double area() {
        return BigDecimal.valueOf(Math.pow(this.side,2)).doubleValue();
    }

    public static void main(String[] args) {
        Square mySquare = new Square('B', 40);
        Square checkSquare = new Square('B', 40);
        System.out.println(mySquare.area());

        if (mySquare.equals(checkSquare)) {
            System.out.println("Same!"); // Same!
        }   else {
            System.out.println("Not same!");
        }

        System.out.println(mySquare.hashCode()); // 1078201279
        System.out.println(checkSquare.hashCode()); // 1078201279

        System.out.println(mySquare); // Square[color=B, side=40.0]
    }
}

