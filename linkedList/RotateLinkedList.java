package linkedList;

public class RotateLinkedList {

	public static void main(String[] args) {
		Node head = null;

		Linked a = new Linked();
		head = a.insert(12, head);
		head = a.insert(14, head);
		head = a.insert(16, head);
		head = a.insert(18, head);
		head = a.insert(20, head);
	
		//12 14 16 18 20 
		//after rotating by 2
		//18 20 12 14 16
		a.printList(head);
		head = a.rotateLinkedList(head, 2);
		System.out.println();
		a.printList(head);
		
	}
	
}
