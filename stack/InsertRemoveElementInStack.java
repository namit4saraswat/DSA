package stack;

public class InsertRemoveElementInStack {

	public static void main(String[] args) {
		
		StackArrayClass a = new StackArrayClass();
		a.insert(12);
		a.insert(13);
		a.insert(14);
		a.insert(15);
		a.insert(16);
		int[] arr = a.insert(17);
		
		
		for(int i: arr) {
			System.out.print(i + " ");
		}
		
		System.out.println(a.remove());
		System.out.println(a.remove());
		System.out.println(a.remove());
		System.out.println(a.remove());
		System.out.println(a.remove());
		
		System.out.println("*********************************");
		
		SrackArrayClassUsingLinkedList b = new SrackArrayClassUsingLinkedList();
		b.push(21);
		b.push(22);
		b.push(23);
		b.push(24);
		
		b.pop();
		b.pop();
		b.pop();
		b.pop();
		
	}
	
}
