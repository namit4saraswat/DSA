package arrays;

public class MoveZeroesToLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 0,0,1 };

		for (int i = 0; i <= nums.length-1; i++) {

			if (nums[i] == 0) {
				for (int j = i; j < nums.length-1; j++) {
					nums[j] = nums[j+1];
				}
				nums[nums.length-1] = 0;
				
				
			}

		}
		
		printArray(nums);

	}

	public static void printArray(int[] arr) {

		for (int n : arr) {
			System.out.print(n + ", ");
		}

	}

}
