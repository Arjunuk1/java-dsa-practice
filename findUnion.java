import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
    }
}

public class findUnion {
    
    public static Node Union(Node head1, Node head2){

        TreeSet<Integer> set = new TreeSet<>();

        Node temp = head1;

        while(temp != null){
            set.add(temp.data);
            temp = temp.next;
        }

        temp = head2;

        while(temp!=null){
            set.add(temp.data);
            temp = temp.next;
        }

        Node dummy = new Node(0);
        Node curr = dummy;
        for(int x : set){
            curr.next = new Node(x);
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Node head1 = null, tail1 = null;
            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                Node newNode = new Node(val);
                if (head1 == null) {
                    head1 = newNode;
                    tail1 = newNode;
                } else {
                    tail1.next = newNode;
                    tail1 = newNode;
                }
            }
            
            int m = sc.nextInt();
            Node head2 = null, tail2 = null;
            for (int i = 0; i < m; i++) {
                int val = sc.nextInt();
                Node newNode = new Node(val);
                if (head2 == null) {
                    head2 = newNode;
                    tail2 = newNode;
                } else {
                    tail2.next = newNode;
                    tail2 = newNode;
                }
            }
            
            Node res = Union(head1, head2);
            while (res != null) {
                System.out.print(res.data + " ");
                res = res.next;
            }
            System.out.println();
        }
        sc.close();
    }
}
