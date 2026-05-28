import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class duplicatequeue {
    
    public static void doublequeue(Queue<Integer> q){
        int size = q.size();

        for(int i = 0;i<size;i++){
            int x = q.poll();

            q.add(x);
            q.add(x);
        }
    }

        public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < n; i++)
        {
            q.offer(sc.nextInt());
        }

        doublequeue(q);

        while(!q.isEmpty())
        {
            System.out.print(q.poll() + " ");
        }
    }
}
