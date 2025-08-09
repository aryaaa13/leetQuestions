class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer for the next non-val element
        
        // Iterate through the array with a second pointer 'i'
        for (int i = 0; i < nums.length; i++) {
            // If the current element is not the value to remove,
            // move it to the k-th position.
            if (nums[i] != val) {
                nums[k] = nums[i];
                // Increment k to point to the next available slot.
                k++;
            }
        }
        
        // k now holds the count of elements not equal to val.
        return k;
    }
}
    