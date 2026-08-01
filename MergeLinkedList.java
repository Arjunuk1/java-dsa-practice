import java.util.Collections;
import java.util.LinkedList;

public class MergeLinkedList {
    
        public static LinkedList<Integer> mergeLinkedLists(LinkedList<Integer> l1, LinkedList<Integer> l2) {

            LinkedList<Integer> result = new LinkedList<>();

            result.addAll(l1);
            result.addAll(l2);

            Collections.sort(result);

            return result;
    }
}
