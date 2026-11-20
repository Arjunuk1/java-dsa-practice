import java.util.Arrays;

public class HouseRobber {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return Math.max(0, nums[0]);
        }

        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return maxRobbed(n - 1, dp, nums);
    }

    private int maxRobbed(int ind, int[] dp, int[] nums) {
        if (ind == 0) {
            return Math.max(0, nums[0]);
        }
        if (ind < 0) {
            return 0;
        }
        if (dp[ind] != -1) {
            return dp[ind];
        }
        int tail = nums[ind] + maxRobbed(ind - 2, dp, nums);
        int nottail = maxRobbed(ind - 1, dp, nums);
        return dp[ind] = Math.max(tail, nottail);
    }
}
