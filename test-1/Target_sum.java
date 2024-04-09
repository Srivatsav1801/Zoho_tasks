import java.util.*;
class Target_sum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int i,j,n,currSum=0,flag = 0;
		System.out.println("Enter the no of elements in the array: ");
		n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the elements in the array: ");
		for(i = 0;i<n;i++){
			array[i]=sc.nextInt();
		}
		System.out.println("Enter the sum: ");
		int sum = sc.nextInt();
		for(i=0;i<n;i++){
			for(j = i+1;j<n;j++){
				currSum = array[i] + array[j];
				if(currSum == sum){
					flag = 1;
					System.out.println("true");
					break;
				}
				else{
					currSum = 0;
				}
			}
			if(flag == 1){
				break;
			}
		}
		if(flag == 0){
			System.out.println("false");
		}
		
		
	}
}