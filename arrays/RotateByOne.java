package arrays;

public class RotateByOne {

	public static void main(String[] args) {
		int arr[] = { 3, 77, -64, 5, -13, 6, 2, 9, -5 };
		int n = arr.length;

		int arr2[] = new int[n];
		int k = 3;
		for (int i = 0; i < n - k; i++) {
			arr2[i] = arr[i + k];
		}
		
		for (int i = 0; i < k; i++) {
			arr2[i+n-k] = arr[i];
		}
		
		printArray(arr2);

	}

	public static void printArray(int[] arr) {

		for (int n : arr) {
			System.out.print(n + ", ");
		}

	}

}
