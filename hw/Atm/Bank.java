
import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Bank{
	private int balance;
    private long accountNumber;
    private String pin = "";
	
	Bank(long accountNumber, String user_pin)throws IOException{
		File bank_details = new File("account_list.txt");
        Scanner reader = new Scanner(bank_details);
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line != null) {
                String[] parts = line.split(",");
                long account_Number = Long.parseLong(parts[0]);
                int user_balance = Integer.parseInt(parts[1]);
                String pin = parts[2];
                if (accountNumber == account_Number && user_pin.equals(pin)) {
                    this.accountNumber = account_Number;
                    this.balance = user_balance;
                    this.pin = user_pin;
                }
            }
        }
		System.out.println("balance ="+ this.balance);
	}
	
	public boolean verify_account(long accountNumber, String user_pin) throws IOException {
        File bank_details = new File("account_list.txt");
        Scanner reader = new Scanner(bank_details);
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line != null) {
                String[] parts = line.split(",");
                long account_Number = Long.parseLong(parts[0]);
                int user_balance = Integer.parseInt(parts[1]);
                String pin = parts[2];
                if (accountNumber == account_Number && user_pin.equals(pin)) {
                    this.accountNumber = account_Number;
                    this.balance = user_balance;
                    this.pin = user_pin;
                    return true;
                }
            }
        }
        System.out.println("Account or Pin is wrong");
        return false;
    }

    public void create_account() throws IOException {
        Scanner sc = new Scanner(System.in);
        File file = new File("account_details.txt");
        FileWriter writer_customer = new FileWriter(file);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter the phone number: ");
        int phone_no = sc.nextInt();
        writer_customer.write("\nName:" +name);
        writer_customer.write("\nPhone No:" + String.valueOf(phone_no));

        long leftLimit = 100000000000L;
        long rightLimit = 999999999999L;
        this.accountNumber = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
        this.balance = 0;
        System.out.println(this.accountNumber);

        String pin;
        do {
            System.out.println("Enter your desired 4 digit pin: ");
            pin = sc.next();
            if (!pin.matches("\\d{4}")) {
                System.out.println("The pin is not valid. Please enter a 4-digit PIN.");
            }
        } while (!pin.matches("\\d{4}"));
        this.pin = pin;
		System.out.println(this.pin);

        FileWriter Writer = null;
        Writer = new FileWriter("account_list.txt", true);
        String update = String.valueOf(this.accountNumber) + "," + String.valueOf(this.balance) + "," + this.pin;
        Writer.write(update);
        writer_customer.close();
        Writer.close();
    }
	
	public int get_balance(){
		System.out.println("Bank balance:" + this.balance);
		return this.balance;
	}
	public long get_account_number(){
		return this.accountNumber;
	}
	public String get_pin(){
		return this.pin;
	}
	public void set_balance(int balance){
		System.out.println("Bank balance:" + this.balance);
		this.balance = balance;
	}
	public void set_account_number(long accountNumber){
		this.accountNumber = accountNumber;
	}
	public void set_pin(String pin){
		this.pin = pin;
	}
	
}
