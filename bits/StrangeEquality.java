package bits;

public class StrangeEquality {

	public static void main(String[] args) {
		
		int A=5;
		int X=A-1;
		int Y = A+1;
		 while((A & X)!=0){
			X--;
		}
		 while((A & Y)!=0) {
			 Y++;
		 }
		 
		 
		
	}
	
}
