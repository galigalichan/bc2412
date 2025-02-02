import java.util.Arrays;
// 2574. Left and Right Sum Differences
// Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:
// answer.length == nums.length.
// answer[i] = |leftSum[i] - rightSum[i]|.
// Where:
// leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
// rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
// Return the array answer.
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
            // When i = 0, leftSum = 10, rightSum = 25 (original value)
            // When i = 1, leftSum = 14, rightSum = 15 (value after round of i = 0)
            // When i = 2, leftSum = 22, rightSum = 11 (value after round of i = 1)
            // When i = 3, leftSum = 25, rightSum = 3 (value after round of i = 2)
            rightSum -= nums[i];

        }

        System.out.println(Arrays.toString(arr)); // [15, 1, 11, 22]


    }
}
