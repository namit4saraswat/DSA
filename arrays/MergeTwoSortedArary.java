package arrays;

public class MergeTwoSortedArary {

	public static void main(String[] args) {

		int[] arr1 = { 2, 5, 7, 8, 9, 34, 247 };
		int[] arr2 = { 2, 6, 7, 8, 96, 468, 3537 };

		int[] arr3 = new int[arr1.length + arr2.length];

		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] > arr2[j]) {
				arr3[k] = arr2[j];
				k++;
				j++;
			} else if (arr1[i] < arr2[j]) {
				arr3[k] = arr1[i];
				i++;
				k++;
			} else {
				if(i<j) {
					arr3[k] = arr1[i];
					i++;
					k++;	
				}else {
					arr3[k] = arr1[j];
					j++;
					k++;
				}
				

			}

		}

		if (i < arr1.length) {
			while (i < arr1.length) {
				arr3[k] = arr1[i];
				i++;
				k++;
			}

		}

		if (j < arr2.length) {
			while (j < arr2.length) {
				arr3[k] = arr2[j];
				j++;
				k++;
			}
		}

		Array.printArray(arr3);

	}

}
