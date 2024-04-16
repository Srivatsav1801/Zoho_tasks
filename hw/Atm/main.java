import java.util.*;
import java.io.*;
class Main {
	
    public static void main(String[] args) throws IOException {
        int choice;
		long accountNo = 0;
		String pin = "";
        Scanner sc = new Scanner(System.in);
        AtmService atm = new AtmService();
        Bank bank = new Bank(0,"");
        boolean flag = true,valid = true;
        System.out.println("Welcome to ATM");
        while (flag) {
            System.out.println("Choose among the options:");
            System.out.println("1.Create an account\n2.Login using accountNo and banking pin\n3.exit");
            choice = sc.nextInt();
            switch (choice) {
				case 2:
                    System.out.println("You choose to create an account");
                    bank.create_account();
                    flag = false;
				
                case 1:
                    System.out.println("You choose to login");
                    System.out.println("Enter your accountNo:");
                    accountNo = sc.nextLong();
                    System.out.println("Enter your 4 digit pin");
                    pin = sc.next();
                    valid = bank.verify_account(accountNo, pin);
                    if (valid == true) {
                        flag = false;
                    }
                    break;

                case 3:
                    System.out.println("Exiting ATM.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
        if (valid == true) {
            while (true) {
                try {
                    System.out.println("Choose among the options");
                    System.out.println("1.To check Balance of the account\n2.To withdraw money from account\n3.To Deposit money\n4.exit");
                    choice = sc.nextInt();
                    ;
                    switch (choice) {
                        case 1:
                            atm.viewBalance(accountNo,pin);
                            break;
                        case 2:
                            System.out.println("Enter the amount to be withdrawn");
                            atm.withdrawCash(sc.nextInt(),accountNo,pin);
                            break;
                        case 3:
                            System.out.println("Enter the amount to be deposited");
                            atm.depositCash(sc.nextInt(),accountNo,pin);
                            break;
                        case 4:
                            System.out.println("Exiting ATM.");
                            System.exit(0);
                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                    sc.nextLine(); // Clear the input buffer
                }
            }
        } else {
            System.out.println("Account validation error");
        }
    }
}
