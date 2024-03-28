/* Write a Java program to divide a string into n equal parts. */

import java.util.*;
public class Dividestrings{
	public static void main(String[] args){
		int i,parts;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the main string:");
		String string = input.nextLine();
		System.out.println("Enter the no of parts:");
		parts = input.nextInt();
		if(string.length()%parts != 0){
			System.out.println("The division of string is not possible");
		}
		else{
			for (i = 0; i < string.length(); i++) {
				if (i % (string.length() / parts) == 0){
					System.out.println();
				}
			System.out.print(string.charAt(i));
        }
		}
	}
}