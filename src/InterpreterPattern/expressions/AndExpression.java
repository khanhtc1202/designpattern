package InterpreterPattern.expressions;

public class AndExpression implements Expression {

    private Expression exper1 = null;
    private Expression exper2 = null;

    public AndExpression(Expression exper1, Expression exper2) {
        this.exper1 = exper1;
        this.exper2 = exper2;
    }

    @Override
    public boolean interpret(String context) {
        return exper1.interpret(context) && exper2.interpret(context);
    }
}
