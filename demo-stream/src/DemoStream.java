import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DemoStream {
    public static void main(String[] args) {
        // traditional
        int[] arr = new int[] {1, 2, 3, 4};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int integer : arr) {
            System.out.println(integer);
        }

        // int[], Integer[], ArrayList<Integer>
        // Java8 (2014): Stream style: List -> Stream -> List
        // Before Java8, for loop (list)
        
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        List<Integer> newIntegers = integers.stream() // Stream<Integer>
            .filter(e -> e % 2 == 0) // "e -> e % 2 == 0" --> Predicate
            .collect(Collectors.toList()); // alwasys return new ArrayList

        System.out.println(integers); // [1, 2, 3, 4]
        System.out.println(newIntegers); // [2, 4]

        // Declare String array with some elements
        // filter (preserve) string length > 5 and contains 'a'
        List<String> strings = Arrays.asList("apple", "bananna", "orange", "date");
        // for loop + if 
        List<String> newStrings = strings.stream().filter(e -> e.length() > 5 && e.indexOf('a') != -1).collect(Collectors.toList());

        System.out.println(strings); // [apple, banana, orange, date]
        System.out.println(newStrings); // [banana, orange]

        // Define a book list
        // filter book name contains "Herry" case insensitive
        List<Book> books = Arrays.asList(new Book("ABC Herry"), new Book("IJK HERRY"), new Book("IJK"));
        List<Book> newBooks = books.stream().filter(e -> e.getName().toUpperCase().contains("HERRY")).collect(Collectors.toList());
        // Alternatively...
        // List<Book> newBooks = books.stream().filter(e -> "Herry".equalsIgnoreCase(e.getName())).collect(Collectors.toList());
        System.out.println(newBooks);

        // map(): change the object type, but the quantity of element won't change
        List<String> bookNames = books.stream().map(e -> e.getName()).collect(Collectors.toList());
        System.out.println(bookNames); // [ABC Herry, IJK HERRY, IJK]

        // filter + map
        // for loop + if + re-structure
        List<String> newBookNames = books.stream().filter(e -> e.getName().toUpperCase().contains("HERRY")).map(e -> e.getName()).collect(Collectors.toList());
        System.out.println(newBookNames); // [ABC Herry, IJK HERRY]

        // for loop + if + procedures
        books.stream()
            .filter(e -> e.getName().startsWith("A"))
            .forEach(e -> {
                System.out.println(e.getName()); // ABC Herry
            });

        // Convert 3 book names to 3 books
        List<String> bookNames2 = List.of("abc", "herry", "def");
        List<Book> newBookNames2 = bookNames2.stream().map(e -> new Book(e)).collect(Collectors.toList());
        System.out.println(newBookNames2);
        // [Book[name= abc], Book[name= herry], Book[name= def]]

        // Stream sorted()
        // Collection.sort() + Comparator
        // Arrays.sort()

        // Integer[] vs int[] cannot auto-convert
        // int vs Integer can auto-convert
        Integer[] arr2 = new Integer[] {2, 4, -1, 1, -3};
        // Sort by descending order
        Arrays.sort(arr2, (i1, i2) -> i1 > i2 ? -1 : 1); //  Lambda expression of Comparator
        System.out.println(Arrays.toString(arr2)); // [4, 2, 1, -1, -3]

        // Integer[] -> Stream<Integer>
        List<Integer> sortedIntegers = Arrays.stream(arr2) //
            .sorted((i1, i2) -> i1 > i2 ? -1 : 1) //
            .collect(Collectors.toList());
        System.out.println(sortedIntegers); // [4, 2, 1, -1, -3]

        List<String> fruits = Arrays.asList("orange", "apple", "orange", "lemon");
        Set<String> newFruits = fruits.stream().collect(Collectors.toSet());
        System.out.println(newFruits); // [orange, apple, lemon]

        // distinct() -> remove duplicates
        List<String> newFruits2 =
            fruits.stream().distinct().collect(Collectors.toList());
        System.out.println(newFruits2); // [orange, apple, lemon]



    }

    public static class Book {
        private String name;

        public Book(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        @Override
        public String toString() {
            return "Book[" + "name= " + this.name + "]";
        }
    }

    // Convert from List of Object A (more fields) to List of Object B (less fields)
    public static List<Book> getBookLIstForSearch(List<Book2> books) {
        return books.stream().map(e -> new Book(e.getName())).collect(Collectors.toList());
    }

    public static class Book2 {
        private String name;
        private double price;

        public Book2(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return this.name;
        }

        public double getPrice() {
            return this.price;
        }

        @Override
        public String toString() {
          return "Book[" //
              + "name=" + this.name //
              + "]";
    }
    }
}
