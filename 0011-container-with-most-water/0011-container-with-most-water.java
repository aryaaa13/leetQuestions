class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            // Width between two lines
            int width = right - left;

            // Height of container is min of the two lines
            int h = Math.min(height[left], height[right]);

            // Calculate current area
            int area = width * h;

            // Update max area
            maxArea = Math.max(maxArea, area);

            // Move the pointer with smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
    }
