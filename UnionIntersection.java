import java.util.*;

public class UnionIntersection {
    
    public static void main(String[] args) {
        
        int a[] = {1,2,3,4,5};
        int b[] = {3,4,5,6,7};

        HashSet<Integer> union = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();
        
        for(int x : a){
            union.add(x);
        }
        for(int x : b){
            if(union.contains(x)){
                intersection.add(x);
            }else{
                union.add(x);
            }
        }

        System.out.print(union);
        System.out.print(intersection);
    }
}
