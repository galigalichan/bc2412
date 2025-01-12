import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode1389 {
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

        int[] target = new int[arr.size()];
        for (int j = 0; j < arr.size(); j++) {
            target[j] = arr.get(j);
        }

        System.out.println(Arrays.toString(target)); // [0, 4, 1, 3, 2]
    }
}
