package strings;

public class LCSTwoString {

	public static void main(String[] args) {
		LCSTwoString a = new LCSTwoString();
		String text1 = "abcde";
		String text2 = "ace";
		a.longestSubSequence(text1, text2, 0, 0);

	}

	int count = 0;

	void longestSubSequence(String text1, String text2, int i, int j) {

		if (i >= text1.length() || j >= text2.length()) {
			return;
		}

		if (text1.charAt(i) == text2.charAt(j)) {
			i++;
			j++;
			longestSubSequence(text1, text2, i, j);
			count++;
		} else {
			i++;
			longestSubSequence(text1, text2, i, j);
			i--;
			j++;
			longestSubSequence(text1, text2, i, j);
		}

		System.out.println(count);

	}
	
	
}
