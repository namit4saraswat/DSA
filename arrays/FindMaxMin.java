package arrays;

public class FindMaxMin {

	public static void main(String[] args) {
		
		int arr[]= {3,77,5,6,2,9,-5};
		int n=arr.length;
		int max=arr[0];
		int min = arr[0];
		for(int i=0;i<n;i++) {
			
			if(arr[i]>max) {
				max=arr[i];
			}if(arr[i]<min) {
				min = arr[i];
			}
			
		}
		
		System.out.println("max val is " + max  + " & min val is " + min);
	}

}
