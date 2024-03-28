/* Write a Java program to create a new string from a given string by swapping the last two characters of the given string. 
The length of the given string must be two or more. */

import java.util.*;
class Swap_last_two{
	public static void main(String[] args){
		int i;
		Scanner input = new Scanner(System.in);
		String string = input.nextLine();
		String result = "";
		if(string.length()<2){
			System.out.println("Swaping of last two characters is not possible");
		}
		else{
			for(i=0;i<string.length()-1;i++){
				if(i == string.length()-2){
					result+=string.charAt(i+1);
				}
				result += string.charAt(i);
			}
			System.out.println(result);
		}
		
	}
}