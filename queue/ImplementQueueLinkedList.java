package queue;

class Node{
	
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

public class ImplementQueueLinkedList {

	Node first;
	Node last;
	int size;
	
	Node getNewNode(int data) {
		return new Node(data);
	}
	
	void insert(int i) {
		if(last == null) {
			first = last = getNewNode(i);
			size++;
			return;
		}
		size++;
		last.next = getNewNode(i);
		last = last.next;
		
	}
	
}
