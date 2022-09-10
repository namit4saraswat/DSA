package arrays;

public class MedianOfTwoArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 5, 6, 7, 8 };
		int[] arr3 = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		int n = arr1.length;
		while (i < arr1.length && j < arr2.length) {

			if (k == n + 1) {
				break;
			}
			if (arr1[i] < arr2[j]) {
				arr3[k] = arr1[i];
				i++;
				k++;
			} else if (arr1[i] > arr2[j]) {
				arr3[k] = arr2[j];
				j++;
				k++;
			} else {
				if (i < j) {
					arr3[k] = arr1[i];
					i++;
					k++;
				} else {
					arr3[k] = arr2[j];
					j++;
					k++;
				}
			}
		}

		if (i == 0) {
			arr3[n] = arr1[i];
		} else if (j == 0) {
			arr3[n] = arr2[j];
		}

		System.out.println((arr3[n - 1] + arr3[n]) / 2);

		Array.printArray(arr3);
	}

}
