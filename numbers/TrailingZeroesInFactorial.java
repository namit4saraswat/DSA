package numbers;

public class TrailingZeroesInFactorial {
	
	public static void main(String[] args) {
		
		
		int n = 30;
		int output=0;
		int i=1;
		while(n > 5 * i) {
			output = (n /(5*i)) + output;
			i=i*5;
		}
		System.out.println(output);
	}
	
	
}
