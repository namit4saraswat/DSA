package strings;

public class IsPalidrome {

	public static void main(String[] args) {
		IsPalidrome a = new IsPalidrome();
		a.isPalindrome("ep");
	}

	void isPalindrome(String str) {
		if (str.length() == 1) {
			System.out.println("Palindrome");
			return;
		} else if ((str.length() == 2) && str.charAt(0)==str.charAt(1)) {
			System.out.println("Palindrome");
			return;
		}
		if (str.charAt(0) == str.charAt(str.length() - 1)) {
			isPalindrome(str.substring(1, str.length() - 1));
		} else {
			System.out.println("Not palidrom");
		}

	}

}
