package BehavioralDesignPatterns.Interpreter;

public class Operation implements Evaluator {

    enum OperationType{
        ADDITION,
        SUBTRACTION
    }

    private OperationType operationType;
    private Evaluator leftSide, rightSide;

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public Evaluator getLeftSide() {
        return leftSide;
    }

    public void setLeftSide(Evaluator leftSide) {
        this.leftSide = leftSide;
    }

    public Evaluator getRightSide() {
        return rightSide;
    }

    public void setRightSide(Evaluator rightSide) {
        this.rightSide = rightSide;
    }

    @Override
    public int evaluate() {

            switch (operationType){
                case ADDITION:
                    return leftSide.evaluate() + rightSide.evaluate();
                case SUBTRACTION:
                    return leftSide.evaluate() - rightSide.evaluate();
            }

        return 0;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "operationType=" + operationType +
                ", leftSide=" + leftSide +
                ", rightSide=" + rightSide +
                '}';
    }
}
