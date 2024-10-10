package tegh.chillo.ExceptionPackag;

public class NoNameBank {
    private double balance;

    public void deposit(double amount) throws InvalidAmountException{
     if(amount <= 0){
         throw new InvalidAmountException(amount + " is not a valid amount.");
     }
     balance += amount;
    }

    public double withdraw(double amount) throws InsufficientFundsException{
        if(amount <= 0){
            throw new InsufficientFundsException(amount + " insuffits funds");
        }
        balance -= amount;
        return balance;
    }

    public void balanceEnquiry(){
        System.out.println("current balance = "+ balance);
    }

}
