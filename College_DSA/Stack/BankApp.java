import java.util.Scanner;

// Custom exception class for minimum balance violation
class MinimumBalanceException extends Exception {
    public MinimumBalanceException(String message) {
        super(message);
    }
}

// Bank account class
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    // Withdraw method that throws MinimumBalanceException if balance falls below 1000
    public void withdraw(double amount) throws MinimumBalanceException {
        if (balance - amount < 1000) {
            throw new MinimumBalanceException("Withdrawal denied! Minimum balance ₹1000 must be maintained.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: ₹" + balance);
    }
}

// Main class with the program entry point
public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter initial balance: ₹");
            double initialBalance = sc.nextDouble();

            BankAccount account = new BankAccount(initialBalance);

            System.out.print("Enter amount to withdraw: ₹");
            double amount = sc.nextDouble();

            // Withdraw and handle minimum balance exception
            account.withdraw(amount);
        } catch (MinimumBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            sc.close();
        }
    }
}
