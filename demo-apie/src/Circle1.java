import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

// Why do we need Shape?
public class Circle1 extends Shape { // Parent Class: color
    // Square, triangle...
    private double radius;
    // area() return double

    // If you don't specifiy the constructor, implicitly you have an empty constructor

    public Circle1(char color, double radius) {
        // if you don't specify super() here, implicitly you are calling super()
        super(color);
        // super(color); // because you have "extends", you have to "super"
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
        return true;
        if (!(obj instanceof Circle1))
        return false;
        Circle1 circle = (Circle1) obj;
        return Objects.equals(circle.getColor(), super.getColor())
        && Objects.equals(circle.getRadius(), this.radius);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.getColor(), this.radius); // hash -> generate a new int number representing the object
    }

    @Override
    public String toString() {
        return "Circle[" //
            + "color=" + super.getColor() //
            + ", radius=" + this.radius //
            + "]";
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
        // new Circle();
        // after you specify a constructor, then the default constructor no longer exists.
        Circle1 myCircle = new Circle1('R',56);
        Circle1 checkCircle = new Circle1('R',56);
        System.out.println(myCircle.area());

        if (myCircle.equals(checkCircle)) {
            System.out.println("Same!"); // Same!
        }   else {
            System.out.println("Not same!");
        }

        System.out.println(myCircle.hashCode()); // 1078726063
        System.out.println(checkCircle.hashCode()); // 1078726063

        System.out.println(myCircle); // Circle[color=R, radius=56.0]
    }

}
