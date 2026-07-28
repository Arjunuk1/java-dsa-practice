public class findMinInRotatedSortedArray {
        public int findMin(int[] nums) {
        int s=0,e=nums.length-1;
        if(nums[s]<=nums[e]) return nums[s];
        while(s<e){
            int m = s+(e-s)/2;
            if(nums[m]>nums[e]){
                s = m+1;
            }
            else{
                e = m;
            }
        }
        return nums[s];
    }
}
