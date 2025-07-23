class Solution {
    public int findMin(int[] nums) {
       int left = 0;
       int right = nums.length-1;

       while(left < right){
        int mid = left + (right-left)/2;
        if (nums[mid] > nums[right]){
            left = mid+1;
        }
        else {
            right = mid;
        }
       }
       return nums[left];
 }
}
       
       
       
       
       
       
       
       
       
       
       
       /* int n = nums.length;
       
        int min_val = nums[0]; 

        
        for (int i = 1; i < n; i++) {
            
            if (nums[i] < min_val) {
                min_val = nums[i];
            }
        }
        return min_val; 
    }
}*/