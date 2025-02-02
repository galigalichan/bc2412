import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode1389 {
// 1389. Create Target Array in the Given Order
// Given two arrays of integers nums and index. Your task is to create target array under the following rules:
// Initially target array is empty.
// From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
// Repeat the previous step until there are no elements to read in nums and index.
// Return the target array.
// It is guaranteed that the insertion operations will be valid.

    // ArrayList
    // add(index, element)
    // return the answer in array
    public static void main(String[] args) {
        int[] nums = new int[] {0, 1, 2, 3, 4};
        int[] index = new int[] {0, 1, 2, 2, 1};

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arr.add(index[i], nums[i]);
        }
        
        System.out.println(arr); // [0, 4, 1, 3, 2]

        // convert to array format
        int[] target = new int[arr.size()];
        for (int j = 0; j < arr.size(); j++) {
            target[j] = arr.get(j);
        }

        System.out.println(Arrays.toString(target)); // [0, 4, 1, 3, 2]
    }
}
