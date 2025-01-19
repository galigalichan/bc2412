public class Demo {
    public static void main(String[] args) {
        Person person = new Person("Vincent",30);

        Class<?> childClass = person.getClass();
        System.out.println("Runtime class: " + childClass.getName()); // Runtime class: Person

        Class<?> superClass = childClass.getSuperclass();
        System.out.println("Superclass: " + superClass.getName()); // Superclass: java.lang.Object

    }
}
