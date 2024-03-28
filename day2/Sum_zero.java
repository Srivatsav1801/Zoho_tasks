/* Write a Java program to check if a given array contains a sub array with 0 sum

Input :

nums1= { 1, 2, -2, 3, 4, 5, 6 }

nums2 = { 1, 2, 3, 4, 5, 6 }

nums3 = { 1, 2, -3, 4, 5, 6 }

Output:

Does the said array contain a subarray with 0 sum: true

Does the said array contain a subarray with 0 sum: false

Does the said array contain a subarray with 0 sum: true */

import java.util.*;
public class Sum_zero{
	public static void main(String[] args){
		int i,j,sum = 0;
		int flag = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no of element in the array:");
		int n = input.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the array elements");
		for(i = 0;i < n;i++){
			array[i] = input.nextInt();
		}
		for(i=0;i<n;i++){
			for(j=i;j<n;j++){
				sum += array[j];
				if(sum == 0){
					flag = 1;
					break;
				}
			}
			if(flag==1){
				break;
			} 
			sum = 0;
			
		}
		if(flag ==0){
			System.out.println("Does the said array contain a subarray with 0 sum: False");
		}	
		else{
			System.out.println("Does the said array contain a subarray with 0 sum: True");
		}
	}

}