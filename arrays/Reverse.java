package arrays;

public class Reverse {

	
	public static void main(String[] args) {
		
		int arr[]= {3,5,6,2,9,12};
		int temp=0;
		int n=arr.length;
		for(int i=0;i<n/2;i++) {
			temp = arr[i];
			arr[i] = arr[n-i-1];
			arr[n-i-1] = temp;
			
		}
		
		for(int ele : arr) {
			System.out.print(ele + " ");
		}
		
	}
	
}
