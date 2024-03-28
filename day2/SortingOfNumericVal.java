
/* Write a Java program to sort a numeric array*/

import java.util.*;
public class SortingOfNumericVal{
	public static void main(String[] args){
		int i ,j,temp = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no of element in the array:");
		int n = input.nextInt();
		int[] array = new int[n];
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
		for(i = 0;i < n;i++){
			System.out.println(array[i]);
		}
	}

}