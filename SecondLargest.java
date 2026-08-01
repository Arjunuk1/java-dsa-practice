import java.util.*;

public class SecondLargest {
    
    static int secondlargestnumber(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : arr){
            set.add(num);
        }

        int arr2[] = new int[set.size()];
        int i = 0;

        for(int num : set){
            arr2[i++] = num;
        }
        Arrays.sort(arr2);

        return arr2[arr2.length - 2];
    } 
}
