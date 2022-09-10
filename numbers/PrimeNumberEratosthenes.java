package numbers;

import java.util.Arrays;

public class PrimeNumberEratosthenes {

	public static void main(String[] args) {
		
		int n=1000;
		
		boolean arr[] = new boolean[n+1];

		Arrays.fill(arr, true);
		
		arr[0]=false;
		arr[1]=false;
		
		for(int i=2 ; i*i<n;i++) {
			
			for(int j=2*i;j<=n;j=j+i) {
				arr[j]=false;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(i + " - " + arr[i]);
		}
		
	}

}
