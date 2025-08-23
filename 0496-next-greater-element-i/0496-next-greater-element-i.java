class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        
        for (int i = 0; i < nums1.length; i++) {
            int currentNum = nums1[i];
            int nextGreater = -1;
            boolean found = false;
            
            // Find the position of currentNum in nums2
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == currentNum) {
                    found = true;
                }
                
                // Once found, search for the next greater element
                if (found && nums2[j] > currentNum) {
                    nextGreater = nums2[j];
                    break;
                }
            }
            result[i] = nextGreater;
        }
        return result;
    }
}