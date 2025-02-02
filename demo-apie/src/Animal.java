public class Animal implements Eatable { // complier ensures there's eat() method
    // common attribute of Cat and Dog
    private String name;

    public Animal() {
        
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // Contract Content
    @Override
     public void eat() {
        System.out.println("Animal is eating...");
    }

    public static void main(String[] args) {
        new Animal(); // OK, because it is normal class

        Cat cat = new Cat("Jimmy",3);
        System.out.println(cat.getName()); // Jimmy

        Animal cat2 = new Cat("Mary",2); // Look at the left side: Animal
        cat2.eat(); // Cat is eating...

        // Rule 1. During the compile time,
        // "Animal cat2" implies the object can be accessed in "Animal Scope"
        // Hide the object instance method walk() & sleep()
        // cat2.sleep(); // fail at compile time
        // cat2.walk(); // fail at compile time

        // Rule 2. Runtime
        cat2.eat(); // Find the object during runtime
        // Found that the object actually is a cat object.
        // So cat2.eat() -> Cat.class's eat()

        Animal cat3 = new Animal("Vincent");
        cat3.eat(); // Animal is eating

        // cat3.sleep(); // violate Rule 1

        // Cannot place a parent object to a child reference
        // Cat cat4 = new Animal("Lucas");

        // Example 1:
        Animal[] animals = new Animal[4]; // Cat, Dog, Pig
        animals[0] = new Cat("Sam",5);
        animals[1] = new Dog("Peter");
        animals[2] = new Pig("Susan");
        animals[3] = new Animal("Lucy"); // if you want to disable creating Animal objects, abstract the class
        
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("123",2);
        Dog[] dogs = new Dog[2];
        Pig[] pigs = new Pig[3];

        // Example 2:
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(Color.YELLOW, 50);
        shapes[1] = new Circle1(Color.RED,23);
        shapes[2] = new Triangle(Color.BLUE,45,67);

        for (Shape shape : shapes) {
            System.out.println("area=" + shape.area());
            // System.out.println(shape.getRadius());
        }

        // Example 3: Downcast
        for (Shape shape : shapes) {
            if (shape instanceof Circle1) { // check if shape is instance(object) of Circle?
                Circle1 circle = (Circle1) shape; // similar to "double y = 2.0; int x = (int) y;"
                System.out.println(circle.getRadius()); // comply with Rule 1 // 50.0
            } else if (shape instanceof Square) {
                Square square = (Square) shape;
                System.out.println(square.getSide()); // comply with Rule 1 // 23.0
            }
        }

        // Example 4: for Interface
        Eatable cat4 = new Cat("Tommy",9);
        cat4.eat(); // Cat is eating...
        // cat4.walk();

        Sleepable[] animals2 = new Sleepable[2];
        animals2[0] = new Cat("Steve",2);
        animals2[1] = new Dog("Owen");
        // animals2[2] = new Animal(); // Animal didn't implement Sleepable
        animals2[1].sleep(); // Dog is sleeping...
        animals2[0].sleep(); // Cat is sleeping...
        // animals2[0].eat();

        Animal animal = new Cat("ABC",3);
        animal.eat(); // Cat is eating...
        animal = new Dog("JIL");
        animal.eat(); // Dog is eating...
        
        // Hero hero = new Archer();
        // hero.attack();
        // hero = new Warrior();
        // hero.attack();

        // Hero[] heros = new Hero[3];


    }
}
