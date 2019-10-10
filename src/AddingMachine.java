public class AddingMachine {

    private int total;
    private String transactionHistory = "0";

    public AddingMachine () {
        total = 0;  // not needed - included for clarity
    }

    public int getTotal () {
        return total;
    }

    public void add (int value) {
        transactionHistory = transactionHistory + " + " + value;
        total += value;
    }

    public void subtract (int value) {
        transactionHistory = transactionHistory + " - " + value;
        total -= value;
    }

    public String toString () {
        return transactionHistory;
    }

    public void clear() {
        total = 0;
        transactionHistory = "0";
    }
}