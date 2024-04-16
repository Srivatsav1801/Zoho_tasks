import java.util.*;
class Main{
	public static void main(String[] args){
		System.out.println("Welcome to taxi booking system");
		int id = 1;
		while(flag){
			System.out.println("A-->B-->C-->D-->E-->F\nEach Station is 15km apart:");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Pickup Point: ");
			pickupPoint = sc.next();
			System.out.println("Enter the Drop Point: ");
			dropPoint = sc.next();
			System.out.println("Enter the Pickup Time:");
			pickupTime = sc.nextInt();
			Customer customer = new Customer(id,pickupPoint,dropPoint,pickupTime);
			
		}
		
	}
}