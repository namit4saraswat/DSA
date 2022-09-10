package matrix;

public class InpurArray {

	public static void main(String[] args) {
		
		int[][] arr= new int[3][4]; 
		int k=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				arr[i][j] = k;
				k++;
			}
		}
		
		System.out.println();
		
	}
	
}
