/* Write a Java program to add two matrices of the same size. */

import java.util.*;
class Matrix_add{
	public static void main(String[] args){
		int i,j,n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Matrix dimension:");
		n = input.nextInt();
		int[][] arr1 = new int[n][n];
		int[][] arr2 = new int[n][n];
		System.out.println("Enter the values of first matrix");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				arr1[i][j] = input.nextInt();
			}
		}
		System.out.println("Enter the values of second matrix:");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				arr2[i][j] = input.nextInt();
			}
		}
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				arr1[i][j] += arr2[i][j];
			}
		}
		for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++){
                System.out.print(arr1[i][j] + " ");
			}
            System.out.println();
        }
	}
}