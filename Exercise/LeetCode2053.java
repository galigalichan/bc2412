import java.util.HashMap;

public class LeetCode2053 {
// 2053. Kth Distinct String in an Array
// A distinct string is a string that is present only once in an array.
// Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".
// Note that the strings are considered in the order in which they appear in the array.
    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};
        int k = 2;

        boolean isUnique = false;
        HashMap<String, Boolean> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], false);
            } else {
                map.put(arr[i], true);
            }
        }
        int count = 0;
        for (String str: arr) {
            if (map.get(str) == true) {
                count++;
                if (count == k) {
                    System.out.println(str); // a
                }
            }
        }
        System.out.println("");
    }
}
