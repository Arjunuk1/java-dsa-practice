import java.util.Arrays;

public class zeroOneKnapsackProblem {
        private int f(int ind, int W, int[] val, int[] wt, int[][] dp) {
        if (ind == 0) {
            if (wt[0] <= W) {
                return val[0];
            }
            return 0;
        }

        if (dp[ind][W] != -1) {
            return dp[ind][W];
        }

        int notTake = f(ind - 1, W, val, wt, dp);

        int take = 0;
        if (wt[ind] <= W) {
            take = val[ind] + f(ind - 1, W - wt[ind], val, wt, dp);
        }

        return dp[ind][W] = Math.max(take, notTake);
    }

    public int knapsack(int W, int val[], int wt[]) {
        if (W <= 0 || val == null || wt == null || val.length == 0) {
            return 0;
        }
        if (val.length != wt.length) {
            throw new IllegalArgumentException("Values and weights must have the same length");
        }

        int n = val.length;
        int[][] dp = new int[n][W + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return f(n - 1, W, val, wt, dp);
    }
}
