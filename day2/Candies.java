import java.util.*;
class Candies{
	public static void main(String[] args){
		int i ,j,extra_candies,max=0,count =0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no of element in the array:");
		int n = input.nextInt();
		int[] candies = new int[n];
		boolean[] result = new boolean[n];
		System.out.println("Enter the no of candies for each kid");
		for(i = 0;i < n;i++){
			candies[i] = input.nextInt();
		}
		max = candies[0];
		System.out.println("Enter the no of extra candies:");
		extra_candies = input.nextInt();
		for(i = 0;i<n;i++){
			if(max<candies[i]){
				max = candies[i];
			}
		}
		for(i=0;i<n;i++){
			if(candies[i]+extra_candies<max){
				result[i] = false;
			}
			else{
				result[i] = true;
			}
		}
		System.out.println(Arrays.toString(result));
	}
}