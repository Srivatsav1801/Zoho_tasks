import java.util.*;
class DoublyLinkedList {
    Node head;
	Node tail;

    static class Node {
        int data;
		Node prev;
        Node next;	

        Node(int d) {
            data = d;
			prev = null;
			next = null;
        }
    }
	
	public void traverseForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void traverseBackward() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void delete(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                } else {
                    head = temp.next;
                }
                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                } else {
                    tail = temp.prev;
                }
                return;
            }
            temp = temp.next;
        }
    }
	
	public void update(int key,int rep){
		Node temp = head;
		if(temp.data == key){
			temp.data = rep;
		}
		else{
			while(temp.data!=key&& temp.next !=null){
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
			while(temp.data!=key&&temp.next!= null){
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
class Dls{

    public static void main(String[] args) {
		int n,i,key,replacement;
        DoublyLinkedList list = new DoublyLinkedList();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no of elements to be linked");
		n = input.nextInt();
		for(i=0;i<n;i++){
			list.append(input.nextInt());
		}
		System.out.println("traverse Forward");
		list.traverseForward();
		System.out.println("traverse Backward");
		list.traverseBackward();
		System.out.println("Enter the element to be inserted at start:");
        list.insert(input.nextInt());
		list.traverseForward();
        System.out.println("Enter the element to be deleted:");
        list.delete(input.nextInt());
		list.traverseForward();
		System.out.println("Enter the element to be updated");
		key = input.nextInt();
		list.traverseForward();
		System.out.println("Enter the replacement element:");
		replacement = input.nextInt();
		list.update(key,replacement);
		System.out.println("Enter the element that need to be found:");
		list.find(input.nextInt());
        list.traverseForward();
    }
}
