// Generics Design -> Reduce number of class
public class GeneralPrinter<T> { // <T> present the scope of "T" inside the class
    private T value;

    public GeneralPrinter(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public String print() {
        return "this is " + this.value.toString(); // String + anything = String // 
    }

    public static void main(String[] args) {
        // <T> has to be clarified at compile time
        GeneralPrinter<Integer> printer = new GeneralPrinter<>(Integer.valueOf(3));

        GeneralPrinter<Object> printer2 = new GeneralPrinter<>(Integer.valueOf(3));
        Object obj = 3;
        // obj is an Object
        // It does not allow compareTo before safety check
        if (obj instanceof Integer) { // safety concern
            Integer integer = (Integer) obj;
            System.out.println(integer.compareTo(2)); // 1
        }

        GeneralPrinter<Object> printer3 = new GeneralPrinter<>(new Book("ABC"));
    }
}
