/*Write a Java program to compare two strings lexicographical, ignoring case differences*/

import java.util.*;
public class LexicograCaseInsensitiveStrings{
	public static void main(String[] args){
		int i,k=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the String1:");
		String string_1 = input.nextLine().toLowerCase();
		System.out.println("Enter the String1:");
		String string_2 = input.nextLine().toLowerCase();
		if(string_1.length() != string_2.length()){
			System.out.println("The two strings are not Lexicographical");
		}
		else{
			for(i=0;i<string_1.length();i++){
				if(string_1.charAt(i) != string_2.charAt(i)){
					k = 1;
					break;
				}
			}
			if(k!=1){
				System.out.println("The two strings are Lexicographical");
			}
			else{
				System.out.println("The two strings are not Lexicographical");
			}
		}
	}
}