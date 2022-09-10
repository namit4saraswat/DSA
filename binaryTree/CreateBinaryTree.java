package binaryTree;

public class CreateBinaryTree {

	public static void main(String[] args) {
		
		BinaryTreeClass a = new BinaryTreeClass();
		Node root =  a.createNewNode(12);
		root.left = a.createNewNode(7);
		root.right = a.createNewNode(5);
		root.left.left = a.createNewNode(2);
		root.left.right = a.createNewNode(6);
		root.left.right.left = a.createNewNode(5);
		root.left.right.right = a.createNewNode(11);
		root.right.right = a.createNewNode(9);
		root.right.right.left = a.createNewNode(4);
		
		//Printing the tree
		//Inorder
		//Left - Root - Right
		//preorder
		//Root - Left - Right
		//postOrder
		//Left - Right - Root
		
		System.out.println("Inorder:-");
		a.inorder(root);
		
		System.out.println();
		System.out.println("preOrder:-");
		a.preOrder(root);
		
		System.out.println();
		System.out.println("postOrder:-");
		a.postOrder(root);
		
	}
	
}
