package arrays;

public class SortZeroOneRTwo {

	public static void main(String[] args) {

		int[] nums = { 2,1,0,0,2,1,1,1,0,0,2,2 };

		int low = 0;
		int high = nums.length - 1;
		int counter=0;
		while (counter <= high) {
			if (nums[counter] == 0) {
				swap(nums, low, counter);
				Array.printArray(nums);
				System.out.println();
				low++;
				counter++;
			} else if (nums[counter] == 2) {
				swap(nums, counter, high);
				Array.printArray(nums);
				System.out.println();
				high--;
			}else {
				counter++;
			}
		}

		Array.printArray(nums);

	}

	static void swap(int[] arr, int a, int b) {

		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

}
