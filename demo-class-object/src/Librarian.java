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

}
