package maths;

import java.util.Arrays;

public class GCDofArray {

	public static void main(String[] args) {
		
		int arr[] = {12,412,121,41};
		Arrays.sort(arr);
		
		int op = GCD(arr[0],arr[1]);
		
		GCDArr(arr,op);
		
	}
	static int i=2;
	static void GCDArr(int[] arr, int a) {
		int res = GCD(arr[i],a);
		if(i == arr.length) {
			System.out.print(res);
		}
		GCDArr( arr, res);
		
	}
	
	static int GCD(int a, int b) {
		int temp = 0;
		if(a<b) {
			temp = a;
			a = b;
			b = temp;
		}
		
		if(b==0) {
			return a;
		}
		
		while(b>0) {
			a = a%b;
			temp = a;
			a = b;
			b = temp;
			
		}
		
		return a;
	}
	
}
