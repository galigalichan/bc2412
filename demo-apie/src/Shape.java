public abstract class Shape {
    // abstract class vs class
    // 1. CANNOT create object for abstract class
    // 2. they are both with common attribute for child class
    // 3. abstract class's constructor is for child class to "super"
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    // implicit public
    // implication: if the child class cannot provide area implementation, then it is not a shape.
    // The child must provide the implementation of abstract method
    abstract double area();

    public static Shape create(char ref, Color color) { // S -> Square, C -> Circle
        switch (ref) {
            case 'S':
                return new Square(color, 3.0);
            case 'C':
                return new Circle1(color, 4.0);
            default:
                return null;
            }
        }

    public static Circle1 createCircle(Color color, double radius) {
        return new Circle1(color, radius);
    }

    public static void main(String[] args) {
        // new Shape('R'); // compile error, abstract class
        System.out.println(Shape.create('C', Color.RED)); // Circle[color=RED, radius=4.0]
        Circle1 c2 = Shape.createCircle(Color.YELLOW,3.0);
        System.out.println(c2); // Circle[color=YELLOW, radius=3.0]
        // Heros.createArcher();

    }
}
