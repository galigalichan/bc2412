import java.util.Arrays;
// 3194. Minimum Average of Smallest and Largest Elements
// You have an array of floating point numbers averages which is initially empty. You are given an array nums of n integers where n is even.
// You repeat the following procedure n / 2 times:
// Remove the smallest element, minElement, and the largest element maxElement, from nums.
// Add (minElement + maxElement) / 2 to averages.
// Return the minimum element in averages.
public class LeetCode3194 {
    public static void main(String[] args) {
        int[] nums = new int[] {7,8,3,4,15,13,4,1};

        // Rearrange the elements in ascending order.
        int temp;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 -i; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums)); // [1, 3, 4, 4, 7, 8, 13, 15]

        // Create a double array to store the averages.
        double[] averages = new double[nums.length / 2];

        // Add the average of the smallest and largest elements to index 0.
        // Add the average of the second smallest and second largest elements to index 1.
        // Add the average of the third smallest and third largest elements to index 2.
        // ...
        for (int i = 0; i < nums.length / 2; i++) {
            averages[i] = (nums[i] + nums[nums.length - 1 - i]) / 2.0;
        }
        System.out.println(Arrays.toString(averages)); // [8.0, 8.0, 6.0, 5.5]

        // Find the minimum element in averages.
        double min = Double.MAX_VALUE;
        for (int j = 0; j < averages.length; j++) {
            if (averages[j] < min) {
                min = averages[j];
            }
        }
        System.out.println(min); // 5.5
    }
}
