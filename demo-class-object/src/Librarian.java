public class Librarian {
    private Library library;
    private Book book;
    private static int librarianCount = 0;

    public Librarian(Library library) {
        this.library = library;
        librarianCount++;
    }

    public static int getLibrarianCount() {
        return Librarian.librarianCount;
    }

    public void addBook(Book book) {
        Book[] newArr = new Book[library.books.length + 1];
        for (int i = 0; i < library.books.length; i++) {
            newArr[i] = library.books[i];
        }
            newArr[newArr.length - 1] = book;
            library.books = newArr;
    }

    // Assume remove the first book with same title
    public Book removeByTitle(String title) {
        Book[] newArr = new Book[library.books.length - 1];
        int idx = 0;
        for (int i = 0; i < library.books.length; i++) {
            if (library.books[i].contains(book.title)) {
                continue;
            }
            newArr[idx++] = library.books[i];
        }
        return null;
    }

    public static void main(String[] args) {
        Librarian lib1 = new Librarian(Library.l1);
        Librarian lib2 = new Librarian(Library.l1);
        Librarian lib3 = new Librarian(Library.l1);
        lib1.addBook("The Pillars of the Earth");






    }
}
