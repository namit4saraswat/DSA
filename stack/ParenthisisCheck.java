package stack;

import java.util.Stack;

public class ParenthisisCheck {

	public static void main(String[] args) {

		String str = "[{}(})]";
		Stack<Character> stk = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			switch (c) {
			case '[':
			case '{':
			case '(':
			stk.push(c);
				break;
			case ']':
			case '}':
			case ')':
				
				if(!stk.isEmpty()) {
					Character ch = stk.pop();
					if((ch == '{' && c!='}' ) || (ch == '(' && c!= ')') || (ch == '[' && c != ']')) {
						System.out.println("not valid");
					}
				}
				else {
					System.out.println("not valid");
				}
			}
			
		}
	}

}
