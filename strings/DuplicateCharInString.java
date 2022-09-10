package strings;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharInString {

	public static void main(String[] args) {
		String str = "Print duplicate characters";
		String current = "";
		String duplicates = "";
		for (int i = 0; i < str.length(); i++) {

			if (current.contains(Character.toString(str.charAt(i)))) {
				if (!duplicates.contains(Character.toString(str.charAt(i)))) {
					duplicates = duplicates + str.charAt(i) + ", ";
				}
			} else {
				current = current + str.charAt(i);
			}

		}

		System.out.println(duplicates);

	}

}
