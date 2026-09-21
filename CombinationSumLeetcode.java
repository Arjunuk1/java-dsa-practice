import java.util.*;

class CombinationSumLeetcode {
    public void helper(int index, int[] arr, int sum, int target, List<Integer> list, List<List<Integer>> ans) {
        if (index == arr.length) {
            if (sum == target) {
                ans.add(new ArrayList<>(list));
            }
            return;
        }

        if (sum + arr[index] <= target) {
            list.add(arr[index]);
            helper(index, arr, sum + arr[index], target, list, ans);
            list.remove(list.size() - 1);
        }

        helper(index + 1, arr, sum, target, list, ans);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(0, candidates, 0, target, new ArrayList<>(), ans);
        return ans;
    }
}