package arrays;

public class BestTimeToBuyStock {

	public static void main(String[] args) {

		int prices[] = { 7,1,5,3,6,4 };
		int profit = 0;
		int max = 0;
		int least = Integer.MAX_VALUE;
		for (int i = 0; i < prices.length; i++) {
			
			
			
			if (least > prices[i]) {
				least = prices[i];
			}
			
			profit = prices[i] - least;
			
			if(max < profit) {
				max = profit;
			}
		}
		System.out.println(profit);
		System.out.println("profit is " + max);

	}
}
