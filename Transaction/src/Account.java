import java.util.ArrayList;

public class Account {
    public static final double EPS = 1e-6;
    private double balance = 0;
    private ArrayList<Transaction> transitionList = new ArrayList<>();

    /**
     * Make a deposit transaction.
     *
     * @param amount the deposit amount
     */
    private void deposit(double amount) {
        if (amount <= EPS) {
            System.out.println("So tien ban nap vao khong hop le!");
            return;
        }
        transitionList.add(new Transaction(Transaction.DEPOSIT, amount, balance += amount));
    }

    /**
     * Make a withdrawal transaction.
     *
     * @param amount the withdrawal amount
     */
    private void withdraw(double amount) {
        if (amount <= EPS) {
            System.out.println("So tien ban rut ra khong hop le!");
            return;
        }
        if (amount > balance + EPS) {
            System.out.println("So tien ban rut vuot qua so du!");
            return;
        }
        transitionList.add(new Transaction(Transaction.WITHDRAW, amount, balance -= amount));
    }

    /**
     * Add a transaction.
     *
     * @param amount    money
     * @param operation deposit or withdraw
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(Transaction.DEPOSIT)) {
            deposit(amount);
        } else if (operation.equals(Transaction.WITHDRAW)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * Print all transactions.
     */
    public void printTransaction() {
        int transactionNumber = 0;
        for (Transaction transaction : transitionList) {
            ++transactionNumber;
            System.out.print("Giao dich " + transactionNumber + ": ");
            if (transaction.getOperation().equals(Transaction.DEPOSIT)) {
                System.out.print("Nap");
            } else {
                System.out.print("Rut");
            }
            System.out.printf(" tien $%.2f. So du luc nay: $%.2f.%n",
                    transaction.getAmount(), transaction.getBalance());
        }
    }
}
