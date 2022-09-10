package arrays;

import java.util.HashMap;
import java.util.Map;

public class NumberOfPairToSumK {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 7, -1, 5,1};

		int k = 6;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(k-arr[i])) {
				System.out.println(arr[i] + " " + (k-arr[i]));
				//break;
			}

			else {
				map.put(arr[i], 1);
			}

		}

		

		

	}

}
//4  1  2  3 -1 -2