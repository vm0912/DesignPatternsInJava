package BehavioralDesignPatterns.Interpreter;


/**
 * Interpreter is a component that processes structured text data. Does so by turning it into
 * separate lexical tokens (lexing) and then interpreting sequences of said tokens (parsing).
 * The following example demonstrates lexing and parsing of simple mathematical equations which
 * use integer values, addition, subtraction, multiplication, division and single layer of parenthesis.
 * It should manage to correctly calculate expression like "(10+5)-4+(7-3)"
 * @author Vitomir M
 */
public class InterpreterDemo {
    public static void main(String[] args) {
        String element = "1+2-3+55+(55-4)-455";
        System.out.println(SimpleLexer.lex(element));


    }
}
