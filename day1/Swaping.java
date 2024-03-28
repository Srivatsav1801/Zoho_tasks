/* Write a Java program to swap two variables. */

import java.util.*;
public class Swaping{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number_1 = input.nextInt();
		int number_2 = input.nextInt();
		System.out.printf("Before swap :\n number 1 = %d\n number 2 = %d\n",number_1,number_2);
		number_1 = (number_1*number_2)/(number_2=number_1);
		System.out.printf("after swap :\n number 1 = %d\n number 2 = %d\n",number_1,number_2);
	}
}