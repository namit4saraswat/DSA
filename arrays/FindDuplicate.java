package arrays;

public class FindDuplicate {

	public static void main(String[] args) {

		int arr[] = { 2,2,2,2 };
		System.out.println(findDuplicate(arr));
	}

	
	
	public static int findDuplicate(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}
		int n = nums.length;
		int eSum = n * (n - 1) / 2;
		//12    eSum = 10
		return sum - eSum;
	}

}
