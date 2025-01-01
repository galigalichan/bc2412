import java.util.Arrays;

public class Leetcode2574 {
    public static void main(String[] args) {
        int[] nums = new int[] {10,4,8,3};

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int rightSum = sum;
        int leftSum = 0;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            leftSum += nums[i];
            arr[i] = Math.abs(leftSum- rightSum);
            rightSum -= nums[i];

        }

        System.out.println(Arrays.toString(arr));


    }
}
