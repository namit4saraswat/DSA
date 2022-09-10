package arrays;

public class CountInversion {

	public static void main(String[] args) {

		int[] arr = { 3, 1, 2 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (i < j && arr[i] > arr[j]) {
					count++;
				}
			}
		}

		System.out.println(count);

	}
}
