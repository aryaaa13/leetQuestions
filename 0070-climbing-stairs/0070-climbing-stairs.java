import java.util.Arrays;

class Solution {
    public int climbStairs(int n) {
      if (n<=1) return n;

      int climbStairs [] = new int[n+1];
      climbStairs[0] = 1;
      climbStairs[1] = 1;

      for (int i=2; i<=n; i++){
        climbStairs[i] = climbStairs[i-1] + climbStairs[i-2];
      }
      return climbStairs[n];
    }
}
