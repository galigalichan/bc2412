import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
      // Many String = String[]

      // Array: fixed length
      String[] ss = new String[3];
      String[] ss2 = new String[] {"abc","ijk","xyz"};
      // ss2 is an address of the array, ss2[0]
      System.out.println(ss2[1]); // ijk, read the "ijk" position directly
  
      // ArrayList: Variable Length
      // Underlying data structure -> array
      ArrayList<String> strings = new ArrayList<>(); // arr with size 0
      strings.add("ABC"); // arr with size 1
      strings.add("IJK");
      System.out.println(strings.size()); // 2, arr.length
      System.out.println(strings.get(1)); // IJK, jump to the elements with index 1 directly
      // System.out.println(strings.get(2)); // java.lang.IndexOutOfBoundsException
  
      // Book[]
      ArrayList<Book> books = new ArrayList<>();
      books.add(new Book("ABC"));
      books.add(new Book("IJK"));
      books.remove(0); // remove book by index
      System.out.println(books.size()); // 1
      books.add(new Book("XYZ"));
      books.remove(new Book("IJK")); // after @Override equals() in Book.class
      // ArrayList.remove(Object obj) -> Book.equals()
      // Generics Design ensure the Type must contains eqauls()
      System.out.println(books.size()); // 1
  
      // Requires @Override equals()
      System.out.println(books.contains(new Book("XYZ"))); // true
      System.out.println(books.indexOf(new Book("XYZ"))); // 0
      books.clear(); // Create a new array with size 0
      System.out.println(books.add(new Book("ABCD"))); // true
      System.out.println(books.isEmpty()); // false
  
      // Search part of the title for book - For loop
      // for-each support ArrayList
      // boolean found = false;
      String bookName = "Not Found.";
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