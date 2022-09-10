package binaryTree;

public class BuildTreeFromPreOrderArray {

	public static void main(String[] args) {
		
		BinaryTreeClass a = new BinaryTreeClass();
		
		int arr[] = {1,2,4,25,62,12,52,67};
		Node root = a.buildTree(arr);
		
	}
	
}
