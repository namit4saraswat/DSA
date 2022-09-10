package strings;

public class Permutation {

	public static void main(String[] args) {
		
		String str = "abc";
	}
	
	
	void permutation(String str, int l, int r) {
		
		if(l==r) {
			System.out.println(str);
			return;
		}
		
		for(int i=l;i<=r;i++) {
//			str = swap(str,l,i);
			permutation(str, l , r);
	//		str = swap(str, l, i);
		} 
		
	}
	
	void swap() {
		
	}
}
