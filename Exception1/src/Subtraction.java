public class Subtraction extends BinaryExpression {
    /**
     * Constructor.
     */
    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * toString.
     */
    public String toString() {
        return "(" + left.toString() + " - " + right.toString() + ")";
    }

    /**
     * evaluate.
     */
    public double evaluate() {
        return left.evaluate() - right.evaluate();
    }
}
