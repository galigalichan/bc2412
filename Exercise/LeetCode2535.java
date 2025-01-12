import java.util.Arrays;

public class LeetCode2535 {
    public static void main(String[] args) {
        int[] nums = new int[] {1, 15, 6, 3};

        int sumOfNums = 0;
        int sumOfDigits = 0;
        for (int i = 0; i < nums.length; i++) {
            sumOfNums += nums[i];
        }

        System.out.println(nums.length);

        System.out.println(sumOfNums); // 25
    }
}
