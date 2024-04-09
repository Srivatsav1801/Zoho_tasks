public interface AtmOperations {
  public void viewBalance();
  public void withdrawCash(int amount) throws InsufficientFundsException;
  public void depositCash(int amount);
}
public class AtmService implements AtmOperations {
  private int balance;
  private int accountNumber; 

  public AtmService(int initialBalance, int accountNumber) {
    this.balance = initialBalance;
    this.accountNumber = accountNumber;
  }

  public void viewBalance() {
    System.out.println("Your current balance is: Rs." + balance);
  }

  public void withdrawCash(int amount) throws InsufficientFundsException {
    if (amount > balance) {
      throw new InsufficientFundsException("Insufficient funds for withdrawal.");
    } else {
      balance -= amount;
      System.out.println("Rs." + amount + " withdrawn successfully.");
	  System.out.println("Please collect you money");
      System.out.println("Remaining balance: Rs." + balance);
    }
  }
  
  public void depositCash(int amount) {
    balance += amount;
    System.out.println("Rs." + amount + " deposited successfully.");
    System.out.println("New balance: Rs." + balance);
  }
  public void verify_account(int accountNumber){
	  File seat = new File("bank_account.txt");
	  Scanner reader = new Scanner(seat);
		while (reader.hasNextLine()) {
			String line = reader.nextLine();
			if (line != null) {
			  String[] parts = line.split(",");
			  first_class_seats = Integer.parseInt(parts[0]);
			  second_class_seats = Integer.parseInt(parts[1]);
			}	
		}
	}
}


