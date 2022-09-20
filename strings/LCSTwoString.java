package strings;

public class LCSTwoString {

	public static void main(String[] args) {
		LCSTwoString a = new LCSTwoString();
		String text1 = "yellow";
		String text2 = "yellowuuuu";
		System.out.println(a.longestSubSequence2(text1, text2));
		
	}

	int count = 0;

	int longestSubSequence2(String m, String n) {
		if (m.length() == 0 || n.length() == 0) {
			return count;
		}

		if (m.charAt(m.length() - 1) == n.charAt(n.length() - 1)) {
			return 1 + longestSubSequence2(m.substring(0, m.length() - 1), n.substring(0, n.length() - 1));

		} else {
			return Math.max(longestSubSequence2(m, n.substring(0, n.length() - 1)),
					longestSubSequence2(m.substring(0, m.length() - 1), n));
		}

	}

}
