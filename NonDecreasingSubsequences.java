import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NonDecreasingSubsequences {
    private void backtrack(int start, int[] nums, List<Integer> current, List<List<Integer>> result) {
        if (current.size() >= 2) {
            result.add(new ArrayList<>(current));
        }

        Set<Integer> used = new HashSet<>();

        for (int i = start; i < nums.length; i++) {
            if (used.contains(nums[i])) continue;

            if (current.isEmpty() || nums[i] >= current.get(current.size() - 1)) {
                used.add(nums[i]);
                current.add(nums[i]);
                backtrack(i + 1, nums, current, result);
                current.remove(current.size() - 1);
            }
        }
    }

    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }
}
