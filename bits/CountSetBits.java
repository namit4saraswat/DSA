package bits;

public class CountSetBits {

	public static void main(String[] args) {
		int a = 32;
		int count=0;
		
			while(a>0) {
				if((a & 1) > 0) {
					count++;
					
				}
				a = a >> 1;
			}
			
		System.out.println(count);
		
	}
	
}
