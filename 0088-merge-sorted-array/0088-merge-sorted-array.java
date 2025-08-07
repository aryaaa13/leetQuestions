class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int p1 = m - 1; // Last element of nums1's real numbers
        int p2 = n - 1; // Last element of nums2
        int pMerge = m + n - 1; // Last position of nums1

        // Iterate from the end of both arrays
        while (p2 >= 0) {
            // If p1 is valid and nums1's element is greater than nums2's
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[pMerge] = nums1[p1];
                p1--;
            } else {
                // Either p1 is invalid or nums2's element is greater or equal
                nums1[pMerge] = nums2[p2];
                p2--;
            }
            pMerge--;
        }
    }
}  
   