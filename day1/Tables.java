/* Write a Java program that takes a number as input and prints its multiplication table up to 10.*/


import java.util.*;
public class Tables{
	public static void main(String[] args){
		int a,i;
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		for(i = 1 ; i <=10;i++){
			System.out.printf("%d * %d = %d \n",a,i,a*i);
		}
	}
}