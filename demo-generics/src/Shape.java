import java.util.ArrayList;

public abstract class Shape {
    abstract double area();

    // public static <T extends Shape> double totalArea(T[] shapes)
    // public static double totalArea(List<? extends Shape> shapes) {

    // }

    public static void main(String[] args) {
        // Many String = String[]

        // Variable Length
        ArrayList<String> strings = new ArrayList<>();
        strings.add("ABC"); // encapsulation
        strings.add("IJK");
        System.out.println(strings.size()); // 2
        System.out.println(strings.get(1)); // IJK
        // System.out.println(strings.get(2)); // java.lang.IndexOutOfBoundsException

        // Book[]
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("ABC"));
        books.add(new Book("IJK"));
        books.remove(0); // remove book by index
        System.out.println(books.size()); // 1
        books.add(new Book("XYZ"));
        books.remove(new Book("IJK")); // after @OVerride equals() in Book.class
        // ArrayList.remove(Object obj) -> Book.equals()
        // Generics Design ensure the Type must contain equals()
        System.out.println(books.size()); // 1

        // Require @Override equals
        System.out.println(books.contains(new Book("XYZ"))); // true
        System.out.println(books.isEmpty()); // false
        System.out.println(books.indexOf(new Book("XYZ"))); // 0
        books.clear(); // Create a new array with size 0
        System.out.println(books.add(new Book("ABCD"))); // true (successfully added)

        System.out.println(books.isEmpty()); // false

        // Search part of the title for book - For Loop
        // for-each support ArrayList
        boolean found = false;
        String bookName = "Not Found";
        for (Book book : books) {
        if (book.getName().contains("BC")) {
            // found = true;
            bookName = book.getName();
            break;
        }
        }
        System.out.println("Book " + bookName + " is available.");
    }
}
