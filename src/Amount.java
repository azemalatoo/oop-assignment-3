/**
 * Represents a transaction amount with its associated type.
 */
public class Amount {
    /** The amount of the transaction. */
    private double amount;
    /** The type of the transaction (deposit or withdrawal). */
    private TransactionType transactionType;

    /**
     * Constructs an Amount object with the specified amount and transaction type.
     *
     * @param amount          The transaction amount.
     * @param transactionType The type of the transaction.
     */
    public Amount(double amount, TransactionType transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }

    /**
     * Retrieves the transaction amount.
     *
     * @return The transaction amount.
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Retrieves the transaction type.
     *
     * @return The transaction type.
     */
    public TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Returns a string representation of the Amount object.
     *
     * @return A string representation of the Amount.
     */
    @Override
    public String toString() {
        return "Amount{" +
                "amount=" + amount +
                ", transactionType=" + transactionType +
                '}';
    }
}