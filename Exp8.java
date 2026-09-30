import java.util.InputMismatchException;
import java.util.Scanner;

class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {

    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient Balance! Available balance: Rs." + balance
            );
        }

        balance = balance - amount;

        System.out.println("Withdrawal successful.");
        System.out.println("Remaining Balance: Rs." + balance);
    }
}

public class Exp8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter initial account balance: ");
            double balance = sc.nextDouble();

            BankAccount account = new BankAccount(balance);

            System.out.print("Enter withdrawal amount: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);

        }
        catch (InputMismatchException e) {

            System.out.println("Invalid input! Please enter numbers only.");

        }
        catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());

        }
        finally {

            System.out.println("Transaction completed.");
            sc.close();
        }
    }
}