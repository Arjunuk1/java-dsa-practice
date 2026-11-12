public class TrappingRainWater {
    public int trap(int[] height) {
        if (height == null || height.length < 3) {
            return 0;
        }

        int l = 0, r = height.length - 1;
        int trappedWater = 0;
        int maxleft = height[l], maxright = height[r];
        while (l < r) {
            if (height[l] < height[r]) {
                l++;
                maxleft = Math.max(maxleft, height[l]);
                trappedWater += maxleft - height[l];
            } else {
                r--;
                maxright = Math.max(maxright, height[r]);
                trappedWater += maxright - height[r];
            }
        }
        return trappedWater;
    }
}
