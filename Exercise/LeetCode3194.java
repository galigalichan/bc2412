import java.util.Arrays;

public class LeetCode3194 {
    public static void main(String[] args) {
        int[] nums = new int[] {7,8,3,4,15,13,4,1};

        double[] averages = new double[nums.length / 2];

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
        for (int i = 0; i < nums.length / 2; i++) {
            averages[i] = (nums[i] + nums[nums.length - 1 - i]) / 2.0;
        }
        System.out.println(Arrays.toString(averages)); // [8.0, 8.0, 6.0, 5.5]

        double min = Double.MAX_VALUE;
        for (int j = 0; j < averages.length; j++) {
            if (averages[j] < min) {
                min = averages[j];
            }
        }
        System.out.println(min); // 5.5
    }
}
