class Solution {
    public int trap(int[] height) {
        if (height.length < 3) {
            return 0;
        }
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Fill leftMax array
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Fill rightMax array
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        // Calculate trapped water using the pre-computed arrays
        for (int i = 1; i < n - 1; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }
}
       /* }
        int res = 0;
        for (int i = 1; i<height.length-1; i++){
            int lb = height[i];
            for (int j =0; j<i; j++){
                if (height[j]>lb){
                    lb = height[j];
                }
            }
            int rb = height[i];
            for (int j = i; j < height.length; j++){
                if (height[j] > rb){
                    rb = height[j];
                }
            }
            int wl;
            if (rb>lb){
                wl = lb;
            }
            else{
                wl = rb;
            }
            int tw = wl-height[i];
            res = res + tw;
        }
        return res;
    }
}*/