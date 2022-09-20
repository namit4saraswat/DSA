package linkedList;

public class LinkedListImplementation {

	public static void main(String[] args) {

		PointerMethods obj = new PointerMethods();
		Pointer head = obj.getNewPointer(5);

		Pointer point = obj.insertElement(head, 10);

	}

}

class Pointer {
	Pointer pointTo;
	int data;

	Pointer(int i) {
		this.data = i;
		this.pointTo = null;
	}
}

class PointerMethods {

	Pointer insertElement(Pointer point, int i) {
		if(point == null) {
			return getNewPointer(i);
		}
		Pointer head = point;
		
		while(point.pointTo !=null) {
			point = point.pointTo;
		}

		point.pointTo = getNewPointer(i);
		return head;
	}

	void printList() {
		
	}

	Pointer getNewPointer(int i) {
		
		return new Pointer(i);
	}

}
