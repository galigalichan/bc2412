public class Test {
    public static void main(String[] args) {
        // Compile time
        // Run time -> p1.getAge()

        Person p1 = null;
        // pl.getK(); // Complier Error -> p1 come from Person.class, and this class has NO getK() method
        
        // p1.getAge();
        // Complier OK -> p1 come from Person.class, and this class has getAge() method
        // Runtime Error -> because p1 object reference finally cannot point to an object




    }
}
