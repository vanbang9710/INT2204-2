public class Division extends BinaryExpression {
    /**
     * Constructor.
     */
    public Division(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * toString.
     */
    public String toString() {
        return "(" + left.toString() + " / " + right.toString() + ")";
    }

    /**
     * evaluate.
     */
    public double evaluate() {
        if (Math.abs(right.evaluate()) <= 1e-6) {
            throw new ArithmeticException("Lỗi chia cho 0");
        } else {
            return left.evaluate() / right.evaluate();
        }
    }
}
