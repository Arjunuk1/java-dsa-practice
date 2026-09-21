import java.util.*;

class CombinationSumII {
    public void helper(int arr[], int n, int target, List<Integer> list, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i = n;i<arr.length;i++){
            if(i > n && arr[i] == arr[i - 1]){
                continue;
            }
             if(arr[i] > target){
                break;
            }
            list.add(arr[i]);
            helper(arr, i+1, target - arr[i], list, ans);
            list.remove(list.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(arr, 0, target, list, ans);
        return ans;
    }
}