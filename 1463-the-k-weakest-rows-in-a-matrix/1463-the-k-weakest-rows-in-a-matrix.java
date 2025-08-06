class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
       List<int[]> rowStrengths = new ArrayList<>();
        int m = mat.length;
        int n = mat[0].length;

        // Step 1 & 2: Count soldiers and store (count, index) pairs
        for (int i = 0; i < m; i++) {
            int soldierCount = 0;
            // Since all 1s are to the left of 0s, we can use a linear scan
            // or a binary search to find the count. A linear scan is simple and fast here.
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    soldierCount++;
                } else {
                    break; // Found the first 0, so we have the count
                }
            }
            rowStrengths.add(new int[]{soldierCount, i});
        }

        // Step 3: Sort based on the weakness criteria
        Collections.sort(rowStrengths, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0]; // Sort by soldier count ascending
            } else {
                return a[1] - b[1]; // If counts are equal, sort by index ascending
            }
        });

        // Step 4: Extract the indices of the k weakest rows
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = rowStrengths.get(i)[1];
        }

        return result;
    }
} 