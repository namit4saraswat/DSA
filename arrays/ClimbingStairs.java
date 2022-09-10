package arrays;

public class ClimbingStairs {

	public static void main(String[] args) {
		System.out.println(climbStairs(44));
	}

	public static int climbStairs(int n) {

		if(n==1 || n==0 || n==2) {
			return n;
		}
		return  climbStairs(n - 1) + climbStairs(n - 2);

	
	}

}
