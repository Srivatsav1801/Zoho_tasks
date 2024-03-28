/* Write a Java program to read two strings, append them together and return the result. If the strings are different lengths, 
remove characters from the beginning of the longer string and make them equal length */

import java.util.*;
class String_append{
	public static void main(String[] args){
		int i,diff2=0,diff1 = 0;
		Scanner input = new Scanner(System.in);
		String string1 = input.nextLine();
		String string2 = input.nextLine();
		String result = "";
		if(string1.length()>string2.length()){
			diff1 = string1.length() - string2.length();
			for(i=diff1;i<string1.length();i++){
				result+=string1.charAt(i);
			}
			result += string2;
		}
		else if(string1.length()<string2.length()){
			diff2 = string2.length() - string1.length();
			result += string1;
			for(i=diff2;i<string2.length();i++){
				result+=string2.charAt(i);
			}
		}		
		System.out.println(result);
	}
}