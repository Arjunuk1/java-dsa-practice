import java.util.Arrays;

public class GeeksTraininggfg {
        private int f(int day, int lastTask, int[][] mat, int[][] dp) {
        if (day == 0) {
            int maxi = 0;
            for (int task = 0; task < 3; task++) {
                if (task != lastTask) {
                    maxi = Math.max(maxi, mat[0][task]);
                }
            }
            return maxi;
        }

        if (dp[day][lastTask] != -1) {
            return dp[day][lastTask];
        }

        int maxi = 0;
        for (int task = 0; task < 3; task++) {
            if (task != lastTask) {
                int points = mat[day][task] + f(day - 1, task, mat, dp);
                maxi = Math.max(maxi, points);
            }
        }

        return dp[day][lastTask] = maxi;
    }

    public int maximumPoints(int mat[][]) {
        int n = mat.length;
        int[][] dp = new int[n][4];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return f(n - 1, 3, mat, dp);
    }
}
