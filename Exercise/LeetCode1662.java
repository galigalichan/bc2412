public class LeetCode1662 {
    public static void main(String[] args) {
        String[] word1 = new String[] {"a", "cb"};
        String[] word2 = new String[] {"ab", "c"};
    
        String string1 = "";
        for (int i = 0; i < word1.length; i++) {
            string1 = string1.concat(word1[i]);
            }
    
        System.out.println(string1);

        String string2 = "";
        for (int i = 0; i < word2.length; i++) {
            string2 = string2.concat(word2[i]);
            }

        System.out.println(string2);

        if (string1.equals(string2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
