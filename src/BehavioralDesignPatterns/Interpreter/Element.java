package BehavioralDesignPatterns.Interpreter;


public class Element {

    public enum ElementType{
        OPERAND,
        ADDITION_OPERATOR,
        SUBTRACTION_OPERATOR,
        LEFT_PARENTHESIS,
        RIGHT_PARENTHESIS
    }

    public ElementType elementType;
    public String textualValue;


    public Element(ElementType elementType, String textualValue) {
        this.elementType = elementType;
        this.textualValue = textualValue;
    }

    @Override
    public String toString() {
        return "\nElement{" +
                " elementType=" + elementType +
                ", textualValue='" + textualValue + '\'' +
                "}";
    }
}
