public class DemoStringBuilder {
    public static void main(String[] args) {
        String s = "hello";
        s += "!!!";
        s += "???";

        s = "";
        long before = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            s += "!"; // BigDecimal cannot be altered.
        }
        long after = System.currentTimeMillis();
        System.out.println(after - before); // 905ms

        StringBuilder sb = new StringBuilder("");
        before = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            sb.append("!"); // why doesn't sb need to be saved? // similar to setter
        }
        System.out.println(sb.length()); // 1000000
        after = System.currentTimeMillis();
        System.out.println(after - before); // 5ms

        sb = new StringBuilder("abc");
        sb.reverse(); // String does not have.
        System.out.println(sb); // cba

        System.out.println(sb.charAt(2)); // a
        sb.replace(0,1,"yy");
        System.out.println(sb); // yyba

        sb.deleteCharAt(2); // for loop
        System.out.println(sb); // yya

        sb.setCharAt(2, 'o');
        System.out.println(sb); // yyo

        sb.insert(1,"!!!");
        System.out.println(sb); // y!!!yo


    }
}
