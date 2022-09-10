package linkedList;

public class DeleteMNodesAfterNNodes {

	public static void main(String[] args) {
		Node head = null;

		Linked a = new Linked();
		head = a.insert(12, head);
		head = a.insert(14, head);
		head = a.insert(16, head);
		head = a.insert(18, head);
		head = a.insert(20, head);
		head = a.insert(21, head);
		head = a.insert(22, head);
		head = a.insert(23, head);
		head = a.insert(24, head);

		head = a.deleteMNodesAfterN(head, 3, 5);
		a.printList(head);
		
		

	}

}
