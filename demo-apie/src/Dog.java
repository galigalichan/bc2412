public class Dog extends Animal implements KeepAlive {
    // private String name;


    // constuctor (Class CANNOT inherit Parent Constructor)
    public Dog(String name) {
        super(name);
    }

    // walk()
    public void walk() {
        System.out.println("Dog is walking...");
    }

    @Override
    public void drink() {
        System.out.println("Dog is drinking...");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping...");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }


    public static void main(String[] args) {
        Dog dog = new Dog("DEF");
        dog.walk();
        System.out.println(dog.getName());

        dog.eat(); // Animal is eating...
        dog.drink(); // Dog is drinking...
        dog.sleep(); // Dog is sleeping...
        dog.walk(); // Dog is walking...
    }


}
