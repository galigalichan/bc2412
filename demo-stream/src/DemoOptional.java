import java.util.Optional;

public class DemoOptional {
    // 3. Never use Optional type as attribute type
    // firstName still can be null, but what is this meaning?
    // private Optional<String> firstName;

    public static void main(String[] args) {
        // Caller
        // Advantage: Able to avoid null pointer exception
        Optional<String> result = concat("abc", "def");
        if (result.isPresent()) {
            System.out.println(result.get()); // abcdef
        }

        // String result2 = concat(Optional.of("abc"), Optional.of("def"));
    }

    // 1. Optional can only be used as a return type of method
    // If you decide to have a return type of Optional,
    // it implies the result may be null

    // If a or b is null, then the result is null
    public static Optional<String> concat(String a, String b) {
        if (a == null || b == null)
            return Optional.empty(); // Optional type of null
        return Optional.of(a.concat(b));
    }

    // 2. Never use optional as input parameter
    // x and y still can be null (not safe)
    // public static String concat(Optional<String> x, Optional<String> y) {
    //    if (x == null || y == null)
    //        return null;
    //    if (!x.isPresent() || !y.isPresent())
    //        return null;
    //    return x.get().concat(y.get());
    // }
}
