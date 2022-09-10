package sorting;

public class RecursionTest {

	public static void main(String[] args) {

		RecursionTest ob = new RecursionTest();
		ob.A(3);
		
	}

	public  void A(int n) {

		if (n <1) {
			return ;
		}
		System.out.println(n); 
		A(n - 1);
		
		A(n - 1);

	}
}

/*
 * 7
 * 
 */
