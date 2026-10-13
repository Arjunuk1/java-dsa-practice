import java.util.Arrays;

public class houseRobbery2 {
        public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }

        int[] arr1 = new int[n - 1];
        int[] arr2 = new int[n - 1];

        for (int i = 0; i < n; i++) {
            if (i != 0) arr1[i - 1] = nums[i];
            if (i != n - 1) arr2[i] = nums[i];
        }

        int[] dp1 = new int[n - 1];
        int[] dp2 = new int[n - 1];
        Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        int ans1 = F(n - 2, dp1, arr1);
        int ans2 = F(n - 2, dp2, arr2);

        return Math.max(ans1, ans2);
    }

    public int F(int ind, int dp[], int nums[]) {
        if (ind == 0) {   
            return nums[0];
        }
        if (ind < 0) {
            return 0;
        }
        if (dp[ind] != -1) {
            return dp[ind];
        }

        int tail = nums[ind] + F(ind - 2, dp, nums);
        int nottail = 0 + F(ind - 1, dp, nums);

        return dp[ind] = Math.max(tail, nottail);
    }
}
