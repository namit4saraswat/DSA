package arrays;

public class LongestPalindrom {

	public static void main(String[] args) {

		String s = "assdfgh";
		String op = "";
		String fop="";
		char[] arr = s.toCharArray();
		for (int i = 1; i < arr.length - 1; i++) {
			fop = op;
			op = arr[i] + "";
			for (int j = 1; j < arr.length/2; j++) {
				if (arr[i + j] == arr[i - j]) {
					op = arr[i - j] + op + arr[i + j];
					continue;
				}else {
					break;
				}
			}

			
		}
		if (fop.length() < op.length()) {
			fop = op;
		}
		
		
		
		

		System.out.println(fop);

	}

}
