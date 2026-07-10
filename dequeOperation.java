import java.util.ArrayDeque;
import java.util.Deque;

public class dequeOperation {
        public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.addLast(10);
        dq.addLast(20);
        dq.addFirst(5);

        System.out.println(dq);

        System.out.println(dq.peekFirst());

        System.out.println(dq.peekLast());

        System.out.println(dq.pollFirst());

        System.out.println(dq);

        System.out.println(dq.pollLast());

        System.out.println(dq);

        System.out.println(dq.isEmpty());

    }
}
