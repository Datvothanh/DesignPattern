package manager.Expression;

public abstract class NonTerminalExpression {
    protected Expression expression;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }
}
