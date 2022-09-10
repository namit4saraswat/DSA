package arrays;

import java.util.HashMap;
import java.util.Map;

public class SubArrayToSumK {

	public static void main(String[] args) {
		int arr[] = { 10,15,-5,25,-10, 5 };
		int currSum=0;
		int k = 25;
		Map<Integer,Integer> map = new HashMap<>();
		//1,1 2,3 3,6  5,11  6,17 7,24
		
		for(int i=0;i<arr.length;i++) {
			currSum = currSum + arr[i];
			if(map.containsKey(currSum-k)) {
				System.out.println(map.get(currSum-k) + 1 + "  " + i);
				break;
			}else {
				map.put(currSum,i);
			}
		}
		
		if(map.containsValue(arr.length-1)) {
			System.out.println("Not found");
		}
		
	}

}
