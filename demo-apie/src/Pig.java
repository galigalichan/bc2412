public class Pig extends Animal {
    // more attributes
    private char gender;
    private int age;
    private double weight;
    
    // constructor
    public Pig() {
        // implicitly calling super()
        // super(); // Animal()
        // super("XYZ"); Animal("XYZ")
    }

    public Pig(String name) {
        super(name);

    }

    public void sleep() {
        System.out.println("Pig is sleeping.");


    }

    public static void main(String[] args) {
        Pig pig = new Pig(); //
        Pig pig2 = new Pig("IJK");


        pig.sleep();
        System.out.println(pig.getName()); // null
        System.out.println(pig2.getName()); // IJK
    }
}
