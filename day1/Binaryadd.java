/* Write a Java program to add two binary numbers.*/

import java.util.*;
public class Binaryadd{
	public static void main(String[] args){
		String sum;
		Scanner input = new Scanner(System.in);
		int binary_num1 = Integer.parseInt(input.next(),2);
		int binary_num2 = Integer.parseInt(input.next(),2);
		int binary_add = binary_num1+binary_num2;
		sum = Integer.toBinaryString(binary_add);
		System.out.println(sum);
	}
}