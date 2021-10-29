public class Addition extends BinaryExpression {
    /**
     * Constructor.
     */
    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * toString.
     */
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }

    /**
     * evaluate.
     */
    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }
}
