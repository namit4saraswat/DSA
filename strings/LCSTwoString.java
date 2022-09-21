package strings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class LCSTwoString {

	public static void main(String[] args) throws ParseException {
		System.out.println(new SimpleDateFormat("HH:mm:ss.SSS").SECOND_FIELD);
		LCSTwoString a = new LCSTwoString();
		String text1 = "yeasdszxccsdllow";
		String text2 = "yellowudsfsgdfgdfggduuu";
		System.out.println(a.longestSubSequence2(text1, text2));
		System.out.println(new SimpleDateFormat("HH:mm:ss.SSS").SECOND_FIELD);
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
