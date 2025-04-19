class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
    int n = nums.length;
    Deque<Integer> dq = new LinkedList<>();
    List<Integer> res = new ArrayList<>();

    for (int i = 0; i < n; i++) {
        while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
            dq.pollLast();
        }
        dq.offerLast(i);

        if (dq.peekFirst() < i - k + 1) {
            dq.pollFirst();
        }
        if (i >= k - 1) {
            res.add(nums[dq.peekFirst()]);
        }
    }
    return res.stream().mapToInt(Integer::intValue).toArray();
}
}
