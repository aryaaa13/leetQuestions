class Solution {
    public String convert(String s, int numRows) {
         // the zigzag pattern is just the original string.
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        // Create an array of StringBuilder objects, one for each row.
        // This will allow us to build the rows of the zigzag pattern dynamically.
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        // Iterate through each character of the input string.
        for (char c : s.toCharArray()) {
            // Append the current character to the StringBuilder of the current row.
            rows[currentRow].append(c);

            // Change direction when we hit the top or bottom row.
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            // Move to the next row based on the current direction.
            if (goingDown) {
                currentRow++;
            } else {
                currentRow--;
            }
        }

        // Concatenate all the rows to form the final result string.
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    }
