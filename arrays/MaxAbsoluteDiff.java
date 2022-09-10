package arrays;

public class MaxAbsoluteDiff {

	public static void main(String[] args) {

		int arr[] = {3, -2, 5, -4 };
		// |arr[i]-arr[j]| + |i-j|

		int max1=Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE;
		int max2=Integer.MIN_VALUE;
		int min2 = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(max1<arr[i]+i) {
				max1= arr[i]+i;
			}
			if(min1>arr[i]+i) {
				min1 = arr[i]+i;
			}
			if(max2<arr[i]-i) {
				max2= arr[i]-i;
			}
			if(min2>arr[i]-i) {
				min2 = arr[i]-i;
			}
		}
		
		
		
		System.out.println(Math.max(max2-min2, max1-min1));

	}

}
