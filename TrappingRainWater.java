public class TrappingRainWater {
    public int trap(int[] height) {
        if (height == null || height.length < 3) {
            return 0;
        }

        int l = 0, r = height.length - 1;
        int res = 0;
        int maxleft = height[l], maxright = height[r];
        while (l < r) {
            if (height[l] < height[r]) {
                l++;
                maxleft = Math.max(maxleft, height[l]);
                res += maxleft - height[l];
            } else {
                r--;
                maxright = Math.max(maxright, height[r]);
                res += maxright - height[r];
            }
        }
        return res;
    }
}
