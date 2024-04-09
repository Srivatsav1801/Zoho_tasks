abstract class Bank {
    abstract void getBalance();
}
class BankA extends Bank {
    void getBalance() {
        System.out.println("$100");
    }
}

class BankB extends Bank {
    void getBalance() {
        System.out.println("$150");
    }
}

class BankC extends Bank {
    void getBalance() {
        System.out.println("$200");
    }
}

public class Bank_Abstraction{
    public static void main(String[] args) {
        BankA bank_A = new BankA();
        BankB bank_B = new BankB();
        BankC bank_C = new BankC();

        bank_A.getBalance();
        bank_B.getBalance();
        bank_C.getBalance();
    }
}
