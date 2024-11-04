public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super("The amount to be withdrawn exceeds the current balance.");
    }
}