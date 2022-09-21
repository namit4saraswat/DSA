package stack;

import java.util.Stack;

public class NextLargestElementToRight {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 0, 0, 2, 4 };
		NGR2(arr);

	}

	// brute force O(n^2)
	static void NGR1(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					System.out.println(arr[i] + " " + arr[j]);
					break;
				}
			}
		}
	}

	static void NGR2(int[] arr) {
		// { 1, 3, 0, 0, 2, 4 };
		int n = arr.length;
		Stack<Integer> stk = new Stack<Integer>();
		int arr2[] = new int[n];
		for (int i = n - 1; i >= 0; i--) {
			if (stk.isEmpty()) {
				arr2[i] = -1;

			} else if (stk.lastElement() > arr[i]) {
				arr2[i] = stk.lastElement();

			} else if (stk.lastElement() <= arr[i]) {
				while (stk.lastElement() <= arr[i] && !stk.isEmpty()) {
					stk.pop();
				}
				if (stk.isEmpty()) {
					arr2[i] = -1;

				} else {
					arr2[i] = stk.lastElement();

				}
			}
			stk.push(arr[i]);

		}

		for (int a : arr2) {
			System.out.println(a + " ");
		}
	}
}
