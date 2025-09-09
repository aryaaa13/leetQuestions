class Solution {
    public void setZeroes(int[][] matrix) {
         int m = matrix.length;
        int n = matrix[0].length;
        boolean isFirstRowZero = false;
        boolean isFirstColZero = false;

        // Step 1: Check if the first row and first column need to be zeroed
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                isFirstRowZero = true;
                break;
            }
        }
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                isFirstColZero = true;
                break;
            }
        }

        // Step 2: Use the first row and column as markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Step 3: Zero out marked rows and columns (excluding the first row/column)
        for (int i = 1; i < m; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j = 1; j < n; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 4: Zero out the first row and column if needed
        if (isFirstRowZero) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }
        if (isFirstColZero) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
    