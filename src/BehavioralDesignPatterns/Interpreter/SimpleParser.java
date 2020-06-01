package BehavioralDesignPatterns.Interpreter;

import java.util.Iterator;
import java.util.List;

/**
 * A utility class which provides static method of parsing the input.
 * @author Vitomir M
 */
public class SimpleParser {

    public static Evaluator parse(List<Element> elements){
        Operation result = new Operation();
        boolean leftSideEmpty = true;
        boolean insideParenthesis = false;
        for(Element element : elements){
            if(insideParenthesis){
                continue;
            }
            switch (element.elementType){
                case OPERAND:
                    Operand operand = new Operand(Integer.parseInt(element.textualValue));
                    if(leftSideEmpty){
                        result.setLeftSide(operand);
                        leftSideEmpty=false;
                    } else {
                        result.setRightSide(operand);
                    }
                    break;
                case ADDITION_OPERATOR:
                    result.setOperationType(Operation.OperationType.ADDITION);
                    break;
                case SUBTRACTION_OPERATOR:
                    result.setOperationType(Operation.OperationType.SUBTRACTION);
                    break;
                case LEFT_PARENTHESIS:
                    int subexpressionStart,subexpressionEnd;
                    subexpressionStart = elements.indexOf(element)+1;
                    Iterator<Element> iterator = elements.listIterator(subexpressionStart);
                    subexpressionEnd = elements.size()-1;
                    while (iterator.hasNext()){
                        Element current = iterator.next();
                        if (current.elementType.equals(Element.ElementType.RIGHT_PARENTHESIS)){
                            subexpressionEnd = elements.indexOf(current)-1;
                            break;
                        }
                    }
                    List<Element> subexpression = elements.subList(subexpressionStart,subexpressionEnd+1);
//                    System.out.println("subexpression "+ subexpression);
                    Evaluator evaluatedSubexpression = parse(subexpression);
                    if(leftSideEmpty){
                        result.setLeftSide(evaluatedSubexpression);
                        leftSideEmpty=false;
                    } else {
                        result.setRightSide(evaluatedSubexpression);
                    }
                    //skip all the elements to the right bracket
                    insideParenthesis = true;
                    break;
                case RIGHT_PARENTHESIS:
                    insideParenthesis = false;
                    break;
            }
        }
        return result;
    }
}
