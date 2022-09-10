package arrays;

import java.util.Arrays;

public class ChocolateDistribution {
	public static void main(String[] args) {

		int[] arr = { 3, 4, 1, 9, 56, 7, 9, 12 };
		int m = 5;
		int op = Integer.MAX_VALUE;
		Arrays.sort(arr);

		for (int i = 0; i < arr.length - m; i++) {
			int min = arr[i + m - 1] - arr[i];

			if (op > min) {
				op = min;
			}
		}

		System.out.println(op);
	}
}
