package BehavioralDesignPatterns.Command;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *A Command design pattern is basically an object which represents an instruction to perform a particular action.
 * It contains all the information necessary for the action to be taken.
 * @author Vitomir M
 */
public class CommandDemo {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(1000.00);

        List<BankAccountCommand> commands = new ArrayList<>(List.of(
                new BankAccountCommand(bankAccount, Action.WITHDRAW, 500),
                new BankAccountCommand(bankAccount, Action.DEPOSIT, 10000),
                new BankAccountCommand(bankAccount, Action.WITHDRAW, 20000)
        ));

        System.out.println("Starting balance is: " + bankAccount);
        for(BankAccountCommand command : commands){
            command.call();
            System.out.println(bankAccount);
        }

        System.out.println("----------------------------------");
        Collections.reverse(commands);

        for(BankAccountCommand command : commands){
            command.undo();
            System.out.println(bankAccount);
        }

    }
}

