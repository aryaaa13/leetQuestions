class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap <Integer, Integer> map = new HashMap <>();
    
    for (int i = 0 ; i<nums.length; i++){
      int curr = nums[i];
    
      int secnum = target - curr;

      if (map.containsKey(secnum)){
        return new int[] {map.get(secnum), i};
      }
      map.put(curr, i);
    }

   return new int[0];
  }
}
