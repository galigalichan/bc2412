public class Book {
    public String title;
    private String author;
    private static int bookCount = 0;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        Book.bookCount++;
    }

    public String getTitle() {
        return this.title;
    }
    
    public String getAuthor() {
        return this.author;
    }

    public boolean contains(String title) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'contains'");
    }
    
    public static void main(String[] args) {
        Book b1 = new Book("LOTR The Fellowship of the Ring","J. R. R. Tolkien");
        Book b2 = new Book("LOTR The Two Towers","J. R. R. Tolkien");
        Book b3 = new Book("LOTR The Return of the King","J. R. R. Tolkien");
        Book b4 = new Book("Humankind", "Rutger Bregman");
        Book b5 = new Book("The Da Vinci Code", "Dan Brown");
        Book b6 = new Book("Origin", "Dan Brown");
        Book b7 = new Book("One Hundred Years of Solitude", "Gabriel Garcia Marquez");
        Book b8 = new Book("The Hong Kong Diaries", "Chris Patten");
        Book b9 = new Book("The Obyssey", "Homer");
        Book b10 = new Book("Antigone", "Sophocles");
        
        Book[] books = new Book[] {b1, b2, b3, b4, b5, b6, b7, b8, b9, b10};

        System.out.println(Book.bookCount);

    }

}
