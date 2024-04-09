package Railway;

import Railway.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int choice;
		boolean flag = true;
        Scanner sc = new Scanner(System.in);
		Login log = new Login();
		Register reg = new Register();
		Reservation reserv = new Reservation();
		Cancellation cancel = new Cancellation();
		Avail_seats avail = new Avail_seats();
        System.out.println("Welcome to Railway Reservation System:");
		while (flag) {
		  System.out.println("Choose among the options: ");
		  System.out.println("1.Register an account\n2.Login into existing account");
		  choice = sc.nextInt();
		  switch (choice) {
			case 1:
			  System.out.println("You have chosen to Register");
			  reg.account_register();
			  break;
			case 2:
			  System.out.println("You have chosen to Login");
			  log.logging_in();
			  flag = false; // Set flag to false after any valid option
			  break;
			default:
			  System.out.println("Choose the correct option:");
		  }
		}
       	while(true){
			System.out.println("Choose among the options:");
			System.out.println("1.To book a Ticket\n2.To see seat availablity\n3.Cancellation\n4.Exit");
			choice = sc.nextInt();
			switch (choice){
				case 1:
					System.out.println("You have selected the option to book a Ticket");
					reserv.reserve_ticket();
					break;
				case 2:
					System.out.println("You have selected the option To see seat availablity:");
					avail.availablity();
					break;
				case 3:
					System.out.println("You have selected option to cancel a Ticket:");
					cancel.cancel_ticket();
					break;
				case 4:
					System.exit(0);
				default:
					System.out.println("Enter a correct option");
					break;
			}
		}
    }
}
