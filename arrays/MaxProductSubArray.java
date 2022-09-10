package arrays;

public class MaxProductSubArray {

	public static void main(String[] args) {
		int arr[] = { -2, -3, -10, 0, 50 };
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int op = 0;
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < 0) {
				int temp = max;
				max = min;
				min = temp;
			}

			max = Math.max(max * arr[i], arr[i]);

			min = Math.min(min * arr[i], arr[i]);

			op = Math.max(max, min);

			if (ans < op) {
				ans = op;
			}
		}

		System.out.println(ans);

	}

}
