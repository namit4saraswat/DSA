package linkedList;

//https://www.youtube.com/watch?v=dBBm5pltWe4&list=PLt4nG7RVVk1gDMcCZkpjOxZS4XMro29DU
class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

//creating this class for generic methods like insert, remove, add etc.
class Linked {

	private Node getnewNode(int i) {
		return new Node(i);
	}

	String printList(Node n) {
		if (n == null) {
			System.out.println("Linked list is empty");
			return null;
		}
		System.out.print(n.data + " ");
		if (n.next != null) {
			printList(n.next);
		}
		return null;
	}

	Node insertAtBeg(Node root, int i) {
		Node rootNew = getnewNode(i);
		rootNew.next = root;
		return rootNew;

	}

	String printListIterative(Node n) {
		if (n == null) {
			System.out.println("Linked list is empty");
			return null;
		}
		while (n.next != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.print(n.data + " ");
		return null;
	}

	public Node insert(int i, Node n) {
		if (n == null) {
			return getnewNode(i);
		} else {
			n.next = insert(i, n.next);
		}

		return n;
	}

	public Node insertIterative(int i, Node n) {
		if (n == null) {
			return getnewNode(i);
		} else {
			Node firstNode = n;
			while (n.next != null) {
				n = n.next;
			}
			n.next = getnewNode(i);
			return firstNode;
		}

	}

	Node insertElementAtPosition(Node n, int i, int pos) {

		if (n == null && pos == 1) {
			return getnewNode(i);
		}
		if (pos == 1) {
			Node temp = getnewNode(i);
			temp.next = n.next;
			n.next = temp;

			return n;
		}

		insertElementAtPosition(n.next, i, pos - 1);

		return n;
	}

	Node deleteLastNode(Node n) {
		Node oneBefore = null;
		if (n == null) {
			System.out.println("LL is empty");
		}
		if (n.next == null) {
			oneBefore = n;
		}
		while (n.next != null) {
			oneBefore = n;
			n = n.next;
		}

		oneBefore.next = null;
		return oneBefore;

	}

	Node deleteFrontNode(Node n) {

		Node oldHead = n;
		n = n.next;
		oldHead.next = null;
		return n;

	}

	// 14 15 16 17 18 19
	Node deleteFromPoition(Node n, int pos) {
		Node head = n;
		while (pos > 1) {
			n = n.next;
			pos--;
		}
		Node temp = n.next.next;
		n.next.next = null;
		n.next = temp;
		return head;

	}

	int getSize(Node n) {
		int count = 0;
		while (n.next != null) {
			count++;
			n = n.next;
		}
		count++;
		return count;
	}

	int searchNode(Node n, int i) {
		int count = 0;
		while (n.data != i) {
			count++;
			n = n.next;
		}

		return count;
	}

	Node rotateLinkedListClockWise(Node n, int k) {
		Node head = n;
		int size = getSize(n);
		Node tmp = n;
		int i = 1;
		while (i < size - k) {
			i++;
			tmp = tmp.next;
		}

		Node tmp2 = tmp;
		tmp = tmp.next;
		Node newHead = tmp;
		while (tmp.next != null) {
			tmp = tmp.next;
		}
		tmp2.next = null;
		tmp.next = head;

		return newHead;

	}

	Node reverseList(Node n) {
		if (n == null || n.next == null) {
			return n;
		}

		Node temp = reverseList(n.next);
		n.next.next = n;

		n.next = null;

		return temp;
	}

	Node reverseListItr(Node n) {
		Node head = n;
		Node temp1=null;
		Node temp =null;
		while(temp.next.next != null) {
			temp = n.next.next;
			temp1 = n.next;
			temp1.next = n;
			temp.next = temp1;
			n = null;
		}
		
		temp.next = temp1;
		return n;
	}

	int getMiddleNode(Node n) {
		Node a = n;
		Node b = n;

		while (b.next != null) {
			a = a.next;
			if ((b.next.next == null)) {
				b = b.next;
			} else {
				b = b.next.next;
			}

		}

		return a.data;
	}

	void sort(Node n) {

	}

	Node mergeTwoList(Node head1, Node head2) {
		Node head = head1;
		while (head1.next != null) {
			head1 = head1.next;
		}
		head1.next = head2;

		return head;

	}

	Node removeDuplicate(Node n) {
		if (n.next == null || n == null) {
			return n;
		}
		if (n.next.data == n.data) {
			n.next = n.next.next;
			removeDuplicate(n);
		} else {
			removeDuplicate(n.next);
		}

		return n;

	}

	// 8 12 15 19 25 7 12 16 19 22
	Node getUnion(Node h1, Node h2) {

		while (h1.next == null && h2.next == null) {

		}	

		return null;
	}

	Node deleteMNodesAfterN(Node node, int m, int n) {
		Node head = node;
		int i = 1;
		while (i < n) {
			i++;
			node = node.next;
		}
		int j = 0;
		Node temp = node.next;
		while (j < m) {
			j++;
			temp = temp.next;

		}

		node.next.next = null;
		node.next = temp;
		return head;
	}

}

public class LinkedListClass {

	public static void main(String[] args) {

		Node head = null;

		Linked a = new Linked();
		head = a.insert(12, head);
		head = a.insert(14, head);
		head = a.insert(16, head);
		head = a.insert(18, head);

		a.printListIterative(head);

	}

}
