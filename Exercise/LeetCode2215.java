import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode2215 {
// 2215. Find the Difference of Two Arrays
// Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
// answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
// answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
// Note that the integers in the lists may be returned in any order.
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};

        Set<Integer> newNums1 = new HashSet<>();
        for (int n : nums1) {
            newNums1.add(n);
        }
        System.out.println(newNums1); // [1, 2, 3]

        Set<Integer> newNums2 = new HashSet<>();
        for (int n : nums2) {
            newNums2.add(n);
        }
        System.out.println(newNums2); // [1, 2]

        List<Integer> ans1 = new ArrayList<>();
        for (int n: newNums1) {
            if (!(newNums2.contains(n))) {
                ans1.add(n);
            }
        }
        System.out.println(ans1); // [3]

        List<Integer> ans2 = new ArrayList<>();
        for (int n: newNums2) {
            if (!(newNums1.contains(n))) {
                ans2.add(n);
            }
        }
        System.out.println(ans2); // []

        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        answer.add(ans1);
        answer.add(ans2);
        System.out.println(answer); // [[3], []]
    }

}
