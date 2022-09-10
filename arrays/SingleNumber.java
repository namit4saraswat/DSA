package arrays;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

	public static void main(String[] args) {

		int[] nums = { 4, 1, 2, 1, 2 };

		Set<Integer> set = new HashSet<Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (!set.add(nums[i])) {
				set.remove(nums[i]);
			}
		}

		System.out.println(set.iterator().next());

	}

}
