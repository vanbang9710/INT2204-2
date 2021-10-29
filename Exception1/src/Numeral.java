public class Numeral extends Expression {
    private double value;

    /**
     * Constructor.
     */
    public Numeral() {
    }

    /**
     * Constructor.
     */
    public Numeral(double value) {
        this.value = value;
    }

    /**
     * toString.
     */
    public String toString() {
        return String.format("%.0f", value);
    }

    /**
     * evaluate.
     */
    public double evaluate() {
        return value;
    }
}
