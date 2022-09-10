package matrix;

public class AllPossibleSubMatrix {

	public static void main(String[] args) {
		
		int[][] arr= new int[3][3];
		int count=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j] = count;
				count++;
			}
		}
		
		//r1,c1  r2,c2
		int sum = 0;
		for(int r1=0;r1<=3;r1++) {
			for(int c1=0;c1<=3;c1++) {
				for(int r2=r1+1;r2<=3;r2++) {
					for(int c2=c1+1;c2<=3;c2++) {
						for(int i=r1;i<r2;i++) {
							for(int j=c1;j<c2;j++) {
								sum = sum + arr[i][j];
							}
						}
					}
				}
			}
		}
		
		
	}
	
}
