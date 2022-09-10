package maths;

public class GCD {

	//Euclid's Algo
	public static void main(String[] args) {
		
		int a = 49;
		int b = 14;
		int temp = 0;
		if(a<b) {
			temp = a;
			a = b;
			b = temp;
		}
		
		if(b==0) {
			System.out.println(a);
		}
		
		while(b>0) {
			a = a%b;
			temp = a;
			a = b;
			b = temp;
			
		}
		
		System.out.println(a);
		
	}
	
}
