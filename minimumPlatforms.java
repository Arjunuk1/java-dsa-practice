import java.util.Arrays;

public class minimumPlatforms {
        public int minPlatform(int arr[], int dep[]) {
        
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i = 0, j = 0, ans = 0,plat=0;
        while(i < arr.length){
            if(arr[i] <= dep[j]){
                i++;plat++;
                ans=Math.max(ans,plat);
            }
            else{
                plat--;j++;
            }
        }
        return ans;
    }
}
