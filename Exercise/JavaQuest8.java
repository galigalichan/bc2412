import java.util.Arrays;

public class JavaQuest8 {
/**
 * Example Output
 * Second Max = 230
 */

    // Write a loop to find the second max number.
    public static void main(String[] args) {
      int[] nums = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
      int[] nums2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
      int[] nums3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
      int[] nums4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240
  
    // Your program should be able to handle all the above test case.
    // code here ...
      int temp;
      for (int i = 0; i < nums.length -1; i++) {
        for (int j = 0; j < nums.length -1; j++)
        if (nums[j] > nums[j+1]) {
                temp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
        }}
        int secondMax = nums[nums.length-2];
        System.out.println("Second Max = " + secondMax);

      for (int i = 0; i < nums2.length -1; i++) {
        for (int j = 0; j < nums2.length -1; j++)
        if (nums2[j] > nums2[j+1]) {
                temp = nums2[j];
                nums2[j] = nums2[j+1];
                nums2[j+1] = temp;
        }}
        int secondMax2 = nums2[nums2.length-2];
        System.out.println("Second Max = " + secondMax2);

      for (int i = 0; i < nums3.length -1; i++) {
        for (int j = 0; j < nums3.length -1; j++)
        if (nums3[j] > nums3[j+1]) {
                temp = nums3[j];
                nums3[j] = nums3[j+1];
                nums3[j+1] = temp;
        }}
        int secondMax3 = nums3[nums3.length-2];
        System.out.println("Second Max = " + secondMax3);

      for (int i = 0; i < nums4.length -1; i++) {
        for (int j = 0; j < nums4.length -1; j++)
        if (nums4[j] > nums4[j+1]) {
                temp = nums4[j];
                nums4[j] = nums4[j+1];
                nums4[j+1] = temp;
        }}
        int secondMax4 = nums4[nums4.length-2];
        System.out.println("Second Max = " + secondMax4);

    }
  }

