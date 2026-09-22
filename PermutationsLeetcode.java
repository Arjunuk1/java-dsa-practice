class PermutationsLeetcode {
    public void helper(int arr[], int i, List<Integer> list, List<List<Integer>> ans){
        if(i == arr.length){
            ans.add(new ArrayList(list));
            return;
        }

        for(int j = i;j<arr.length;j++){
            swap(arr,i,j);
            list.add(arr[i]);
            helper(arr,i+1,list,ans);
            list.remove(list.size()-1);
            swap(arr,i,j);
        }
        
    }
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(arr,0,list,ans);
        return ans;
    }

    public void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}