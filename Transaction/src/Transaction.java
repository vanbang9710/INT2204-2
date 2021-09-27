public class Transaction {
    public static final String DEPOSIT = "deposit";
    public static final String WITHDRAW = "withdraw";
    private String operation;
    private double amount;
    private double balance;

    /**
     * Constructor.
     *
     * @param o operation
     * @param a amount
     * @param b balance
     */
    public Transaction(String o, double a, double b) {
        operation = o;
        amount = a;
        balance = b;
    }

    /**
     * Getter of operation.
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Setter of operation.
     */
    public void setOperation(String o) {
        operation = o;
    }

    /**
     * Getter of amount.
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Setter of amount.
     */
    public void setAmount(double a) {
        amount = a;
    }

    /**
     * Getter of balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Setter of balance.
     */
    public void setBalance(double b) {
        balance = b;
    }
}
