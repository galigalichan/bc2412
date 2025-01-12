public class LeetCode1816 {
    public static void main(String[] args) {
        String s = "What is the solution to this problem";
        int k = 4;

        int count = 0;
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == (' ') && count < k) {
            count++;
            idx = i;}
        }
        System.out.println(count); // 4
        System.out.println(idx); // 20

        if (count + 1 <= k) {
            System.out.println(s);
        } else {
            System.out.println(s.substring(0, idx)); // What is the solution
        }

    }
}
