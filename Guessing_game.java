/* Write a program that generates a random number and asks the user to guess hat the number is. 
If the user's guess is higher than the random number, the program should display "Too high, try again." 
If the user's guess is lower than the random number, the program should display "Too low, try again." 
The program should use a loop that repeats until the user correctly guesses the random number */

import java.util.*;
public class Guessing_game{
	public static void main(String[] args){
		int target,guess;
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		target = random.nextInt(100);
		do{
			guess = input.nextInt();
			if(guess > target){
				System.out.println("Too high, try again");
			}
			else if(guess < target){
				System.out.println("Too low, try again");
			}
			else{
				System.out.println("Guessed correctly!");
			}
			
		}while(guess!=target);
		
	}
}