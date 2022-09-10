package binaryTree;

public class RecursionTest {

	void recursions(int i) {
		System.out.println("------> calling recursions(" + i + ")");
		if (i == 1) {
			System.out.println(i);
			return ;
		} else {
			System.out.println("line11");
			recursions(i - 1);
			System.out.println("jkk");
			
		}
	}
	
	
	public static void main(String[] args) {

		RecursionTest r = new RecursionTest();
		r.recursions(2);
	}
}
