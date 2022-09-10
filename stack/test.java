package stack;

public class test {

	public static void main(String[] args) {

		int[] arr = { 0,1,0,2,0,3};
		int water =0;
		for (int i = 1; i < arr.length-1; i++) {
			water = Math.min(max(arr,0,i), max(arr,i,arr.length-1)) - arr[i] + water;
			
			if(water<0) {
				water=0;
			}
		}
		
		System.out.println(water);

	}
	
	static int max(int arr[],int start,int end) {
		int max = 0;
		for(int i =start;i<=end;i++){
			if(arr[i]> max) {
				max = arr[i];
			}
		}
		
		return  max;
	}
}
