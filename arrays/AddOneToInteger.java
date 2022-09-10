package arrays;

public class AddOneToInteger {
	public static void main(String[] args) {

		int digits[] = { 9};
		
		printArray(plusOne(digits));
		
		System.out.println("**********************");
		
		int i = digits.length - 1;
		int arr2[] = new int[digits.length + 1];

		while (i >= 0) {
			digits[i] = digits[i] + 1;
			arr2[i + 1] = digits[i];
			if (digits[i] != 10) {
				break;
			} else {
				digits[i] = 0;
				if (i == 0) {
					for (int j = 0; j < digits.length; j++) {
						arr2[j + 1] = digits[j];
					}

				}
			}
			i--;
		}

		if (digits.length == 1 && digits[0] != 0) {
			printArray(digits);
		} else {
			arr2[0] = 1;
			printArray(arr2);
		}
	}

	static void printArray(int[] arr) {

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	public static int[] plusOne(int[] digits) {

		int n = digits.length;
		for (int i = n - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}

			digits[i] = 0;
		}

		int[] newNumber = new int[n + 1];
		newNumber[0] = 1;

		return newNumber;

	}
}
