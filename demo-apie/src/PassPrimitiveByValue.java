public class PassPrimitiveByValue {
    public static void doSomething(int x) {
        x = 99;
        System.out.println(x); // 99
    }

    public static void main(String[] args) {
        int x = 10;
        doSomething(x);
        System.out.println("x is " + x); // x is 10
    }
}
