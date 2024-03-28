/* Write a Java program to replace every element with the next best element (from right side) in a given array of integers.
 There is no element next to the last element, therefore replace it with -1. */

import java.util.*;
public class Bestnumber{
	public static void main(String[] args){
		int i,temp,leader;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no of element in the array:");
		int n = input.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the array elements");
		for(i = 0;i < n;i++){
			array[i] = input.nextInt();
		}
		leader = array[n-1];
		System.out.println("The modified array is:");
		for (i = n-2; i >=0; i--) {
				temp = array[i];
				array[i] = leader;
				if(leader<temp){
					leader = temp;
				}
        }
		array[n-1] = -1;	
		for(i = 0;i < n;i++){
			System.out.println(array[i]);
		}
	}

}