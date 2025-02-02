import java.util.ArrayList;
// 1380. Lucky Numbers in a Matrix
// Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
// A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
public class LeetCode1380 {
    public static void main(String[] args) {
    int[][] matrix = {{3,7,8},{9,11,20},{15,16,17}};
        int m = matrix.length; // row
        int n = matrix[0].length; // column
        ArrayList<Integer> luckyNumbers = new ArrayList<Integer>();

         for (int i = 0; i < m; i++) { // for each row
            int rowMin = Integer.MAX_VALUE;
            int colIdx = -1;
            for (int j = 0; j < n; j++) { // find the minimum in the same row
                if (matrix[i][j] < rowMin) {
                    rowMin = matrix[i][j];
                    colIdx = j;
                }
            }
            boolean isMaxInCol = true;
            for (int k = 0; k < m; k++) { // compare the row minimum within the same column
                if (matrix[k][colIdx] > rowMin)
                isMaxInCol = false;
                }
                if (isMaxInCol)
                luckyNumbers.add(rowMin);
        }
        System.out.println(luckyNumbers); // [15]
    }
}
