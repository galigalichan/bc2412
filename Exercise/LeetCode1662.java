import java.util.Arrays;

public class LeetCode1662 {
// 1662. Check If Two String Arrays are Equivalent
// Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
// A string is represented by an array if the array elements concatenated in order forms the string.
    public static void main(String[] args) {
        String[] word1 = new String[] {"a", "cb"};
        String[] word2 = new String[] {"ab", "c"};
    
        String string1 = "";
        for (int i = 0; i < word1.length; i++) {
            string1 = string1.concat(word1[i]); // string1 += word1[i]
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
