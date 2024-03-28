/* Write a Java program to sort an array of positive integers of a given array. In the sorted array the value of the first element should be maximum, the second value should be the minimum value, 
the third should be the second maximum, the fourth second be the second minimum and so on. */


import java.util.*;
class Maxminmax{
	public static void main(String[] args){
		int i,j,temp,k = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no of element in the array:");
		int n = input.nextInt();
		int[] array = new int[n];
		int[] patterned_array = new int[n];
		System.out.println("Enter the array elements");
		for(i = 0;i < n;i++){
			array[i] = input.nextInt();
		}
		for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
		j = 0;
		k = n-1;
		for(i = 0 ; i< n;i++){
			if(i%2==0){
				patterned_array[i] = array[k];
				k--;
			}
			else{
				patterned_array[i] = array[j];
				j++;				
			}
		}
		System.out.println("The patterned array :");
		for(i = 0;i < n;i++){
			System.out.println(patterned_array[i]);
		}
	}
}