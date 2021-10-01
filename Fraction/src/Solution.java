public class Solution {
    /**
     * declare attributes here.
     */
    private int numerator = 0;
    private int denominator = 1;

    /**
     * declare constructor with no parameter.
     */
    public Solution() {
    }

    /**
     * declare constructor with parameters.
     */
    public Solution(int numerator, int denominator) {
        if (denominator != 0) {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    /**
     * declare constructor with other Fraction.
     */
    public Solution(Solution other) {
        if (other.denominator != 0) {
            this.numerator = other.numerator;
            this.denominator = other.denominator;
        }
    }

    /**
     * getter of numerator.
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * setter of numerator.
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * getter of denominator.
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * setter of denominator.
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    /**
     * reduce.
     */
    public Solution reduce() {
        int a = numerator;
        int b = denominator;
        while (a != 0) {
            int r = b % a;
            b = a;
            a = r;
        }
        numerator /= b;
        denominator /= b;
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        return this;
    }

    /**
     * add.
     */
    public Solution add(Solution other) {
        numerator = numerator * other.denominator + denominator * other.numerator;
        denominator = denominator * other.denominator;
        this.reduce();
        return this;
    }

    /**
     * subtract.
     */
    public Solution subtract(Solution other) {
        numerator = numerator * other.denominator - denominator * other.numerator;
        denominator = denominator * other.denominator;
        this.reduce();
        return this;
    }

    /**
     * multiply.
     */
    public Solution multiply(Solution other) {
        numerator = numerator * other.numerator;
        denominator = denominator * other.denominator;
        this.reduce();
        return this;
    }

    /**
     * divide.
     */
    public Solution divide(Solution other) {
        numerator = numerator * other.denominator;
        denominator = denominator * other.numerator;
        this.reduce();
        return this;
    }

    /**
     * compare this with other, notice that param is Object type.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            other.reduce();
            reduce();
            return (numerator == other.numerator && denominator == other.denominator);
        }
        return false;
    }
}