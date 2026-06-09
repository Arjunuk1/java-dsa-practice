public class SimpleQueue {
    int arr[];
    int rear, front, size;

    SimpleQueue(int size){
        this.size = size;
        arr  =new int[size];
        front = -1;
        rear = -1;
    }

    public void enqueue(int data){
        if(front == size - 1){
            System.out.println("Queue is Full");
            return;
        }
        if(front == -1){
            front = 0;
        }

        rear++;
        arr[rear] = data;
        System.out.println(data + " Inserted");
    }

    public void dequeue(){
        if(front == -1 || front > rear){
            System.out.println("Queue is Empty");
            return;
        }

        front++;
    }

    public void display(){
        if(front == -1 || front > rear){
            System.out.println("Queue is Empty");
            return;
        }

        for(int i = front;i<=rear;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SimpleQueue q = new SimpleQueue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.dequeue();
        q.display();
    }
}