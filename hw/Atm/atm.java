public interface Atm {
  int withdrawCash(int amount);
  void depositCash(int amount);
  int getBalance();
}

public class AtmMachine implements Atm {
  private Bank bank; 

  public AtmMachine(Bank bank) {
    this.bank = bank;
  }

  public int withdrawCash(int amount) {

  int currentBalance = bank.getBalance();
  if (amount > currentBalance) {
    System.out.println("Insufficient funds. Your current balance is: " + currentBalance);
    return 0;
  }

  int withdrawnAmount = bank.withdrawCash(currentBalance, amount);

  System.out.println("Withdrawal successful. The amount of " + withdrawnAmount + " has been debited from your account.");
  System.out.println("Please collect your cash receipt at the printer.");

  return withdrawnAmount;
}


  public void depositCash(int amount) {
    bank.depositCash(amount);
  }

  public int getBalance() {
    return bank.getBalance();
  }

}

public class Bank {
  public boolean authenticate(String cardNumber, int pin) {
	
    return true;
  }

  public int withdrawCash(int accountNumber, int amount) {
	  
    return amount;
  }

  public void depositCash(int accountNumber, int amount) {
	  int currentBalance = bank.getBalance();
	  currentBalance += amount;
  }

  public int getBalance(int accountNumber) {
    return 1000;
  }
}

public class AtmDemo {
  public static void main(String[] args) {
    Bank bank = new Bank(); 
    Atm atm = new AtmMachine(bank);

    System.out.println("Balance: " + atm.getBalance());
    atm.depositCash(500);
    System.out.println("Balance after deposit: " + atm.getBalance());
  }
}
