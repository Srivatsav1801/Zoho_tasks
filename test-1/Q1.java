import java.util.*;
class Coordinator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n,coord;
		System.out.println("Enter the no of elements in the array: ");
		n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the elements in the array: ");
		for(int i = 0;i<n;i++){
			array[i]=sc.nextInt();
		}
		coord = array[n-1];
		for(i=n-2;i>=0;i--){
			if(coord<array[i]){
				System.out.println(array[i]);
				coord = array[i];
			}
		}
	}
}