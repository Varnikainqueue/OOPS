class BankAccount {
    String name;

    BankAccount(String name) {
        this.name = name;
    }

    void displayAccount() {
        System.out.println("Account Holder Name: " + name);
    }
}

class SavingAccount extends BankAccount {
    double interestRate;

    SavingAccount(String name, double interestRate) {
        super(name);   
        this.interestRate = interestRate;
    }

    void displaySaving() {
        displayAccount();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class Main8{
    public static void main(String[] args) {

        SavingAccount s = new SavingAccount("XYZ", 5.5);

        s.displaySaving();
    }
}