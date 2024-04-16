import java.util.*;
class Max_profit{
	public static void main(String[] args){
		int i,j,max=0,no_of_days;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of days");
		no_of_days = sc.nextInt();
		int[] prices = new int[no_of_days];
		System.out.println("Enter the stock price rates: ");
		for(i=0;i<no_of_days;i++){
			prices[i] = sc.nextInt();
		}
		for(i=0;i<no_of_days;i++){
			for(j=i+1;j<no_of_days;j++){
				if(prices[j]>prices[i]){
					if(max < prices[j]-prices[i]){
						max = prices[j]-prices[i];
					}
				}
			}
		}
		System.out.println("\nMax profit: "+max);
		
		
	}
}