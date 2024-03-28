import java.util.*;
class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }
	
	public void insert(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}

    public void append(int value) {
		Node newNode = new Node(value);
		newNode.next = null;

		if (head == null) {
			head = newNode;
			return;
		}

		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

    public void delete(int key) {
        Node temp = head;
		Node prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while ( temp != null && temp.data != key ) {
            prev = temp;
            temp = temp.next;
        }
		
        if (temp == null){
			return;
		}
        prev.next = temp.next;
    }
	
	public void update(int key,int rep){
		Node temp = head;
		if(temp.data == key){
			temp.data = rep;
		}
		else{
			while(temp.next !=null && temp.data!=key){
				temp = temp.next;
			}
			temp.data = rep;
		}
		
	}
	
	public void find(int key){
		int index = 0;
		Node temp = head;
		if(temp.data == key){
			System.out.println("The value is present at "+index);
		}
		else{
			while( temp.next!= null && temp.data!=key){
				temp = temp.next;
				index ++;
			}
			if(temp.data==key){
				System.out.println("The value is present at "+index);
			}
			else{
				System.out.println("Not Found");
			}
			
		}
		
	}

    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
class Ls{

    public static void main(String[] args) {
        int n,i,key,replacement;
        LinkedList list = new LinkedList();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no of elements to be linked");
		n = input.nextInt();
		for(i=0;i<n;i++){
			list.append(input.nextInt());
		}
		list.printList();
		System.out.println("\nEnter the element to be inserted at start:");
        list.insert(input.nextInt());
		list.printList();
        System.out.println("\nEnter the element to be deleted:");
        list.delete(input.nextInt());
		list.printList();
		System.out.println("\nEnter the element to be updated");
		key = input.nextInt();
		System.out.println("\nEnter the replacement element:");
		replacement = input.nextInt();
		list.update(key,replacement);
		list.printList();
		System.out.println("\nEnter the element that need to be found:");
		list.find(input.nextInt());
        list.printList();
    }
}
