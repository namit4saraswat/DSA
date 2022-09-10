package arrays;

public class TrappingRainWater {

	public static void main(String[] args) {

		int[] arr = {0,1,0,2,0,3};
		int n = arr.length;
		int[] left = new int[n];
		int[] right = new int[n];
		int water = 0;

		left[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			left[i] = Math.max(arr[i], left[i - 1]);
		}

		right[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			right[i] = Math.max(arr[i], right[i + 1]);
		}

		for (int i = 1; i < arr.length - 1; i++) {
			water = water + (Math.min(left[i], right[i]) - arr[i]);
		}

		System.out.println(water);
	}

}
