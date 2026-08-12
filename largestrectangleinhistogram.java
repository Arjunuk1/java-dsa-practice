public class largestrectangleinhistogram {
        public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        
        for (int i = 0; i < n; i++) {
            int L = -1;
            int R = n;
            int h = heights[i];
            for (int j = i - 1; j >= 0; j--) {
                if (heights[j] < h) {
                    L = j;
                    break;
                }
            }
            for (int j = i + 1; j < n; j++) {
                if (heights[j] < h) {
                    R = j;
                    break;
                }
            }
            int area = h * (R - L - 1);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}
