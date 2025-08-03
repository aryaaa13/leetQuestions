class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        //variable to sotre the xor results
        int single = nums[0];

        for (int i = 1; i<n ; i++){
            single = single ^ nums[i];
        }
        return single;
        }
    }
