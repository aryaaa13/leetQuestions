class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        HashMap <Character, Integer > map  = new HashMap<>();
        // int count = 0; // This variable was unused and can be removed.

        // 2. Populate the map with character counts from string 's'.
        // This loop iterates through 's' to build the frequency map.
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // 3. Iterate through string 't' and decrement counts in the map.
        // This uses the existing loop structure, but with correct anagram logic.
        for (int i = 0; i < t.length(); i++){
            char currentChar = t.charAt(i); // Corrected typo from chartAt to charAt

            // Check if the character from 't' exists in the map AND has a count > 0.
            // If not, 't' contains a character not in 's', or too many of it.
            if (!map.containsKey(currentChar) || map.get(currentChar) == 0){
                return false; // Not an anagram
            }

            // If the character is found and its count is positive, decrement its count.
            map.put(currentChar, map.get(currentChar) - 1);
        }

        // 4. If the code reaches this point, it means:
        //    a) The lengths of 's' and 't' were equal.
        //    b) Every character in 't' was found in 's' and its count was successfully decremented.
        //    This implies that all character counts in the map are now zero,
        //    meaning 's' and 't' are anagrams.
        return true;
    }
}