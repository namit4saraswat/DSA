package matrix;

public class Mulitplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr1= new int[3][4]; 
		int k=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				arr1[i][j] = k;
				k++;
			}
		}
		
		
		int[][] arr2= new int[4][2]; 
		k = 10;
		for(int i=0;i<4;i++) {
			for(int j=0;j<2;j++) {
				arr2[i][j] = k;
				k++;
			}
		}
		
		for(int i=0;i<3;i++) {
			int sum = 0;
			for(int j=0;j<2;j++) {
				sum = arr1[i][j]*arr2[j][i] + sum;
				
			}
		}
	}

}
