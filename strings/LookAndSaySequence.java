package strings;

public class LookAndSaySequence {

	public static void main(String[] args) {
		int n = 4;
		if (n == 1) {
			System.out.println("1");
			return;
		}
		if (n == 2) {
			System.out.println("11");
			return;
		}
		String str = "11";

		String temp = "";
		int count = 1;
		for (int j = 2; j < n; j++) {
			str = str + "$";
			for (int i = 1; i < str.length(); i++) {
				if (str.charAt(i) != str.charAt(i - 1)) {
					temp = temp + count + "" + str.charAt(i - 1);
					count = 1;
				} else {
					count++;
				}
			}

			str = temp;
			temp="";
			System.out.println(str);

		}

	}

}
