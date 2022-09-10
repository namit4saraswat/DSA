package arrays;

import java.util.HashMap;
import java.util.Map;

public class Difference {

	public static void main(String[] args) {

		String str1 = "TTst123";
		String str2 = "XTst456";
		int i = 0;
		int j = 0;
		int count = 0;
		while (i < str1.length()) {
			if (str1.charAt(i) == str2.charAt(j)) { // no insertion no deletion
				i++;
				j++;
			} else if ((str1.charAt(i) != str2.charAt(j)) && (str1.charAt(i) == str2.charAt(j + 1))) { // insertion
				count++;
			} else if ((str1.charAt(i) != str2.charAt(j)) && (str1.charAt(i + 1) == str2.charAt(j))) { // deletion
				count++;
			}

		}
		i++;
		j++;
	}

}
