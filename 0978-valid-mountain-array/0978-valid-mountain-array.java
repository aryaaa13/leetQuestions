class Solution {
    public boolean validMountainArray(int[] arr) {
         int n = arr.length;
        int i = 0;

        // Step 1: Find the "up" part of the mountain
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        // Step 2: Check if there's an actual peak
        // A valid mountain must have both an increasing and decreasing part
        // and the peak can't be at the start or end
        if (i == 0 || i == n - 1) {
            return false;
        }

        // Step 3: Find the "down" part of the mountain
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        // Step 4: Check if the traversal reached the end
        return i == n - 1;
    }
}
   