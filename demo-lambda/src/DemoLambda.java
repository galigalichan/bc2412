import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class DemoLambda {
    public static void main(String[] args) {
        // Java Lambda Expression -> Stream, Optional
        // 2014 Java 8

        // Java Built-in Lambda Functions
        // y = f(x), input -> output

        // stringLength -> functionName

        // define function
        // s (input)
        // s.length() (output)
        Function<String, Integer> stringLength = s -> s.length(); // called once in Main class during runtime // skip "return" keyword
        System.out.println(stringLength.apply("hello")); // 5
        stringLength = s -> s.length() + 10; // can be manipulated more easily -> more dynamic

        Function<Integer[], Integer> lengthofArray = s -> s.length;
        System.out.println(lengthofArray.apply(new Integer[] {1, 3, 5, 7, 9, 11, 13, 15, 17})); // 9

        // Input (String & String) s1 & s2
        // Output (Integer)
        BiFunction<String, String, Integer> totalLength 
        = (s1, s2) -> s1.length() + s2.length(); // skip "return" method
        System.out.println(totalLength.apply("oscar","lucas")); // 10

        Consumer<String> printString = s -> System.out.println("The String is " + s);
        printString.accept("hello"); // The String is hello
        printString.accept("goodbye"); // The String is goodbye
        
        Supplier<Integer> randomMarkSixNumber = () -> new Random().nextInt(49) + 1;
        System.out.println(randomMarkSixNumber.get());

        // Custom FunctionInterface Swimable
        // Java before 8: Interface -> Class -> Object
        // Java after 8: Interface -> Object (no constructor is required)
        Swimable lucas = () -> System.out.println("Lucas is swimming");
        lucas.swim(); // Lucas is swimming

        // Lambda Assumption: FunctionalInterface -> one method only -> lambda expression
        
        // MathOperation
        MathOperation addition = (x, y) -> x + y;
        MathOperation subtraction = (x, y) -> x - y;
  
        System.out.println(addition.operate(1,2)); // 3
        System.out.println(subtraction.operate(1,2)); // -1

        List<Book> books = new ArrayList<>();
        books.add(new Book(1));
        books.add(new Book(3));
        books.add(new Book(10));
        books.add(new Book(12));
        for (Book book : books) {
            System.out.println(book.getId());
        }
        books.forEach(b -> System.out.println(b.getId())); // 1 3 10 12
        // one than 1 line
        books.forEach(b -> {
            String message = "hello";
            System.out.println(b.getId() + " " + message); // 1 hello 3 hello 10 hello 12 hello
        });

        Map<String, String> fruitMap = new HashMap<>();
        fruitMap.put("orange","abc");
        fruitMap.put("apple","def");
        fruitMap.forEach((key, value) -> {
            System.out.println("key=" + key + ", value=" + value);
            // key=orange, value=abc
            // key=apple, value=def
        });

        // Predicate
        // x > 8 -> boolean (result)
        // x -> x > 8 -> Predicate (formula)
        int x1 = -1;
        boolean isLargerThanEight = x1 > 8; // false

        Predicate<Integer> isLargerThan8 = x -> x > 8;
        System.out.println(isLargerThan8.test(9)); // true
        System.out.println(isLargerThan8.test(8)); // false

        // check if the integer is even number
        Predicate<Integer> isEvenNumber = x -> x % 2 == 0;

        System.out.println(isLargerThan8.and(isEvenNumber).test(10)); // true
        System.out.println(isLargerThan8.or(isEvenNumber).test(9)); // true

        System.out.println(books.size()); // 4
        books.removeIf(book -> book.getId() % 2 == 1);
        System.out.println(books.size()); // 2

        BiFunction<String, String, String> appendHello = (oldV, newV) -> oldV + newV;
        fruitMap.merge("lemon", "xyz", appendHello);
        fruitMap.merge("apple", "mno", appendHello); 
        fruitMap.merge("orange", "yyy", appendHello);
        System.out.println(fruitMap); // {orange=abcyyy, apple=defmno, lemon=xyz}

        // SuperFunction (Interface), 3 input 1 output
        SuperFunction<String, String, String, Integer> formula = (s1, s2, s3) -> {
        int result = s1.length() + s2.length() + s3.length();
        return result;
        };
        System.out.println(formula.apply("abc", "", "ppp")); // 6

        // UnartOperator<String> -> Function<String, String>
        UnaryOperator<String> toUpperCase = s -> s.toUpperCase();
        System.out.println(toUpperCase.apply("Hello")); // HELLO

        UnaryOperator<String> transform = s -> {
            if (s.length() > 5) {
                return s.substring(0, 5);
            } else {
                if (s.startsWith("a")) {
                    return "Wrong String.";
                }
                return s;
            }
        };

        System.out.println(transform.apply("abcdef")); // abcde
        System.out.println(transform.apply("abcde")); // Wrong String
        System.out.println(transform.apply("edcba")); // edcba

    }

    public static class Book{
        private int id;

        public Book(int id){
            this.id = id;
        }

        public int getId() {
            return this.id;
        }
    }

    // Similar to Consumer.class
    public static void printString(String s) {
        System.out.println("The String is " + s);
    }

    // Similar to Supplier.class
    public static int randomMarkSixNumber() {
        return new Random().nextInt(49) + 1; // 1-49
    }
    
    // Similar to Function.class
    public static Integer stringLength(String s) { // class method for public use and can be called for multiple times
        return s.length();
    }
}