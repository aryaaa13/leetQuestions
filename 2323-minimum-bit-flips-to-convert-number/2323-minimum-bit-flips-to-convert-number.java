class Solution {
    public int minBitFlips(int start, int goal) {
        int xorResult = start ^ goal;
        
        // Now we need to count the number of set bits (1s) in xorResult.
        // This is a common operation known as 'population count' or 'popcount'.
        // Java's Integer class has a built-in method for this.
        return Integer.bitCount(xorResult);
    }
}
   