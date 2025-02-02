public class Superclass {
    private int someValue;
    private String someName;

    public Superclass() {
        System.out.println("[Superclass] No-args constructor called");
    }

    public Superclass(int someValue) {
        this.someValue = someValue;
        System.out.println("[Superclass] Constructor with args called1");
    }

    public Superclass(String someName) {
        this.someName = someName;
        System.out.println("[Superclass] Constructor with args called2");
    }


    public Superclass(int someValue, String someName) {
        this.someValue = someValue;
        this.someName = someName;
        System.out.println("[Superclass] Constructor with args called3");
    }

    public int getSomeValue() {
        return this.someValue;
    }

    public String getSomeName() {
        return this.someName;
    }

}
