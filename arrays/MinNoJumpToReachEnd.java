package arrays;

public class MinNoJumpToReachEnd {

	public static void main(String[] args) {
		int arr[] = {1, 4, 3, 2, 6, 0} ;
		
		int pos = 0;
		int end = arr.length;
		int jump=0;
		while(pos < end-1) {
			pos = pos + arr[pos];
			if(pos>=end) {
				pos = end -1;
			}
			System.out.println("pos value is " + pos);
			jump++;
			if(arr[pos] == 0 && pos != end-1) {
				System.out.println("Element 0 is present, can not reach to end");
				break;
			}
			
			
		}
		
		System.out.println("Jump required are " + jump);
		
	}
	
}
