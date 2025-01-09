import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Triangle extends Shape {
    private double base;
    private double height;


    public Triangle(Color color, double base, double height) {
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
        return true;
        if (!(obj instanceof Triangle))
        return false;
        Triangle triangle = (Triangle) obj;
        return Objects.equals(triangle.getColor(), super.getColor())
        && Objects.equals(triangle.getBase(), this.base)
        && Objects.equals(triangle.getHeight(), this.height);
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(super.getColor(), this.base, this.height); // hash -> generate a new int number representing the object
    }

    @Override
    public String toString() {
        return "Triangle[" //
            + "color=" + super.getColor() //
            + ", base=" + this.base //
            + ", height=" + this.height //
            + "]";
    }

    public double area() {
        return BigDecimal.valueOf(this.base)
        .multiply(BigDecimal.valueOf(this.height))
        .divide(BigDecimal.valueOf(2.0))
        .setScale(2,RoundingMode.HALF_UP)
        .doubleValue();

    }

    public static void main(String[] args) {
        Triangle myTriangle = new Triangle(Color.RED,50.41,78.39);
        Triangle checkTriangle = new Triangle(Color.YELLOW,50.41,78.39);
        System.out.println(myTriangle.area());

        if (myTriangle.equals(checkTriangle)) {
            System.out.println("Same!"); // Same!
        }   else {
            System.out.println("Not same!");
        }

        System.out.println(myTriangle.hashCode()); // 61029030
        System.out.println(checkTriangle.hashCode()); // 61029030

        System.out.println(myTriangle); // Triangle[color=Y, base=50.41, height=78.39]
    }
    
}
