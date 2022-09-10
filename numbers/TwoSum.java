package numbers;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=  {3,3};
		twoSum(arr,6);
	}

	public static int[] twoSum(int[] nums, int target) {

		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int[] arr = new int[2];
		
		for (int i = 0; i < nums.length; i++) {

			if(map.containsKey(target - nums[i])) {
				arr[0]=i;
				arr[1]=map.get(target-nums[i]);
			}
			
			map.put(nums[i], i);
		}

		System.out.println(arr[0] + " "+ arr[1]);
		
		return arr;
		
	}

}
