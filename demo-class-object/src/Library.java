public class Library {
    // A library has many books
    // A Book has attributes: title & author
    // The library has functions:
        // 1) add a Book, return void.
        // 2) removeByTitle, return Book.
        // 3) searchByTitle, return Book[].

        // Librarian (add/remove), Library (search), Book
    
    private Book[] books;

    public Library() {
        this.books = new Book[0];
    }

    public void addBook(Book book) {
        Book[] newArr = new Book[this.books.length + 1];
        for (int i = 0; i < this.books.length; i++) {
            newArr[i] = this.books[i];
        }
            newArr[newArr.length - 1] = book;
            this.books = newArr;
    }

    public Book[] getBooks() {
        return this.books;
    }

    // Assume remove the first book with same title
    public Book removeByTitle(String title) {
        Book[] newArr = new Book[this.books.length - 1];
        int idx = 0;
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                continue;
            }
            newArr[idx++] = this.books[i];
        }
        return null;
    }


    // Serarch a sub-string of the tuitle
    public Book[] searchByTitle(String title) {
        return null; 
    }

}
