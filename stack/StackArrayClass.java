package stack;

public class StackArrayClass {

	int top = 0;
	int max = 5;
	int[] a = new int[max];
	
	private boolean isFull() {
		if(top == max) {
			return true;
		}
		
		return false;
	}
	
	private boolean isEmpty() {
		if(top == 0) {
			return true;
		}
		return false;
				
	}
	
	int[] insert(int val) {
		if(top == max) {
			System.out.println("Stack is full");
			return a;
		}
		
		a[top++] = val;
		
		return a;
	}
	
	
	int remove() {
		 if(isEmpty()) {
			 System.out.println("Stack is empty");
			 return Integer.MIN_VALUE;
		 }
		 
		 return (a[--top]);
	}
}
