package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SortCharByFrequency {

	public static void main(String[] args) {

		String str = "GeeksforGeeks";
		Map<ArrayList, Integer> map = new HashMap<ArrayList, Integer>();

		char arr[] = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
			//	map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				//map.put(arr[i], 1);
			}
		}

	}

}
