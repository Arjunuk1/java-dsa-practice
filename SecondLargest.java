import java.util.Arrays;
import java.util.HashSet;

public class SecondLargest {
    
    static int secondlargestnumber(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : arr){
            set.add(num);
        }

        if (set.size() < 2) {
            throw new IllegalArgumentException("At least two distinct numbers are required");
        }

        final int[] arr2 = new int[set.size()];
        int i = 0;

        for(int num : set){
            arr2[i++] = num;
        }
        Arrays.sort(arr2);

        return arr2[arr2.length - 2];
    } 
}
