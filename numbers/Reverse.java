package numbers;

public class Reverse {

	public static void main(String[] args) {
		
		int n = 1512;
		int rev=0;
		do {
			rev = rev*10 + n%10;
			n=n/10;
		}while(n/10>0);
		
		rev = rev * 10 + n%10;
		System.out.println(rev);
	}
	
}
