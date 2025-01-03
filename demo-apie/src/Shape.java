public abstract class Shape {
    // abstract class vs class
    // 1. CANNOT create object for abstract class
    // 2. they are both with common attribute for child class
    // 3. abstract class's constructor is for child class to "super"
    private char color;

    public Shape(char color) {
        this.color = color;
    }

    public char getColor() {
        return this.color;
    }

    // implicit public
    // implication: if the child class cannot provide area implementation, then it is not a shape.
    // The child must provide the implementation of abstract method
    abstract double area();

    public static void main(String[] args) {
        // new Shape('R'); // compile error, abstract class
    }
}
