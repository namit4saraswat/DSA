package bits;

public class InterestingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public String solve(int[] A) {
		int count=0;
        for(int i=0;i<A.length;i++) {
        	if(A[i]%2!=0) {
        		count++;
        	}
        }
       
      int a=   -2;
      if(count%2==0) {
        	return "Yes";
        }else {
        	return "No";
        }
    }

}
