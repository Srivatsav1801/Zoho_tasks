/* Write a Java program to find the first non repeating character in a string. */

import java.util.*;
public class First_non_rep_char{
	public static void main(String[] args){
		int i ,j,count = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the main string:");
		String string = input.nextLine();
		for(i = 0 ; i < string.length();i++){
			for(j = 0;j<string.length();j++){
				if(string.charAt(i) == string.charAt(j)){
					count++;
				}
				if(count>1){
					break;
				}
			}
			if(count == 1){
				System.out.println(string.charAt(i));
				break;
			}
			else{
				count=0;
			}
		}
	}
}