import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LeetCode2418 {
// 2418. Sort the People
// You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.
// For each index i, names[i] and heights[i] denote the name and height of the ith person.
// Return names sorted in descending order by the people's heights.
    public static void main(String[] args) {
        String[] names = new String[] {"Mary","John","Emma"};
        int[] heights = new int[] {180,165,170};

        HashMap<Integer, String> heightMap = new HashMap<>();

        for (int i = 0; i < names.length; i++) {
            heightMap.put(heights[i], names[i]);
        }

        Arrays.sort(heights);
        String[] result = new String[heights.length];
        int idx = 0;
        for (int i = heights.length - 1; i >= 0; i--) {
            result[idx] = heightMap.get(heights[i]);
            idx++;
        }

        System.out.println(heightMap); // {180=Mary, 165=John, 170=Emma}
        System.out.println(Arrays.toString(heights)); // [165, 170, 180] // sorted
        System.out.println(Arrays.toString(names)); // [[Mary, John, Emma] // not sorted
        System.out.println(heightMap.get(heights[0])); // John
        System.out.println(heightMap.get(heights[1])); // Emma
        System.out.println(heightMap.get(heights[2])); // Mary
        System.out.println(Arrays.toString(result)); // [Mary, Emma, John] // rearranged

        for (Map.Entry<Integer, String> entry : heightMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            // 180 Mary
            // 165 John
            // 170 Emma
            
        }

    }
    
}
