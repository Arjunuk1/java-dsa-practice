public class maxConsecutivesOnes3 {
        public int longestOnes(int[] nums, int k) {
        int j = 0;
        int flipped = 0;
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) flipped++;
            while (flipped > k) {
                if (nums[j] == 0) flipped--;
                j++;
            }
            res = Math.max(res, i - j + 1);
        }

        return res;
    }
}
