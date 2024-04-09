/* package Railway;
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Reservation {
	public static int seats(){
		try(Scanner reader = new Scanner(new File("seats.txt"))){
			while (reader.hasNextLine()) {
				String line = reader.nextLine();
				String[] parts = line.split(",");
				int first_class_seats =(int) parts[0];
				int second_class_seats = (int)parts[1];
				}
			}
		}catch(Exception e){
			System.out.println("No file found");
		}
	}
	
	
    public static void main(String[] args) throws IOException {
        int choice,payment_amount=0,a=0,b=0;
        FileWriter Writer = null;
		Random rand = new Random();
		String[] stations ={"beach","park","chetpet","saidapet","trisulam","tambaram sanatorium","tambaram","guduvancheri","potheri","chengalpattu"};
		System.out.println(Arrays.toString(stations));
		int[] range = {0,2,6,12,20,26,40,43,51,59};
        Writer = new FileWriter("Ticket booking history.txt",true);
		int pnr = rand.nextInt(10000);
		Writer.write("PNR: "+ pnr);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Departure Station:");
        String starting_point = sc.nextLine().toLowerCase();
        Writer.write("\nDeparture point: "+starting_point);
        System.out.println("Enter the Destination Station:");
        String ending_point = sc.nextLine().toLowerCase();
        Writer.write("\nDestination point: "+ending_point);
        System.out.println("Choose your ticket class:");
        System.out.println("1.First class \n2.Second class");
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
				
				System.out.println("The amount to be paid = Rs "+payment_amount);
				Writer.write("\nClass: First class");
				Writer.write("\nPayment amount:Rs "+payment_amount);
                break;
            case 2:
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
				
                System.out.println("The amount to be paid = Rs "+ payment_amount);
				Writer.write("\nClass: Second class");
				Writer.write("\nPayment amount:Rs "+payment_amount);
                break;
            default:
                System.out.println("Enter a valid option");
                break;
        }
        System.out.println("Enter the payment method of choice:\n1.UPI\n2.Rwallet");
        int payment = sc.nextInt();
        switch (payment){
            case 1:
                System.out.println("Transaction completed via UPI");
                System.out.println("Ticket successfully booked");
				Writer.write("\nTransaction completed via UPI\n\n");
				break;
            case 2:
                System.out.println("Transaction completed via Rwallet");
                System.out.println("Ticket successfully booked");
				Writer.write("\nTransaction completed via Rwallet\n\n");
				break;
            default:
                System.out.println("Transaction Failed!");
				Writer.write("\nTransaction failed!\n\n");
				break;
        }
        Writer.close();

    }
}
