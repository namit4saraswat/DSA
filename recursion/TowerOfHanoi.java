package recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		TOH(1,3,3); 
	}
	
	public static void TOH(int start,int end, int n) {
		if(n==1) {
			System.out.println(start + " => " + end);
			return;
		}
		
		int other = 6 - (start + end);
		TOH(start,other,n-1);
		System.out.println(start + " => " + end);
		TOH(other,end,n-1);
	}
}
