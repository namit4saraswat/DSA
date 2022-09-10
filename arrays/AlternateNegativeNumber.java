package arrays;

public class AlternateNegativeNumber {

	public static void main(String[] args) {

		int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
		int k = 0;
		for (int i = 1; i < arr.length; i=i+2) {
			if(arr[i-1]<0) {
				k=k+2;
			}
			if (arr[i] < 0) {
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
				
			}
		}

		Array.printArray(arr);
	}
}
