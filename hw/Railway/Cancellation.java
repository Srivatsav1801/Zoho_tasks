package Railway;

import java.io.*;
import java.util.*;

public class Cancellation {	
    public static void cancel_ticket() throws IOException {
		int first_class_seats = 0, second_class_seats=0,choice=0;
		FileWriter Writer = null;
        Writer = new FileWriter("Ticket Cancellation_history.txt",true);
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the PNR: ");
		int pnr = sc.nextInt();
		if(pnr>10000||pnr<0){
			System.out.println("Invalid PNR number");
		}
		else{
			Writer.write("PNR: "+ pnr);
			String line = null;
			File seat = new File("seats.txt");
			Scanner reader = new Scanner(seat);
			while (reader.hasNextLine()) {
				line = reader.nextLine();
			}
			if (line != null) {
			  String[] parts = line.split(",");
			  first_class_seats = Integer.parseInt(parts[0]);
			  second_class_seats = Integer.parseInt(parts[1]);
			}		
			System.out.println("Choose your ticket class:");
			System.out.println("1.First class \n2.Second class");
			choice = sc.nextInt();
			FileWriter Writer_seats = null;
			Writer_seats = new FileWriter("seats.txt",true);
			switch (choice){
				case 1:
					first_class_seats +=1;
					System.out.println("First class Ticket has been cancelled");
					Writer.write("\nFirst class Ticket has been cancelled");
					break;
				case 2:
					second_class_seats +=1;
					System.out.println("Second class Ticket has been cancelled");
					Writer.write("\nSecond class Ticket has been cancelled");
					break;
					
				default:
					System.out.println("Enter a valid option");
					break;
			}
			System.out.println("The number of seats in First class: "+first_class_seats+"\nThe number of seats in Second class: "+ second_class_seats);
			String update = String.valueOf(first_class_seats)+","+String.valueOf(second_class_seats);
			Writer_seats.write("\n"+update);
			Writer.close();
			Writer_seats.close();

		}
		return;
	}
	
}
