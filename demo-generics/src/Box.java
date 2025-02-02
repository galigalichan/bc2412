import java.math.BigDecimal;
// The T in "Class, instance varaible, instance method" are with same definition
// But the T in static method is completely different thing, so we need to redefine
public class Box<T extends Shape1> { // locked itself into Shape so that it can flourish upon Shape
    private T[] shapes;  // instance variables and methods refer to the above class

    public Box() {
        // this.shapes = new T[2]; // cannot be unclear (T) when calling memory
        // this.shapes = new Shape[2]; // may put a child into the parent 
        this.shapes = (T[]) new Shape1[2];
    }

    // The T in instance method refers to the definition T of class
    public void addShape(int index, T shape) {
        this.shapes[index] = shape;
    }

    public double totalArea() { // shapes[0].area()
        // this.shapes[0].area();
        BigDecimal total = BigDecimal.valueOf(0.0);
        for (Shape1 shape : this.shapes) {
            total = BigDecimal.valueOf(shape.area()).add(total);
        }
        return total.doubleValue();
    }

    // The T in static method is not referring the T in Class
    // We can also use any other letter besides T
    public static <T extends Shape1> double totalArea2(T[] shapes) { // unrelated to the class Box
        return 0.1;
    }
    
    public static void main(String[] args) {
        Box<Circle> box1 = new Box<>();
        box1.addShape(0, new Circle(3.0));
        box1.addShape(1, new Circle(4.0));
        System.out.println(box1.totalArea()); // 78.54

        // add Circle to shape[0]
        // add Square to shape[1]

        Box<Shape1> b2 = new Box<>();
        b2.addShape(0, new Circle(3));
        b2.addShape(1, new Square1(3));
        System.out.println(b2.totalArea()); // 37.27

        // Team<Hero>
    }
}
