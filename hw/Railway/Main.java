package Railway;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Railway Reservation System:");
        System.out.println("Choose among the options:");
        System.out.println("1.To book a Ticket\n2.To see a Transaction history\n3.Cancellation");
        choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("You have selected the option to book a Ticket");
                break;
            case 2:
                System.out.println("You have selected the option to see a Transaction history:");
                break;
            case 3:
                System.out.println("You have selected option to cancel a Ticket:");
                break;
            default:
                System.out.println("Enter a correct option");
                break;
        }
    }
}
