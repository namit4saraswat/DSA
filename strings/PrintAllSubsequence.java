package strings;

public class PrintAllSubsequence {
	public static void main(String[] args) {

		String str2 = "abcd";

		printSub(str2, 0, "");

	}

	static void printSub(String str, int i, String curr) {
		if (i == str.length()) {
			System.out.println(curr);
			return;
		}

		printSub(str, i + 1, curr + str.charAt(i));
		printSub(str, i + 1, curr);
	}

}
