public abstract class BinaryExpression extends Expression {
    protected Expression left;
    protected Expression right;

    /**
     * Constructor.
     */
    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
