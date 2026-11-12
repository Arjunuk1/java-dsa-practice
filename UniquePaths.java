public class UniquePaths {
    // Uses one row of dynamic-programming state to keep space usage linear.
    public int uniquePaths(int m, int n) {
        if (m <= 0 || n <= 0) {
            return 0;
        }
        if (m == 1 || n == 1) {
            return 1;
        }

        int rows = Math.max(m, n);
        int columns = Math.min(m, n);
        int[] dp = new int[columns];
        dp[0] = 1;

        for (int row = 1; row < rows; row++) {
            for (int column = 1; column < columns; column++) {
                dp[column] += dp[column - 1];
            }
        }

        return dp[columns - 1];
    }
}
