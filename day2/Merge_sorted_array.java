import java.util.*;
class Merge_sorted_array{
	public static void main(String[] args){
		int i,n1,n2,j,temp,k,first_arr;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no of elements in array 1: ");
		n1 = input.nextInt();
		int[] array_1 = new int[n1];
		System.out.println("Enter the no of elements in array 2: ");
		n2 = input.nextInt();
		System.out.println("Enter the elements of array 1: ");
		int[] array_2 = new int[n2];
		for(i=0;i<n1;i++){
			array_1[i] = input.nextInt();			
		}
		System.out.println("Enter the elements of array 2: ");
		for(i=0;i<n2;i++){
			array_2[i] = input.nextInt();			
		}
		for(i=0;i < n1;i++){
			if(array_1[i]>array_2[0]){
				temp = array_1[i];
				array_1[i] = array_2[0];
				array_2[0] = temp;	
				first_arr = array_2[0];
				for (k = 1; k < n2 && array_2[k] < first_arr; k++) {
                    array_2[k - 1] = array_2[k];
				}
				array_2[k-1] = first_arr;
			}
		}
		System.out.println("Array A:");
		System.out.println(Arrays.toString(array_1));
		System.out.println("Array B:");
		System.out.println(Arrays.toString(array_2));
	}
}