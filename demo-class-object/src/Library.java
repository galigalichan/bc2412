public class Library {
    // A library has many books
    // A Book has attributes: title & author
    // The library has functions:
        // 1) add a Book, return void.
        // 2) removeByTitle, return Book.
        // 3) searchByTitle, return Book[].

        public static Library l1;
    // Librarian (add/remove), Library (search), Book
    private int availableBooks;

    public Library(int availableBooks) {
        this.availableBooks = availableBooks; 
    }

    public Book[] books;


    public Book[] getBooks() {
        return this.books;
    }


    // Serarch a sub-string of the tuitle
    public Book[] searchByTitle(String title) {
        return null; 
    }

    public static void main(String[] args) {
        Library l1 = new Library(0);


        



    }
}
