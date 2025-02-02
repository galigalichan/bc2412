import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode1636 {
// 1636. Sort Array by Increasing Frequency
// Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.
// Return the sorted array.
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3};

        // Frequency map to count occurrences of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();
   
        // Count frequency of each number
        for (int n : nums) {
            frequencyMap.put(n, frequencyMap.getOrDefault(n , 0) + 1);
        }

        // Create a list to hold the numbers
        List<Integer> numList = new ArrayList<>();
        for (int n : nums) {
            numList.add(n);
        }

        // Sort the list based on frequency and value
        Collections.sort(numList, (a, b) -> {
            int freqCompare = Integer.compare(frequencyMap.get(a), frequencyMap.get(b));
            return freqCompare != 0 ? freqCompare : Integer.compare(b, a);
            // freqCompare != 0 ? freqCompare -> if the frequencies are not equal, the value with the lower frequency comes first (default: natural / ascending order)
            // : Integer.compare(b, a) -> if the frequencies are equal, the higher value goes first
        });

        // Convert the sorted list back to an array
        numList.stream().mapToInt(i -> i).toArray();
    }
}
