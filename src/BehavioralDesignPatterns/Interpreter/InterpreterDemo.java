package BehavioralDesignPatterns.Interpreter;


import java.util.List;

/**
 * Interpreter is a component that processes structured text data. Does so by turning it into
 * separate lexical tokens (lexing) and then interpreting sequences of said tokens (parsing).
 * The following example demonstrates lexing and parsing of simple mathematical equations which
 * use integer values, addition, subtraction, multiplication, division and single layer of parenthesis.
 * It should manage to correctly calculate expression like "5+(4-3)"
 * @author Vitomir M
 */
public class InterpreterDemo {
    public static void main(String[] args) {
        String element = "5+(4-3)";
        List<Element> elements= SimpleLexer.lex(element);
        System.out.println(elements);
        Evaluator evaluator = SimpleParser.parse(elements);
        System.out.println(element+ " = "+ evaluator.evaluate());


    }
}
