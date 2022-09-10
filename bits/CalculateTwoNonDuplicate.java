package bits;

public class CalculateTwoNonDuplicate {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 1, 3, 12, 5 };
		int a=0;int b=0;
		int xor_all = 0;

		for (int i : arr) {
			xor_all = xor_all ^ i;
		}
		//101 010  : 1 1 1

		int ind =0;
		for(int i=0;i<32;i++) {
			
			if((xor_all & (1 << i)) >0) {
				ind = i;
				break;
			}
			
			
		}
		
		for(int i : arr) {
			if((i & (1 << ind)) > 0) {
				a = a ^ i;
			}
			if((i & (1 << ind)) == 0) {
				b = b ^ i;
			}
		}
		
		System.out.println(a + " " + b);
	}

}
