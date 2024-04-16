package Railway;

import java.io.*;
import java.util.*;

public class Reservation {	
    public static void reserve_ticket() throws IOException {
        int choice,payment_amount=0,a=0,b=0,first_class_seats=0,second_class_seats=0,flag=0;
        String update = "";
		FileWriter Writer = null;
		String[] stations ={"beach","park","chetpet","saidapet","trisulam","tambaram sanatorium","tambaram","guduvancheri","potheri","chengalpattu"};
		System.out.println(Arrays.toString(stations));
		int[] range = {0,2,6,12,20,26,40,43,51,59};
        Writer = new FileWriter("Ticket booking history.txt",true);
		Random rand = new Random();
		int pnr = rand.nextInt(10000);
		Writer.write("PNR: "+ pnr);
        Scanner sc = new Scanner(System.in);
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
        System.out.println("Enter the Departure Station:");
        String starting_point = sc.nextLine().toLowerCase();
        Writer.write("\nDeparture point: "+starting_point);
        System.out.println("Enter the Destination Station:");
        String ending_point = sc.nextLine().toLowerCase();
        Writer.write("\nDestination point: "+ending_point);
        System.out.println("Choose your ticket class:");
        System.out.println("1.First class \n2.Second class");
		System.out.println("The number of seats in First class: "+first_class_seats+"\nThe number of seats in Second class: "+ second_class_seats);
        choice = sc.nextInt();
		for(int i=0;i< stations.length;i++){
			if(stations[i].equals(starting_point)){
				a = range[i];				
			}
			if(stations[i].equals(ending_point)){
				b = range[i];
			}
		}
		int distance = Math.abs(b-a);
        switch (choice){
            case 1:
				if(first_class_seats>0){
					System.out.println("You have selected First class Tickets");
					
					if(46<distance && distance<60){
						payment_amount= 130;
					}
					else if(41<distance && distance<45){
						payment_amount= 120;
					}
					else if(36<distance && distance<40){
						payment_amount= 115;
					}
					else if(26<distance && distance<35){
						payment_amount= 110;
					}
					else if(16<distance && distance<20){
						payment_amount= 80;
					}
					else if(11<distance && distance<15){
						payment_amount= 55;
					}
					else if(distance<10){
						payment_amount= 45;
					}
					flag = 1;
					System.out.println("The amount to be paid = Rs "+payment_amount);
					Writer.write("\nClass: First class");
					Writer.write("\nPayment amount:Rs "+payment_amount);
					break;
				}
				else{
					System.out.println("First class seats are booked!");
				}
            case 2:
				if(second_class_seats>0){
					System.out.println("You have selected Second class Tickets");
					
					if(46<distance && distance<70){
						payment_amount= 15;
					}
					
					else if(21<distance && distance<45){
						payment_amount= 10;
					}
					
					else if(distance<20){
						payment_amount= 5;
					}
					flag = 0;
					System.out.println("The amount to be paid = Rs "+ payment_amount);
					Writer.write("\nClass: Second class");
					Writer.write("\nPayment amount:Rs "+payment_amount);
					break;
				}
				else{
					System.out.println("Second class tickets are full!");
				}
			default:
				System.out.println("Enter a valid option");
				break;
				
				
        }
        System.out.println("Enter the payment method of choice:\n1.UPI\n2.Rwallet");
        int payment = sc.nextInt();
		
		FileWriter Writer_seats = null;
		Writer_seats = new FileWriter("seats.txt",true);
		
        switch (payment){
            case 1:
                System.out.println("Transaction completed via UPI");
				if(flag == 1){
					System.out.println("First class ticket booked");
					first_class_seats -=1;
				}
				else{
					System.out.println("Second class ticket booked");
					second_class_seats -=1;
				}
				Writer.write("\nTransaction completed via UPI\n\n");
				break;
            case 2:
                System.out.println("Transaction completed via Rwallet");
				if(flag == 1){
					System.out.println("First class ticket booked");
					first_class_seats -=1;
				}
				else{
					System.out.println("Second class ticket booked");
					second_class_seats -=1;
					
				}
				Writer.write("\nTransaction completed via Rwallet\n\n");
				break;
            default:
                System.out.println("Transaction Failed!");
				Writer.write("\nTransaction failed!\n\n");
				break;
        }
		
		update = String.valueOf(first_class_seats)+","+String.valueOf(second_class_seats);
		Writer_seats.write("\n"+update);
        Writer.close();
		
		Writer_seats.close();
		return;

    }
}
