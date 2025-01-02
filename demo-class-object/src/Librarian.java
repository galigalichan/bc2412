public class Librarian {
    private String name;
    private Library library;

    // assume a librarian works in one library only
    // A librarian is responsible for arranging books.
    // Books exist in library.
    // Options to decide (consider the actions involved):
    // Librarian -> Library (The librarian takes actions (arranges books).)
    // Library -> Librarian (The library takes actions???)
    public Librarian(Library library) {
        this.library = library;
    }

    // add()
    public void add(Book book) {
        Book[] books = new Book[this.library.size() + 1];
        for (int i = 0; i< this.library.size(); i++) {
            books[i] = this.library.getBooks()[i];
        }
        books[books.length - 1] = book;
        this.library.setBooks(books);
    }

    // removeByTitle()
    public Book removeByTitle(String title) {
        int targetRemoveIndex = -1;
        for (int i = 0; i< this.library.size(); i++) {
            if (this.library.getBooks()[i].getTitle().equals(title)) {
                // this.books -> books array object
                // this.books[i] -> book object
                targetRemoveIndex = i;
                break;
            }
        }

        Book targetRemoveBook = null;
        if (targetRemoveIndex != -1) { // book found
            Book[] books = new Book[this.library.size() - 1];
            int idx = 0;
            for (int i = 0; i < this.library.size(); i++) { // read: get
                if (i != targetRemoveIndex) {
                books[idx++] = this.library.getBooks()[i]; // read :get
            }   else {
                targetRemoveBook = this.library.getBooks()[i]; // write down the address
            }
        }
        this.library.setBooks(books); // write: set
        }
        return targetRemoveBook; // if not found, return null
    }

}
