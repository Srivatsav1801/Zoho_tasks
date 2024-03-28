/* Write a Java program to get the character at the given index within the String.*/

import java.util.*;
public class Getcharindex{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String:");
		String string = input.nextLine();
		System.out.println("Enter the index value:");
		int index = input.nextInt();
		System.out.println("The charater at the given index is: "+string.charAt(index));
	}
}