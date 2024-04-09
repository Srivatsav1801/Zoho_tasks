public class Main {

  public static void main(String[] args) {
    AtmCard atmCard = getAtmCard();
	Scanner sc = new Scanner(System.in);

    while (true) {
      try {
        AtmOperations atm = new AtmImpl(5000, atmCard); 
		System.out.println("Choose among the options");
		System.out.println("1.To check Balance of the account\n2.To withdraw money from account\n3.To Deposit money\n4.exit");
        int choice = sc.nextInt();;
        switch (choice) {
          case 1:
            atm.viewBalance();
            break;
          case 2:
			atm.withdrawMoney();
			break;
		  case 3:
			atm.depositMoney();
			break;
          case 4:
            System.out.println("Exiting ATM.");
            System.exit(0);
          default:
            System.out.println("Invalid choice.");
			break;
        }
      } catch (InvalidCardException | InvalidPinException e) {
        System.out.println(e.getMessage());
      }
    }
  }
}
