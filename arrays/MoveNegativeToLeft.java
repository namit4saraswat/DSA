package arrays;

public class MoveNegativeToLeft {


	public static void main(String[] args) {

		int arr[] = { 3, 77, -64,5, -13,6, 2, 9, -5 };
		int n = arr.length;
		printArray(arr);
		System.out.println();
		int k=0;
		for (int i = 0; i < n; i++) {
			int temp=0;
			if(arr[i]<0) {
				temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;
				k++;
			}
			
			
		}
		
		printArray(arr);

	}
	
	public static void printArray(int[] arr) {
		
		for(int n: arr) {
			System.out.print(n + ", ");
		}
		
	}

	
}
