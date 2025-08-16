import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    // Declare and initialize the class fields
    private List<String> combinations = new ArrayList<>();
    private Map<Character, String> letters = new HashMap<>();
    private String phoneDigits;

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return combinations;
        }

        letters.put('2', "abc");
        letters.put('3', "def");
        letters.put('4', "ghi");
        letters.put('5', "jkl");
        letters.put('6', "mno");
        letters.put('7', "pqrs");
        letters.put('8', "tuv");
        letters.put('9', "wxyz");

        phoneDigits = digits;
        backtrack(0, new StringBuilder());
        return combinations;
    }

    private void backtrack(int index, StringBuilder path) {
        if (path.length() == phoneDigits.length()) {
            combinations.add(path.toString());
            return;
        }

        char digit = phoneDigits.charAt(index);
        String possibleLetters = letters.get(digit);

        for (char letter : possibleLetters.toCharArray()) {
            path.append(letter);
            backtrack(index + 1, path);
            path.deleteCharAt(path.length() - 1);
        }
    }
}