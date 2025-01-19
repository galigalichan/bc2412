public class SuperBuilder {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("abc");
        boolean pool = s.append("def").startsWith("def");

    }
}
