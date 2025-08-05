class Solution {
    public int findKthPositive(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int count = 0;
        int i = 1;
        while (true) {
            if (!set.contains(i)) {
                count++;
                if (count == k) {
                    return i;
                }
            }
            i++;
        }
    }
}   
    