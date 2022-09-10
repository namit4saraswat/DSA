package linkedList;

public class MergeTwoLinkedList {

	public static void main(String[] args) {

		Node head1 = null;
		Node head2 = null;
		Linked a = new Linked();
		head1 = a.insert(12, head1);
		head1 = a.insert(14, head1);
		head1 = a.insert(16, head1);
		head1 = a.insert(18, head1);
		
		Linked b = new Linked();
		head2 = b.insert(112, head2);
		head2 = b.insert(114, head2);
		head2 = b.insert(116, head2);
		head2 = b.insert(118, head2);
		
		a.printList(head1);
		System.out.println();
		b.printList(head2);
		
		Node head = a.mergeTwoList(head1,head2);
		System.out.println();
		a.printList(head);
	}
	
}
