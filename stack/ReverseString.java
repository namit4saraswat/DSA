package stack;

import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		
		String a = "Reverse a string using stack";
		String op = "";
		char arr[] = a.toCharArray();
		
		Stack<Character> stack = new Stack<Character>();
		
		for(char i : arr) {
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			op = op + stack.pop();
		}
		
		System.out.println(op);
	}
	
	
	
}
