import java.util.*;
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

class Bank_account {
    private double balance;

    public Bank_account(double balance) {
        this.balance = balance;
    }

    public double withdraw(double amount) throws LowBalanceException {
        if (balance - amount < 0) {
            throw new LowBalanceException("Your account balance is too low for this withdrawal.");
        } else {
            this.balance -= amount;
            return this.balance;
        }
    }
}
public class Bank_handle {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Your account Balance is : Rs 10000");
        Bank_account account = new Bank_account(10000);
		System.out.println("Enter the amount to be withdrawn: ");
        try {
            double balance = account.withdraw(input.nextDouble());
			System.out.println("The new account Balance is: "+balance);
        } catch (LowBalanceException e) {
            System.out.println(e.toString());
        }
    }
}
