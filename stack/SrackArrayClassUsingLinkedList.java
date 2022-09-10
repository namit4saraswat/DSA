package stack;

class Node {

	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class SrackArrayClassUsingLinkedList {

	Node front;

	private Node getNewNode(int i) {
		return new Node(i);
	}

	void push(int i) {
		if (front == null) {
			front = getNewNode(i);
			System.out.println(i + " inserted");
			return;
		}

		Node t = getNewNode(i);
		t.next = front;
		front = t;
		System.out.println(i + " inserted");
	}

	void pop() {
		if(front == null) {
			System.out.println("Stack is empty nothing to remove");
		}
		int t = front.data;
		front = front.next;
		
		System.out.println(t + " removed");
		
	}
}
