package binaryTree;

class Node {

	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

}

public class BinaryTreeClass {

	public Node createNewNode(int data) {
		Node a = new Node(data);
		return a;
	}

	void inorder(Node n) {
		if (n == null) {
			return;
		}
		inorder(n.left);
		System.out.print(n.data + " ");
		inorder(n.right);

	}

	void preOrder(Node n) {

		if (n == null) {
			return;
		}
		System.out.print(n.data + " ");
		preOrder(n.left);
		preOrder(n.right);
	}

	void postOrder(Node n) {

		if (n == null) {
			return;
		}

		postOrder(n.left);
		postOrder(n.right);
		System.out.print(n.data + " ");
	}

	int sumOfNodes(Node n) {

		if (n == null) {
			return 0;
		}

		return (n.data + sumOfNodes(n.left) + sumOfNodes(n.right));

	}

	int i = -1;

	Node buildTree(int[] arr) {
		i++;
		Node root = new Node(arr[i]);
		root.left = buildTree(arr);
		root.left = buildTree(arr);
		if (i < arr.length) {
			buildTree(arr);
		}
		return root;
	}

	int getDifferenceEvenOdd(Node n) {
		if (n == null) {
			return 0;
		}

		return (n.data - getDifferenceEvenOdd(n.left) - getDifferenceEvenOdd(n.right));

	}

	int count = 0;

	int numberOfNodes(Node n) {
		if (n == null) {
			return 0;
		}

		return 1 + numberOfNodes(n.left) + numberOfNodes(n.right);
	}

	int leaf = 0;

	int numberOfLeafNodes(Node n) {
		if (n == null) {
			return 0;
		}

		if (n.left == null && n.right == null) {
			leaf++;
		}
		numberOfLeafNodes(n.left);
		numberOfLeafNodes(n.right);
		return leaf;

	}

	int height = 0;

	int getHeightOfTree(Node n) {

		if (n == null) {
			return 0;
		}

		return 1 + getHeightOfTree(n.left) + getHeightOfTree(n.right);
	}
	
	int count2 = 0;
	void printElementAtLevel(Node n, int level) {
		
		if(n == null) {
			return;
		}
		
		if(level == 1) {
			System.out.println(n.data + " ");
			return;
		}
		
		printElementAtLevel(n.left, level-1);
		printElementAtLevel(n.right, level-1);
		
	}

}
