package strings;

public class StringValidShuffleOfTwoString {

	public static void main(String[] args) {

		String str = "X1Y2";
		String str1 = "12";
		String str2 = "XY";
		String str3 = str1 + str2; // 12XY
		for (int i = 0; i < str1.length()-1; i++) {
			if (str.indexOf((str1.charAt(i))) < str.indexOf((str1.charAt(i + 1)))) {
				str = str.replaceFirst((Character.toString(str.charAt(i))), "");
			} else {
				System.out.println("False");
				return;
			}
		}
		str = str.replaceFirst((Character.toString(str.charAt(str1.length()-1))), "");
		System.out.println(str);

		if (str.equals(str2)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}
}