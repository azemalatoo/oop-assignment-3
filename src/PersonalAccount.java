import java.util.ArrayList;
import java.util.List;

/**
 * Represents a personal bank account with deposit and withdrawal functionalities.
 */
public class PersonalAccount {
    /** The unique account number. */
    private int accountNumber;
    /** The name of the account holder. */
    private String accountHolder;
    /** The current balance of the account. */
    private double balance;
    /** A list to store transaction history. */
    private List<Amount> transactions;

    /**
     * Constructs a PersonalAccount object with the given account number and holder name.
     * Initializes the balance to 0.0 and creates an empty transaction list.
     *
     * @param accountNumber The account number.
     * @param accountHolder The account holder's name.
     */
    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    /**
     * Deposits the specified amount into the account.
     *
     * @param amount The amount to deposit.
     */
    public void deposit(double amount) {
        if (amount > 0) {
            Amount depositTransaction = new Amount(amount, TransactionType.DEPOSIT);
            transactions.add(depositTransaction);
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    /**
     * Withdraws the specified amount from the account.
     *
     * @param amount The amount to withdraw.
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            Amount withdrawalTransaction = new Amount(amount, TransactionType.WITHDRAWAL);
            transactions.add(withdrawalTransaction);
            balance -= amount;
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    /**
     * Prints the transaction history of the account.
     */
    public void printTransactionHistory() {
        System.out.println("Transaction History for Account " + accountNumber + ":");
        for (Amount transaction : transactions) {
            System.out.println(transaction.getTransactionType() + ": " + transaction.getAmount());
        }
    }

    /**
     * Retrieves the current balance of the account.
     *
     * @return The current balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Retrieves the account number.
     *
     * @return The account number.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Retrieves the account holder's name.
     *
     * @return The account holder's name.
     */
    public String getAccountHolder() {
        return accountHolder;
    }
}