class Solution {
    public boolean isMatch(String s, String p) {
         // dp[i][j] represents whether the first i characters of s can match the first j characters of p.
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;

        // Populate dp table
        for (int i = 0; i <= s.length(); i++) {
            for (int j = 1; j <= p.length(); j++) {
                if (p.charAt(j - 1) == '*') {
                    // Case 1: '*' matches zero of the preceding element.
                    // dp[i][j - 2] checks the match without the "x*" part.
                    dp[i][j] = dp[i][j - 2];
                    
                    // Case 2: '*' matches one or more of the preceding element.
                    // The preceding element is p.charAt(j - 2).
                    // This is a match if the current character of s matches the preceding element of p,
                    // and the substring s[0...i-1] matches the pattern p[0...j].
                    if (i > 0 && (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.')) {
                        dp[i][j] = dp[i][j] || dp[i - 1][j];
                    }
                } else {
                    // Case for '.' and normal characters.
                    // This is a match if the current characters of s and p are a match
                    // and the previous substrings also matched.
                    if (i > 0 && (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.')) {
                        dp[i][j] = dp[i - 1][j - 1];
                    }
                }
            }
        }
        return dp[s.length()][p.length()];
    }
}
   