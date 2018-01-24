package InterpreterPattern;

import InterpreterPattern.expressions.AndExpression;
import InterpreterPattern.expressions.Expression;
import InterpreterPattern.expressions.OrExpression;
import InterpreterPattern.expressions.TerminalExpression;

public class InterpreterPatternDemo {
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("robert");
        Expression john = new TerminalExpression("john");

        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");

        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is married woman? " + isMarriedWoman.interpret("Married Julie"));
    }
}
