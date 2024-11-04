public class InvalidAmountException extends Exception {
    public InvalidAmountException() {
        super("The amount mustn't be less than or equal to zero.");
    }
}
