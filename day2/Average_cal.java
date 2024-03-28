/* Print the average of three numbers entered by user by creating a class named 'Average' having a method 
to calculate and print the average. */

import java.util.*;
class Average_cal{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the three value: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		Average AvgCa1 = new Average(num1,num2,num3);
		System.out.println("The average of three numbers is : "+AvgCa1.avg());
	}
}