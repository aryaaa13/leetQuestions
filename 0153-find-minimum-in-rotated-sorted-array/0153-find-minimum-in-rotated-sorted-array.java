class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
       
        int min_val = nums[0]; 

        
        for (int i = 1; i < n; i++) {
            
            if (nums[i] < min_val) {
                min_val = nums[i];
            }
        }
        return min_val; 
    }
}