/* Write a Java program to print all the LEADERS in the array.   

Note: An element is leader if it is greater than all the elements to its right side. */

import java.util.*;
public class Leaders{
	public static void main(String[] args){
		int i,leader;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no of element in the array:");
		int n = input.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the array elements");
		for(i = 0;i < n;i++){
			array[i] = input.nextInt();
		}
		leader = array[n-1];
		
		System.out.println("The leaders of array are:\n"+leader);
		for (i = n-2; i >=0; i--) {
            if (leader<array[i]){
				leader = array[i];
				System.out.println(leader);
            }
        }
	}

}