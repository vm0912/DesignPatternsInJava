package BehavioralDesignPatterns.Command;

public class BankAccountCommand implements Command {
    private BankAccount bankAccount;
    private Action action;
    private double amount;
    private boolean successful;

    public BankAccountCommand(BankAccount bankAccount, Action action, double amount) {
        this.bankAccount = bankAccount;
        this.action = action;
        this.amount = amount;
    }

    @Override
    public void call() {
        switch (action){
            case DEPOSIT:
                bankAccount.deposit(amount);
                successful = true;
                break;

            case WITHDRAW:
                successful = bankAccount.withdraw(amount);
                break;

        }
    }

    @Override
    public void undo() {
        if(successful){
            switch (action){
                case DEPOSIT:
                    bankAccount.withdraw(amount);
                    break;
                case WITHDRAW:
                    bankAccount.deposit(amount);
                    break;
            }
        }
    }
}
