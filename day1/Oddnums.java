/* Write a program in Java to display the n terms of odd natural number and their sum.*/

import java.util.*;
public class Oddnums{
	public static void main(String[] args){
		int num,i,odd;
		int sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		num = input.nextInt();
		System.out.println("The odd numbers are:");
		for(i=1;i<=num;i++){
			odd = 2*i-1;
			System.out.println(odd);
			sum += odd;
		}
		System.out.println("The sum of odd Natural numbers upto "+num+" terms is: "+sum);
	}
}