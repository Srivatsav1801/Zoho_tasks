import java.util.*;
class Queue{
	static private int front,back,capacity;
	static private int queue[];
	
	Queue(int c){
		front = back = 0;
		capacity = c;
		queue = new int[capacity];
	}
	
	static void Insert_into_queue(int data){
		if(capacity == back)
		{
			System.out.println("Queue is full");
		}
		else
		{
			queue[back] = data;
			back ++;
		}	
	}
	
	static void Exit_Queue()
    {
        if (front == back) {
            System.out.printf("\nQueue is empty\n");
        }
        else
		{
            for (int i = 0; i < back - 1; i++) {
                queue[i] = queue[i + 1];
            }
			
            if (back < capacity)
                queue[back] = 0;
			
            back--;
        }
    }
	
	static void Queue_Display()
    {
        int i;
        if (front == back) {
            System.out.printf("\nQueue is Empty\n");
            return;
        }
		
        for (i = front; i < back; i++) {
            System.out.printf(" %d <-- ", queue[i]);
        }
    }
}
	public class StaticQueueinjava {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
		System.out.println("Enter the Queue length");
		int n = input.nextInt();
        Queue q = new Queue(n+2);
 
        q.Queue_Display();
		System.out.println("Enter the values to be entered in Queue: ");
		for(int i =0;i<n;i++){
			q.Insert_into_queue(input.nextInt());
		}
		
        q.Queue_Display();
		System.out.println("Insert a value into Queue: ");
        q.Insert_into_queue(input.nextInt());

        q.Queue_Display();
		
        q.Exit_Queue();
		
        q.Exit_Queue();
		
        System.out.printf("\n\nafter two node deletion\n\n");
 
        q.Queue_Display();

    }
}

	
	
	
