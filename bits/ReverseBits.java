package bits;

public class ReverseBits {

	public static void main(String[] args) {
		
		int a = 3;
		int ans = 0;
		for(int i=0;i<32;i++) {
			if((a & (1 << i)) > 0) {
				ans = ans | 1;
				
			}else {
				ans = ans | 0;
				
			}
			
			ans = ans << 1;
		}
		
		System.out.println(ans);
	}
	
}
