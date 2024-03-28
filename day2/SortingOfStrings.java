/* Write a Java program to sort a string array. */

import java.util.*;
public class SortingOfStrings{
	
	public static boolean Compare(String str1, String str2) {
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            if ((int)str1.charAt(i) > (int)str2.charAt(i)) {
                return true;
            } else if ((int)str1.charAt(i) < (int)str2.charAt(i)) {
                return false;
            }
        }
        if (str1.length() > str2.length()) {
            return true;
        } else {
            return false;
        }
    }

	public static void main(String[] args){
		int i ,j;
		String temp;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no of element in the array:");
		int n = input.nextInt();
		SortingOfStrings cmp = new SortingOfStrings();
		String[] str_array = new String[n+1];
		System.out.println("Enter the array elements");
		for(i = 0;i < n;i++){
			str_array[i] = input.nextLine();
		}
		for (i = 0; i < n - 1; i++) {
            for (j = i+1; j < n; j++) {
                if(cmp.Compare(str_array[i],str_array[j])){
                    temp = str_array[i];
                    str_array[i] = str_array[j];
                    str_array[j] = temp;
                }
            }
        }
		for(i = 0;i < n;i++){
			System.out.println(str_array[i]);
		}
	}

}