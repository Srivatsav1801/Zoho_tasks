import java.util.*;
public class Bitshift{
	public static void main(String[] args){
		int a,b,c,d;
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();
		c = a | b;
		System.out.println("Bitwise OR: "+ c);
		c = a & b;
		System.out.println("Bitwise AND: "+ c);
		c = a ^ b;
		System.out.println("Bitwise XOR: "+ c);
		c = ~a;
		System.out.println("Bitwise Complement a: "+ c);
		c = ~b;
		System.out.println("Bitwise Complement b: "+ c);
		c = a << 2;
		d = b << 2;
		System.out.println("Left shift by 2bit a: "+ c +" Left shift by 2bit b: " + d);
		c = a >> 2;
		d = b >> 2;
		System.out.println("Signed Right shift by 2bit a: "+ c +" Signed Right shift by 2bit b: " + d);
		c = a >>> 2;
		d = b >>> 2;
		System.out.println("Unsigned Right shift by 2bit a: "+ c +" Unsigned Right shift by 2bit b: " + d);
	}
}