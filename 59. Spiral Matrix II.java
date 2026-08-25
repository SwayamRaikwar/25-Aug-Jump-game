class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int val = 1;
        
        while (top <= bottom && left <= right) {
            // Traverse from left to right along the top boundary
            for (int j = left; j <= right; j++) {
                matrix[top][j] = val++;
            }
            top++;
            
            // Traverse from top to bottom along the right boundary
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = val++;
            }
            right--;
            
            // Traverse from right to left along the bottom boundary
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    matrix[bottom][j] = val++;
                }
                bottom--;
            }
            
            // Traverse from bottom to top along the left boundary
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = val++;
                }
                left++;
            }
        }
        
        return matrix;
    }
}
