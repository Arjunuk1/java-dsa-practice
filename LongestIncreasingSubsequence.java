import java.util.Arrays;

public class LongestIncreasingSubsequence {
        private int f(int ind, int prev_ind, int[] nums, int[][] dp) {
        if (ind == nums.length) {
            return 0;
        }

        if (dp[ind][prev_ind + 1] != -1) {
            return dp[ind][prev_ind + 1];
        }

        int notTake = f(ind + 1, prev_ind, nums, dp);

        int take = 0;
        if (prev_ind == -1 || nums[ind] > nums[prev_ind]) {
            take = 1 + f(ind + 1, ind, nums, dp);
        }

        return dp[ind][prev_ind + 1] = Math.max(take, notTake);
    }

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return f(0, -1, nums, dp);
    }
}
