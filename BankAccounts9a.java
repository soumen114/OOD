// User-defined exception for insufficient balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    String accountId;
    String accountHolderName;
    double balance;

    // Constructor to initialize the bank account
    public BankAccount(String accountId, String accountHolderName, double initialBalance) {
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Withdraw method with exception handling
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // Check balance method
    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class BankAccounts9a {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", "John Doe", 1000);

        account.checkBalance(); // Show initial balance

        account.deposit(500); // Deposit amount
        account.checkBalance();

        try {
            account.withdraw(2000); // Try withdrawing more than available
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        try {
            account.withdraw(300); // Valid withdrawal
            account.checkBalance();
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
