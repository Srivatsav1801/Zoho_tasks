/*Write a Java program to replace each substring of a given string that matches the given regular expression with the given replacement.

Sample string : "The quick brown fox jumps over the lazy dog."

In the above string replace all the fox with cat.

Sample Output:

Original string: The quick brown fox jumps over the lazy dog.                                                 

New String: The quick brown cat jumps over the lazy dog.*/

import java.util.*;
public class StringReplace{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the main string:");
		String string = input.nextLine();
		System.out.println("Enter the string to be replaced:");
		String regex_pattern = input.nextLine();
		System.out.println("Enter the replacement string:");
		String replacement_word = input.nextLine();
		System.out.println("before replacement:\n"+string);
		string = string.replaceAll(regex_pattern,replacement_word);
		System.out.println("After replacement:\n"+string);
	}
}