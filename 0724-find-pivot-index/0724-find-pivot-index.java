class Solution {
    public int pivotIndex(int[] nums) {
        int total=0, leftSum=0;
        int n = nums.length;
        for (int num: nums) total+=num;
        for (int i =0; i<n; i++){
            total-=nums[i];
            if (leftSum==total) return i;
                leftSum+=nums[i];
           }
           return -1;
        }
    }