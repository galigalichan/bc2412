public class LeetCode1816 {
// 1816. Truncate Sentence
// A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).
// For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
// You are given a sentence s​​​​​​ and an integer k​​​​​​. You want to truncate s​​​​​​ such that it contains only the first k​​​​​​ words. Return s​​​​​​ after truncating it.
    public static void main(String[] args) {
        String s = "What is the solution to this problem";
        int k = 4; // print the first 4 words of the String

        int count = 0;
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == (' ') && count < k) { // 0, 1, 2, 3 = 4th whitespace
            count++; // 1, 2, 3, 4
            idx = i;} // store the index of the 4th whitespace
        }
        System.out.println(count); // 4
        System.out.println(idx); // 20

        if (count + 1 <= k) { //  in case there are less than (count) words
            System.out.println(s); // print all
        } else {
            System.out.println(s.substring(0, idx)); // What is the solution
        }

        // count the number of words in String s
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                counter++;
            }
        }
        System.out.println(counter + 1); // 7

    }
}
