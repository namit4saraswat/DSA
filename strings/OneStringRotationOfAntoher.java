package strings;

public class OneStringRotationOfAntoher {

	public static void main(String[] args) {

		String str1 = "abcd";
		String str2 = "bcda";

		if (str1.length() != str2.length()) {
			System.out.println("False");
			return;
		}
		
		if ((str1+str1).indexOf(str2) != -1) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
