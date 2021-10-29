public class Square extends Expression {
    private Expression expression;

    /**
     * Constructor.
     */
    public Square(Expression expression) {
        this.expression = expression;
    }

    /**
     * toString.
     */
    public String toString() {
        return "(" + expression.toString() + ") ^ 2";
    }

    /**
     * evaluate.
     */
    public double evaluate() {
        double v = expression.evaluate();
        return v * v;
    }
}
