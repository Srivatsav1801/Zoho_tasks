/* Write a Java program to solve quadratic equations (use if, else if and else). */

import java.util.*;
public class Quadraticeq{
	public static void main(String[] args){
		int a,b,c;
		double root1,root2,real,imaginary,discriminant;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the coeffiecients a,b,c of quadratic equation ax^2+bx+c=0: ");
		a = input.nextInt();
		b = input.nextInt();
		c =	input.nextInt();
		discriminant = b*b-4*a*c;
		if(discriminant > 0){
			root1 = (-b + Math.sqrt(discriminant))/(2*a);
			root2 = (-b - Math.sqrt(discriminant))/(2*a);
			System.out.println("The roots are real and distinct:\nroot 1 = "+root1+" root 2= "+root2);
		}
		else if(discriminant == 0){
			root1 = -b/(2*a);
			System.out.println("The roots are real and equal:\nroot= "+root1);
		}
		else{
			real = -b/(2*a);
			imaginary = Math.sqrt(-discriminant)/(2*a);
			System.out.println("The roots are complex and different:\nroot1= "+real+"+"+imaginary+" root2= "+real+"-"+imaginary);
					
		}
	}
}