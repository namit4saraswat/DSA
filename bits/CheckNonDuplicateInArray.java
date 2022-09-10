package bits;

public class CheckNonDuplicateInArray {

	public static void main(String[] args) {
		 
		int a = 4;
		
		
		System.out.println(5 ^ 1);
//		System.out.println(a >> 3);
//		System.out.println(a << 1);
//		System.out.println(a | a);// 100 | 100 = 100
//		System.out.println(a & a);// 100 & 100 = 100
//		System.out.println(a ^ a);// 100 ^ 100 = 000
		
		int arr[] = {1,2,2,12,5,1,12,6};
		int ans = 0;
		for(int i: arr) {
			ans = ans ^ i;
		}
		
		System.out.println(ans); // THIS IS THE ANSWER
		
		
		
	}
	
}
