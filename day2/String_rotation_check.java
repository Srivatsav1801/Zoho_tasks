/* Write a Java program to check if two given strings are rotations of each other.

Sample Output:

The given strings are: ABACD  and  CDABA

The concatenation of 1st string twice is: ABACDABACD

The 2nd string CDABA  exists in the new string.

Strings are rotations of each other */

import java.util.*;
public class String_rotation_check{
	public static void main(String[] args){
		int i ,j,k,count = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first string:");
		String string1 = input.nextLine();
		System.out.println("Enter the second string:");
		String string2 = input.nextLine();
		String string3 = string1 + string1;
		System.out.println(string3);
		if(string1.length() != string2.length()){
			System.out.println("False");
		}
		else{
			for(i=0;i<string3.length();i++){
				if(string3.charAt(i) == string2.charAt(0)){
					for(k = 0;k < string2.length();k++){
						if(string3.charAt(i+k) == string2.charAt(k)){
							count++;
						}
						if(count == string2.length()){
							break;
						}
					}
					if(count != string2.length()){
						count = 0;
					}
					else{
						break;
					}
				}
				
				
			}
			if(count == string2.length()){
				System.out.println("True");
			}
			else{
				System.out.println("False");
			}
		}
	}
}