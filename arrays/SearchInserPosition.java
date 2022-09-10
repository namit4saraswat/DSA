package arrays;

public class SearchInserPosition {

	public static void main(String[] args) {
		
		int[] nums = {1,3,5,6};
		int target = 6;
		int pos=nums.length;
		for(int i=0;i<nums.length;i++) {
			
			if(nums[i]>=target) {
				pos = i;
				break;
			}
			
		}
		
		
		System.out.println(pos);
		
		int low=0;
		int high = nums.length-1;
		int mid = (low + high)/2;
		
		if(nums[mid] == target) {
			System.out.println(mid);
		}else if(nums[mid] > target) {
			high = mid -1;
		}else {
			low = mid+1;
		}

	}

}
