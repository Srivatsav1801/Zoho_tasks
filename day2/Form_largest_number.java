/* Write a Java program to form the largest number from a given list of non negative integers.

Example:

Input :

nums = {1, 2, 3, 0, 4, 6}

Output:

Largest number using the said array numbers: 643210 */

import java.util.*;
class Form_largest_number{
	public static void main(String[] args){
		int i,j,temp;
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
                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
		for(i = 0; i<n;i++){
			System.out.print(array[i]);
		}
	}
}