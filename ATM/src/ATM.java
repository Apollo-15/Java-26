public class ATM {
    
    private static double currentBalance;
        
        public ATM(double currentBalance){
            this.currentBalance = currentBalance;
        }

    public static void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException{
        if (amount > currentBalance){
            throw new InsufficientFundsException();
        } if (amount <= 0){
            throw new InvalidAmountException();
        } else {
            currentBalance -= amount;
            System.out.println("The transaction is successful!");
        }
        

    }

    public static void deposit(double amount) throws InvalidAmountException{
        if (amount <= 0) {
            throw new InvalidAmountException();
        } else {
            currentBalance += amount;
            System.out.println("The transaction is successful!");
        }

        
    }
    
    public static double checkBalance(){
            return currentBalance;
    }
}
