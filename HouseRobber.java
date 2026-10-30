import java.util.Arrays;

public class HouseRobber {
        public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return F(n-1, dp, nums);
    }
    public int F(int ind, int[] dp, int[] nums){
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
        int nottail = F(ind - 1, dp, nums);
        return dp[ind] = Math.max(tail, nottail);
    }
}
