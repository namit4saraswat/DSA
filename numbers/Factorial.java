package numbers;

public class Factorial {

	
	static int fact =1;
	public static void main(String[] args) {
		
		System.out.println(factorial(0));
		

	}
	
	
	
	public static int factorial(int n) {
		
		 fact = fact * n;
		 n--;
		 
		if(n>1) {
			factorial(n);
		}
		if(fact ==0) {
			fact = 1;
		}
		return fact;
	}

}
