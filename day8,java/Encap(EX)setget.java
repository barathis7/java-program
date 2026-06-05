class BankAccount {
    private double balance; // Private variable

    // Setter Method
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter Method
    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setBalance(5000.0);
        System.out.println("Balance: ₹" + account.getBalance());
    }
}