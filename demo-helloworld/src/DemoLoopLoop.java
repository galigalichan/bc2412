public class DemoLoopLoop {
    public static void main(String[] args) {
        String substr = "llo";
        String str2 = "hello";
        // hel vs loq
        // ell vs loq
        // llo vs loq
        // lo  vs loq

        // for loop + substring
        boolean isSubstringExist = false;
        for (int i = 0; i < str2.length() - substr.length() + 1; i++) {
            if(str2.substring(i, i + substr.length()).equals(substr) ) { // String equals string
                isSubstringExist = true;
                break;
            }
        }
        System.out.println(isSubstringExist); // true
        System.out.println(str2.length());
        System.out.println(substr.length());

    }
}
