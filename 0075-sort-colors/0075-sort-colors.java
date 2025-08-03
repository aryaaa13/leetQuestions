class Solution {
    public void sortColors(int[] nums) {
      // Two pointers
      int n = nums.length;
      int left = 0;
      int right = n - 1;
      int i = 0;

      while (i <= right) {
        if (nums[i] == 0) {
            swap(nums, i, left);
            left++;
            i++;
        } else if (nums[i] == 2) {
            swap(nums, i, right);
            right--;     
        } else {
            i++;
        }
      }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
} 
      /*  int count0=0, count1=0, count2=0;

        for(int num: nums){
            if  (num==0)  count0++;
            else if (num==1) count1++;
            else count2++;
        }
        int i = 0;

        while (count0--> 0) nums[i++] = 0;
        while (count1--> 0) nums[i++] = 1;
        while (count2--> 0) nums[i++] = 2;
      }
        
}*/