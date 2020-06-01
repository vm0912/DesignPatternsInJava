package BehavioralDesignPatterns.Interpreter;

public class Operand implements Evaluator {

    public Operand(int value) {
        this.value = value;
    }

    private int value;

    @Override
    public int evaluate() {
        return value;
    }
}
