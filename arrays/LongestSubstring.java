package arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("pwwppkew"));
		
	}
	
	 public static int lengthOfLongestSubstring(String s) {
		 Map<Character,Integer> map = new HashMap<Character,Integer>();
		 int maxCount=0;
		 char[] arr = s.toCharArray();
		 int count =0;
		 for(int i=0;i<arr.length;i++) {
			 if(map.containsKey(arr[i])) {
				 continue;
			 }
			 map.put(arr[i], 1 );
			 count++;
			 if(maxCount<count) {
				 maxCount= count;
			 }
			 
			 System.out.print(arr[i]+" ");
			
			
		 }
		 
		 return maxCount;
	    }
}
