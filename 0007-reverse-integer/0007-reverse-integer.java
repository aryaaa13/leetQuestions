class Solution {
    public int reverse(int x) {
      int reversedNum = 0;

        while (x != 0) {
            int digit = x % 10;

            // Overflow check for positive numbers
            if (reversedNum > Integer.MAX_VALUE / 10 || (reversedNum == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            // Overflow check for negative numbers
            if (reversedNum < Integer.MIN_VALUE / 10 || (reversedNum == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            reversedNum = reversedNum * 10 + digit;
            x = x / 10;
        }

        return reversedNum;
    }
}  
    