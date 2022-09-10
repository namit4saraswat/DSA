package arrays;

public class Kadane {

	// to get the maximum continuous sub array sum
	public static void main(String[] args) {

		int arr[] = { -51, 10, 10, 10, 10, 10, -20, 10 };
		int max_sum = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {

//			sum = sum + arr[i];
//			if (max_sum < sum) {
//				max_sum = sum;
//			}
//			if (sum < 0) {
//				sum = 0;
//			}
			
			
			sum = Math.max(sum  + arr[i], arr[i]);
			
			if (max_sum < sum) {
				max_sum = sum;
			}
			
			
			
		}

		System.out.println(max_sum);

	}

}
