package arrays;

import java.util.HashSet;
import java.util.Set;

public class UnionInterTwoArray {

	public static void main(String[] args) {

		// unionIntersection();
		
		System.out.println("--------------------------------");
		int arr1[] = { 2, 5, 6, 9, 10, 15 };
		int arr2[] = { 5, 6, 11, 12, 15, 19 };
		int i = 0;
		int j = 0;
		while (arr1.length > i && arr2.length > j) {
			if (arr1[i] < arr2[j]) {
				System.out.print(arr1[i] + "*" + "a" + i + " ");
				i++;
			} else if (arr1[i] > arr2[j]) {
				System.out.print(arr2[j] + "*" + "b" + j + " ");
				j++;
			} else {
				if (i < j) {
					i++;
				} else {
					j++;
				}
			}

		}

		if (i < arr1.length) {
			while (i < arr1.length) {
				System.out.print(arr1[i] + "*" + "a" + i + " ");
				i++;
			}
		}
		if (j < arr2.length) {
			while (j < arr2.length) {
				System.out.print(arr2[j] + "*" + "b" + j + " ");
				j++;
			}
		}

		// One way of doing this

	}

	// Using set
	public static void unionIntersection() {

		Set<Integer> set = new HashSet<Integer>();
		int arr1[] = { 2, 5, 6, 5, 3, 10 };
		int arr2[] = { 4, 6, 8, 10, 12 };
		for (int x : arr1) {
			set.add(x);
		}
		System.out.print("Intersection ");
		for (int y : arr2) {
			if (!set.add(y)) {
				System.out.print(y + ", ");
			}
		}

		System.out.println("Union" + set);// prints the union

	}

}
