package dynamicProgramming;

public class LongestSubsequence {

	static String text1 = "yellow";
	static String text2 = "yellowuuuu";
	int[][] t = new int[text1.length() + 1][text2.length() + 1];

	public static void main(String[] args) {
		LongestSubsequence a = new LongestSubsequence();

		System.out.println(a.longestSubSequenceDP(text1, text2));

	}

	int count = 0;

	int longestSubSequenceDP(String m, String n) {
		if (m.length() == 0 || n.length() == 0) {
			return count;
		}

		if (t[m.length()][n.length()] != 0) {
			return t[m.length()][n.length()];
		}

		if (m.charAt(m.length() - 1) == n.charAt(n.length() - 1)) {
			return t[m.length()][n.length()] = 1
					+ longestSubSequenceDP(m.substring(0, m.length() - 1), n.substring(0, n.length() - 1));

		} else {
			return t[m.length()][n.length()] = Math.max(longestSubSequenceDP(m, n.substring(0, n.length() - 1)),
					longestSubSequenceDP(m.substring(0, m.length() - 1), n));
		}

	}

}
