package arrays;

import java.util.HashSet;
import java.util.Set;

public class ArrayIsSubArrayOfAnother {

	
	//Use Hashmap instead of Set, as set approach will not work in case of duplicate elements in arr2
	public static void main(String[] args) {
		
		int[] arr1 = {10, 5, 2, 23, 19};
		int[] arr2 = {19, 5, 5};
		
		Set<Integer> set = new HashSet<Integer>();
		for(int i : arr1) {
			set.add(i);
		}
		int n = set.size();
		for(int i : arr2) {
			if(set.add(i)) {
				System.out.println("false");
			}
			
		}
		
		if(set.size() == n) {
			System.out.println("true");
		}
	}

}
