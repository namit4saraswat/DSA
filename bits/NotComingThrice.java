package bits;

public class NotComingThrice {

	public static void main(String[] args) {
		
		int arr[] = {11,1,11,1,11,1,7,7,7,95};
		int sum = 0;
		int x = 1;
		int ans = 0;
		for(int i=0;i<32;i++) {
			
			sum = 0;
			x = 1<< i;
			
			for(int j=0;j<arr.length;j++) {
				if((arr[j]  & x) > 0  ) {
					sum++;
				}
			}
			
			if(sum % 3 != 0) {
				ans = ans | x;
			}
		}
		
		System.out.println(ans);
	}
	
}
