package BehavioralDesignPatterns.Command;

public class BankAccount {
    private double balance;
    private double allowedOwerdraft;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public boolean withdraw(double amount){
        double result = balance - amount;
        if(result >= (-allowedOwerdraft)){
            balance=result;
            System.out.println("You successfully withdrew "+ amount +" HRK, and the remaining balance is "+ balance + " HRK");
            return true;
        } else{
            System.out.println("The transaction is not valid, please correct the withdraw amount.");
            return false;
        }
    }

    public void deposit(double amount){
        balance+=amount;
        System.out.println("You successfully deposited "+ amount +" HRK, and the remaining balance is "+ balance + " HRK");
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                " HRK}";
    }
}
