package calculator;

public abstract class BinaryExpression implements Expression {
    private final Expression lft;
    private final Expression rht;

    public BinaryExpression(final Expression lft, final Expression rht)
    {
        this.lft = lft;
        this.rht = rht;
    }

    public String toString()
    {
        return "(" + lft + " - " + rht + ")";
    }

    public double evaluate(final Bindings bindings)
    {
        return applyOperator(lft.evaluate(bindings), rht.evaluate(bindings));
    }

    protected abstract double applyOperator(double lftOprnt, double rhtOprnt);
}