class Account {
    String name;
    int accountNumber;
    double balance;

    // Constructor
    Account(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Display account details
    void displayAccount() {
        System.out.println("Account Holder Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}


// Savings Account
class SavingsAccount extends Account {
    double balance;

    SavingsAccount(String name, int accountNumber, double balance) {
        super(name, accountNumber, balance);
        this.balance = balance;
    }

    void displaySavingsAccount() {
        displayAccount();
        System.out.println("Savings Account Balance: " + balance);
    }
}


// Current Account
class CurrentAccount extends Account {
    double balance;

    CurrentAccount(String name, int accountNumber, double balance) {
        super(name, accountNumber, balance);
        this.balance = balance;
    }

    void displayCurrentAccount() {
        displayAccount();
        System.out.println("Current Account Balance: " + balance);
    }
}


// Premium Savings Account
class PremiumSavingsAccount extends SavingsAccount {
    double interestRate;

    PremiumSavingsAccount(String name, int accountNumber,
                          double balance, double interestRate) {

        super(name, accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayPremiumAccount() {
        displaySavingsAccount();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}


// Main class
public class BankingSystem {
    public static void main(String[] args) {

        SavingsAccount s =
            new SavingsAccount("Savings", 101, 25000);

        CurrentAccount c =
            new CurrentAccount("Priyan", 104, 80000);

        PremiumSavingsAccount p =
            new PremiumSavingsAccount("Premium", 103, 50000, 4.5);


        System.out.println("----- SAVINGS ACCOUNT -----");
        s.displaySavingsAccount();

        System.out.println("\n----- CURRENT ACCOUNT -----");
        c.displayCurrentAccount();

        System.out.println("\n----- PREMIUM SAVINGS ACCOUNT -----");
        p.displayPremiumAccount();
    }
}