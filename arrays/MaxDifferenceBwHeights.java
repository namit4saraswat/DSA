package arrays;

import java.util.Arrays;

public class MaxDifferenceBwHeights {

	public static void main(String[] args) {

		int arr[] = {1, 5, 15, 10};   
		int k =3;
		
		Arrays.sort(arr);
		int op = Integer.MAX_VALUE;
		for(int i=0;i<arr.length-1;i++) {
			int diff = Math.max(arr[i]+k, arr[arr.length-1]-k) - Math.min(arr[0]+k, arr[i+1]-k );
			if(diff < op) {
				op = diff;
			}
			
		}
		
		if(op<0) {
			System.out.println(op * -1);
		}else {
			System.out.println(op);
		}
		

	}

}
