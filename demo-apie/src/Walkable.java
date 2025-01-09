public interface Walkable {
    // 1. No instance variable
    // 2. All methods are abstract (interface = 100% abstract)
    // 3. Everything in Interface is implicitly public
    // 4. Support "static final" variable
    // 5. No constructor
    // 6. After Java 8, we have default & static method
    
    int x = 3; // Implicitly static final
    void walk(); // abstract method

    // After Java 8, we can use default instance method
    default void walkFaster() {
        System.out.println("A way to walk faster...");

    }

    // After Java 8, we can use static method in Interface
    static int calculateDistance() {
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(Walkable.x); // 3
        // Walkable.x = 4; // static final
        // Walkable.walkFaster();
        System.out.println(Walkable.calculateDistance()); 


    }

}
