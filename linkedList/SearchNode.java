package linkedList;

public class SearchNode {

	public static void main(String[] args) {
		Node head = null;

		Linked a = new Linked();
		head = a.insert(12, head);
		head = a.insert(14, head);
		head = a.insert(16, head);
		head = a.insert(18, head);
		head = a.insert(20, head);
	
		System.out.println(a.searchNode(head,16));
		
	}
	
}
