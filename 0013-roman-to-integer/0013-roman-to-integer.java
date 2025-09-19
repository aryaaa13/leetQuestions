class Solution {
    public int romanToInt(String s) {
         Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Iterate through the string from right to left.
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i));

            // If the current value is less than the previous value, it's a subtraction case (e.g., IV, IX).
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                // Otherwise, it's a standard addition case.
                result += currentValue;
            }
            // Update the previous value for the next iteration.
            prevValue = currentValue;
        }

        return result;
    }
}

   