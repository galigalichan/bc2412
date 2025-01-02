public class Dog extends Animal {
    // private String name;


    // constuctor (Class CANNOT inherit Parent Constructor)
    public Dog(String name) {
        super(name);
    }

    // walk()
    public void walk() {
        System.out.println("Dog is walking...");

    }

    public static void main(String[] args) {
        Dog dog = new Dog("DEF");
        dog.walk();
        System.out.println(dog.getName());
    }


}
