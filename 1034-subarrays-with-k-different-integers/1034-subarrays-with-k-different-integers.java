class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
       return countAtMost(nums, k) - countAtMost(nums, k - 1);
    }

    private int countAtMost(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }

        int count = 0;
        int left = 0;
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {
            // Expand the window by moving the right pointer
            freqMap.put(nums[right], freqMap.getOrDefault(nums[right], 0) + 1);

            // Shrink the window if the number of distinct elements exceeds k
            while (freqMap.size() > k) {
                freqMap.put(nums[left], freqMap.get(nums[left]) - 1);
                if (freqMap.get(nums[left]) == 0) {
                    freqMap.remove(nums[left]);
                }
                left++;
            }

            // The number of valid subarrays ending at 'right' is `right - left + 1`
            count += (right - left + 1);
        }

        return count;
    }
} 