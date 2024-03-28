/* Two numbers are entered through the keyboard. Write a program to find the value of one 
number raised to the power of another. (Do not use Java built-in method). */

import java.util.*;
public class Numpower{
	public static void main(String[] args){
		int num,power,i,product;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = input.nextInt();
		product = num;
		System.out.println("Enter power: ");
		power = input.nextInt();
		for(i=1;i<power;i++){
			product*=num;
		}
		System.out.println("The value of "+num+" raised to the power "+power+" is "+product);
	}
}