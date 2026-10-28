public class UniquePaths {
    public int uniquePaths(int m, int n) {
        if (m <= 0 || n <= 0) {
            return 0;
        }
        if (m == 1 || n == 1) {
            return 1;
        }

        int[] dp = new int[n];
        dp[0] = 1;

        for (int row = 0; row < m; row++) {
            for (int column = 1; column < n; column++) {
                dp[column] += dp[column - 1];
            }
        }

        return dp[n - 1];
    }
}
