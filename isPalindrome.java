import java.util.*;

public class isPalindrome {
    
    public static boolean palindrome(LinkedList<Integer> list){
        LinkedList<Integer> lst = new LinkedList<>();

        while(lst.size() > 1){
            if(!lst.pollFirst().equals(lst.pollLast())){
                return false;
            }
        }
        return true;
    }
}
