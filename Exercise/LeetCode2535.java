public class LeetCode2535 {
// 2535. Difference Between Element Sum and Digit Sum of an Array
// You are given a positive integer array nums.
// The element sum is the sum of all the elements in nums.
// The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
// Return the absolute difference between the element sum and digit sum of nums.
// Note that the absolute difference between two integers x and y is defined as |x - y|.
    public static void main(String[] args) {
        int[] nums = new int[] {12,97,48,72,31,70,1,9,78,28,1,30,82,17,43,44,53,12,73,16,74,24,79,9,51,77,36,38,81,38,69,60,29,21,66,6,62,55,13,90,66,7,15,15,60,76,44,30,6,86,87,59,88,36,32,35,67,13,79,43,27,2,97,41,4,44,91,11,5,48,38,64,9,90,39,28,50,57,60,4,99,44,39,12,95,32,66,100,45,42,22,35,65,7,49,43,41,40,64,78};

        int sumOfNums = 0;
        int sumOfDigits = 0;
        for (int i = 0; i < nums.length; i++) {
            sumOfNums += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 1 && nums[i] < 10) {
                sumOfDigits += nums[i];
            } else if (nums[i] >= 10 && nums[i] < 100) {
                sumOfDigits += nums[i] / 10 + nums[i] % 10;
            } else if (nums[i] >= 100 && nums[i] < 1000) {
                sumOfDigits += nums[i] / 100 + (nums[i] % 100) / 10 + (nums[i] % 100) % 10;
            } else {
                sumOfDigits += nums[i] / 1000 + (nums[i] % 1000) / 100 + ((nums[i] % 1000) % 100) / 10 + ((nums[i] % 1000) % 100) % 10;
            }
        }

        System.out.println(nums.length); // 100
        System.out.println(sumOfNums); // 4566
        System.out.println(sumOfDigits); // 858
        System.out.println(Math.abs(sumOfNums - sumOfDigits)); // 3708
    }
}
