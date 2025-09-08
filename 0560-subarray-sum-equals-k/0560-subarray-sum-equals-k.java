class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int sum = 0;
        HashMap<Integer,Integer> map1 = new HashMap<>();
        
        for (int i =0; i<n; i++){
            sum = sum + nums[i];

            if (sum==k){
                count++;
            }
            if (map1.containsKey(sum-k)){
                count = count + map1.get(sum-k);
            }
            map1.put(sum, map1.getOrDefault(sum, 0)+1);
        }
        return count;  
        }
        
    }
