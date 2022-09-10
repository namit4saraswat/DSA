package linkedList;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Node head = null;
		Linked a = new Linked();
		//head = a.insert(12, head);
		head = a.insert(14, head);
		head = a.insert(16, head);
		head = a.insert(18, head);
		head = a.insert(20, head);
		head = a.insert(20, head);
		head = a.insert(20, head);
		head = a.insert(24, head);
		head = a.insert(26, head);
		head = a.insert(26, head);
		head = a.insert(28, head);
		
		
		head = a.removeDuplicate(head);
		a.printList(head);
	}
	
}
