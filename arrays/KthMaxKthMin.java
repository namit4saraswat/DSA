package arrays;

public class KthMaxKthMin {

	public static void main(String[] args) {

		int k=2;
		int arr[] = { 5,6,12,51,2,9,0 };
		int n = arr.length;
		int max = 0;
		int min = 0;
		int temp = 0;
		for (int i = 0; i < k; i++) {
			for (int j = i; j < arr.length-i; j++) {
				if (arr[j] > arr[max]) {
					max = j;
				}
				if (arr[j] < arr[min]) {
					min = j;
				}

			}

			temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;

			temp = arr[n-1-i];
			arr[n-1-i] = arr[min];
			arr[min] = temp;
			
		}
		
		System.out.println( k + "th max is " + arr[k-1] + " & " + k + "th min is " + arr[n-k-1]);

		printArray(arr);
		
	}
	
	public static void printArray(int[] arr) {

		for (int n : arr) {
			System.out.print(n + ", ");
		}

	}

}
