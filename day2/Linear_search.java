import java.util.*;
class Linear_search{
	public static void main(){
		int i , n ,target;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no of elements in an array: ");
		n = input.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the numbers present in the array: ");
		for(i=0;i<n;i++){
			array[i] = input.nextInt();
		}
		System.out.println("Enter the target value: ");
		target = input.nextInt();
		for(i=0;i<n;i++){
			if(array[i] == target){
				System.out.println("The value is present in the index value: " + i);
			}
		}				
	}
}