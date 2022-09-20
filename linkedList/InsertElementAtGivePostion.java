package linkedList;

public class InsertElementAtGivePostion {

	public static void main(String[] args) {
		Node head = null;

		Linked a = new Linked();
		head = a.insert(12, head);
		head = a.insert(14, head);
		head = a.insert(16, head);
		head = a.insert(18, head);

		a.printList(head);
		
		head = a.insertElementAtPosition(head, 20, 2);
		System.out.println();	
		a.printList(head);
		
	}

}
