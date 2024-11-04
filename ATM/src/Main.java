public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(129.9);

        try {
            ATM.deposit(0.0);
            ATM.withdraw(130.0);
        } catch (Exception e) {
            System.out.println("Something went wrong. Error: " + e.getMessage());
        }

        System.out.println("Current balance: $" + ATM.checkBalance());
        
    }
}