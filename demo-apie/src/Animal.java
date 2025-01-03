public class Animal {
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

    public void eat() {
        System.out.println("Animal is eating...");
    }

    public static void main(String[] args) {
        new Animal(); // OK, because it is normal class
    }
}
