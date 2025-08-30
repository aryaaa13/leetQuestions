class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int low = 0;
        int high = m;
        int halfLen = (m + n + 1) / 2;

        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = halfLen - partitionX;

            // Get the values at the partition boundaries
            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minRightX = (partitionX == m) ? Integer.MAX_VALUE : nums1[partitionX];
            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minRightY = (partitionY == n) ? Integer.MAX_VALUE : nums2[partitionY];

            // Check if the partitions are valid
            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {
                // We have found the correct partition
                if ((m + n) % 2 == 0) {
                    // Even number of elements
                    return (Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
                } else {
                    // Odd number of elements
                    return Math.max(maxLeftX, maxLeftY);
                }
            } else if (maxLeftX > minRightY) {
                // Partition in nums1 is too far to the right, move it left
                high = partitionX - 1;
            } else {
                // Partition in nums2 is too far to the right, move it left
                low = partitionX + 1;
            }
        }
        throw new IllegalArgumentException("Input arrays are not sorted or have invalid values.");
    }
}
  