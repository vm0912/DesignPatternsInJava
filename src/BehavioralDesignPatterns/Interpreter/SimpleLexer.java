package BehavioralDesignPatterns.Interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * A utility class which provides static method of lexing the input.
 * @author Vitomir M
 */
public class SimpleLexer {

    public static List<Element> lex(String input){
        ArrayList<Element> lexingOutput = new ArrayList<>();

        for(int i=0; i<input.length(); ++i ){
            String element = String.valueOf(input.charAt(i));
            //throw IllegalArgumentException if the element is not in the list of allowed elements
            if(!element.matches("[0-9)(+\\-]+")){
                throw new IllegalArgumentException("Invalid input...");
            }
            //store the element in the list
            switch (element){
                case "+":
                    lexingOutput.add(new Element(Element.ElementType.ADDITION_OPERATOR, element ));
                    break;
                case "-":
                    lexingOutput.add(new Element(Element.ElementType.SUBTRACTION_OPERATOR, element ));
                    break;
                case "(":
                    lexingOutput.add(new Element(Element.ElementType.LEFT_PARENTHESIS, element ));
                    break;
                case ")":
                    lexingOutput.add(new Element(Element.ElementType.RIGHT_PARENTHESIS, element ));
                    break;
                    //the element is clearly a number
                default:
                    StringBuilder integerBuilder = new StringBuilder().append(element);
                    for(int k = i+1; k<input.length(); ++k){
                        if(Character.isDigit(input.charAt(k))){
                            integerBuilder.append(input.charAt(k));
                            ++i;
                        }
                    }
                    lexingOutput.add(new Element(Element.ElementType.OPERAND, integerBuilder.toString()));
                    break;
            }
        }

        return lexingOutput;
    }



}
