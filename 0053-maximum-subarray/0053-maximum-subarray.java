class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum=nums[0], sum=nums[0];
        for(int i=1; i<n; i++){
            if(sum>=0){
                sum = sum+nums[i];
            }
            else{
                sum = nums[i];
            }
            if (sum>maxSum){
                maxSum= sum;
            }
        }
        return maxSum;     
    }
}