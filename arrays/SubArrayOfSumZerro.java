package arrays;

import java.util.HashSet;
import java.util.Set;

public class SubArrayOfSumZerro {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		int sum = 0;
		int arr[] = { 3, -77, 42, -16, 6, 6, -12, 9, -5 };
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			if(!set.add(sum)) {
				System.out.println("true");
			}
		}
	}

}
