package strings;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingSubsequence {

	public static void main(String[] args) {
		
		String str= "ADABEBCD";
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else {
				map.put(str.charAt(i), 1);
			}
		}
		
		int count = 0;
		
	for(Map.Entry<Character, Integer> ob : 	map.entrySet()) {
		if(ob.getValue()>1) {
			count++;
		}
	}
	
	System.out.println(count);
	
		
	}
}

