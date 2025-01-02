public class Cat extends Animal {
    // Animal.class is a Parent Class
    // Cat.class is a Child Class
    // Inherit all attributes from Parent Class
    

    // private String name;
    // But Cat can have its own attributes.
    private int age;


    // constuctor
    public Cat(String name, int age) {
        // this.name = name;
        super(name); // Calling Parent Constructor (must be in the first line to call super)
        this.age = age;
    }

    // Inherit Parent all instance methods
    // public String getName() {
    //    return this.name;
    // }

    public int getAge() {
        return this.age;
    }


    // walk()
    public void walk() {
        System.out.println("Cat is walking...");

    }

    public static void main(String[] args) {
        Cat cat = new Cat("ABC", 8);
        System.out.println(cat.getName()); // ABC
        cat.walk();
    }
}
