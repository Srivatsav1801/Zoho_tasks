/* Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.

Sample array: [1,2,4,5,6]

Target value: 6. */

import java.util.*;
class Sum_target{
	public static void main(String[] args){
		int i,j,target,sum = 0;
		int flag = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no of elements in the array: ");
		int no_of_elements = input.nextInt();
		int[] arr = new int[no_of_elements];
		for(i=0;i<no_of_elements;i++){
			arr[i] = input.nextInt();
		}
		System.out.println("Enter the target value: ");
		target = input.nextInt();
		for(i=0;i<no_of_elements;i++){
			for(j=i+1;j<no_of_elements;j++){
				sum = arr[i] + arr[j];
				if(sum == target){
					flag = 1;
					System.out.println("The the two elements are:"+arr[i]+" and "+arr[j]);
					break;
				}
			}
			if(flag == 1){
				break;
			}
			sum = 0;
		}
	}
}