import java.util.*;

public class isPalindrome {
    
    public static boolean palindrome(LinkedList<Integer> list){
        if (list == null) {
            return false;
        }

        LinkedList<Integer> values = new LinkedList<>(list);
        while(values.size() > 1){
            if(!values.pollFirst().equals(values.pollLast())){
                return false;
            }
        }
        return true;
    }
}
