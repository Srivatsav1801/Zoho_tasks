import java.io.*;
import java.util.*;
import java.util.regex.*;

interface AtmOperations {
    public void viewBalance(long accountNumber, String user_pin) throws IOException;
    public void withdrawCash(int amount,long accountNumber, String user_pin) throws IOException;
    public void depositCash(int amount,long accountNumber, String user_pin) throws IOException;
}

public class AtmService implements AtmOperations {
    private int balance;
    private long accountNumber;
    private String pin;

    public void viewBalance(long accountNumber, String user_pin) throws IOException {
		Bank bank = new Bank(accountNumber, user_pin);
		this.balance = bank.get_balance();
        System.out.println("Your current balance is: Rs." + balance);
    }

    public void withdrawCash(int amount,long accountNumber, String user_pin) throws IOException {
		Bank bank = new Bank(accountNumber,user_pin);
		this.balance = bank.get_balance();
		this.accountNumber = bank.get_account_number();
		this.pin = bank.get_pin();
        if (amount > balance) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            String old_values = String.valueOf(this.accountNumber) + "," + String.valueOf(this.balance)+","+this.pin;
            this.balance -= amount;
			bank.set_balance(this.balance);
            System.out.println("Rs." + amount + " withdrawn successfully.");
            System.out.println("Please collect your money");
            System.out.println("Remaining balance: Rs." + this.balance);
			String new_values = String.valueOf(this.accountNumber) + "," + String.valueOf(balance)+","+this.pin;
            updateAccountFile(old_values,new_values);
        }
    }

    public void depositCash(int amount,long accountNumber, String user_pin) throws IOException {
		Bank bank = new Bank(accountNumber, user_pin);
		this.balance = bank.get_balance();
		this.accountNumber = bank.get_account_number();
		this.pin = bank.get_pin();
        String old_values = String.valueOf(this.accountNumber) + "," + String.valueOf(this.balance)+","+this.pin;
        this.balance += amount;
		bank.set_balance(this.balance);
        System.out.println("Rs." + amount + " deposited successfully.");
        System.out.println("New balance: Rs." + balance);
		String new_values = String.valueOf(this.accountNumber) + "," + String.valueOf(balance)+","+this.pin;
        updateAccountFile(old_values, new_values);
    }

    private void updateAccountFile(String oldValue, String newValue) throws IOException {
        File file = new File("account_list.txt");
        Scanner scanner = new Scanner(file);
        StringBuffer buffer = new StringBuffer();
        while (scanner.hasNextLine()) {
            buffer.append(scanner.nextLine() + "\n");
        }
        scanner.close();
        String fileContents = buffer.toString();
        fileContents = fileContents.replace(oldValue, newValue);
        FileWriter writer = new FileWriter(file);
        writer.write(fileContents);
        writer.close();
    }

}