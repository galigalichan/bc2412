public class Subclass extends Superclass {
    int someNumber;

    public Subclass() { // A no-args constructor is required in superclass for subclass to invoke
        System.out.println("[Subclass] No-args constructor called");
    }

    public Subclass(String someName, int someNumber) { // if superclass has any args constructor, subclass must inherit at least one of them.
        super(someName);
        this.someNumber = someNumber;
        System.out.println("[Subclass] Constructor with args called");
    }

    @Override
    public String toString() {
        return super.getSomeName() + ", " + this.someNumber;
    }

    
    public static void main(String[] args) {
        Subclass c1 = new Subclass();
        Subclass c2 = new Subclass("John", 18);

        System.out.println(c1.toString());
        System.out.println(c2);
        // [Superclass] No-args constructor called (when creating c1)
        // [Subclass] No-args constructor called (when creating c1)
        // [Superclass] Constructor with args called2 (when creating c1, with parameters in Subclass() interpreted as an empty String "")
        // [Subclass] Constructor with args called (when creating c2)
        // null, 0 (when printinig out c1.toString())
        // John, 18 (when printing out c2)

    }
}
