import java.util.*;

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class printTheList {
    

    public void forwardPrint(Node head){
        if(head == null) return;

        System.out.print(head.data + "-");

        forwardPrint(head.next);
    }

    public void backwardPrint(Node head){
        if(head == null) return;

        backwardPrint(head.next);

        System.out.print(head.data + "-");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            printTheList obj = new printTheList();
            
            while (t-- > 0) {
                int n = sc.nextInt();
                Node head = null;
                Node tail = null;
                
                for (int i = 0; i < n; i++) {
                    int val = sc.nextInt();
                    Node newNode = new Node(val);
                    if (head == null) {
                        head = newNode;
                        tail = newNode;
                    } else {
                        tail.next = newNode;
                        tail = newNode;
                    }
                }
                
                obj.forwardPrint(head);
                System.out.println();
                obj.backwardPrint(head);
                System.out.println();
            }
        }
        sc.close();
    }
}
