package BinarySearch;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        final int ROWS = matrix.length, COLS = matrix[0].length;
        int l = 0, r = ROWS * COLS - 1;
        while (l <= r) {
            int mid = (l + r) >>> 1;
            int row = mid / COLS, col = mid % COLS;
            if (target > matrix[row][col]) {
                l = mid + 1;
            } else if (target < matrix[row][col]) {
                r = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
