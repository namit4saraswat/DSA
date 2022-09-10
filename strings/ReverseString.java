package strings;

public class ReverseString {

	public static void main(String[] args) {

		String str = "TestStringToBeReverted";

		String op = "";
		int i = 0;
		while (i < str.length()) {
			op = op + str.charAt(str.length() - 1 - i);
			i++;
		}

		System.out.println(op);

	}

}
