package linkedList;

public class InsertElementAtBegining {

	public static void main(String[] args) {

		Node head = null;

		Linked a = new Linked();
		head = a.insert(12, head);
		head = a.insert(14, head);
		head = a.insert(16, head);
		head = a.insert(18, head);

		a.printListIterative(head);

		head = a.insertAtBeg(head, 5);

		System.out.println();
		a.printListIterative(head);

	}

	void insert(Node n) {

	}

}
