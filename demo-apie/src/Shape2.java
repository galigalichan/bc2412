public interface Shape2 { // Actions / Behaviors do not have attributes, so we use interface. But shape is an object and should use abstract class. This is a bad example for interface.
    // Problems:
    // No attribute
    // Before Java 8, no static & no default method
    double area();
    
    default double calculate() {
        return area() + 3;
    }
}
