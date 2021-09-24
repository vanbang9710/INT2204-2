public class Solution {
    /**
     * declare attributes here.
     */
    private int numerator;
    private int denominator;

    /**
     * declare constructor with no parameter.
     */
    public Solution() {
        this.numerator = 0;
        this.denominator = 1;
    }

    /**
     * declare constructor with parameters.
     */
    public Solution(int numerator, int denominator) {
        if (denominator != 0) {
            this.numerator = numerator;
            this.denominator = denominator;
            reduce();
        } else {
            this.numerator = 0;
            this.denominator = 1;
        }
    }

    /**
     * declare constructor with other Fraction.
     */
    public Solution(Solution other) {
        if (other.denominator != 0) {
            this.numerator = other.numerator;
            this.denominator = other.denominator;
            reduce();
        } else {
            this.numerator = 0;
            this.denominator = 1;
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
        reduce();
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
            reduce();
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
     * reduce big num.
     */
    public Solution reduce(long numerator, long denominator) {
        long a = numerator;
        long b = denominator;
        while (a != 0) {
            long r = b % a;
            b = a;
            a = r;
        }
        numerator /= b;
        denominator /= b;
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        this.numerator = (int) numerator;
        this.denominator = (int) denominator;
        return this;
    }

    /**
     * add.
     */
    public Solution add(Solution other) {
        if (other.denominator == 0) {
            return this;
        }
        long numerator = (long) this.numerator * other.denominator
                + (long) this.denominator * other.numerator;
        long denominator = (long) this.denominator * other.denominator;
        return reduce(numerator, denominator);
    }

    /**
     * subtract.
     */
    public Solution subtract(Solution other) {
        if (other.denominator == 0) {
            return this;
        }
        long numerator = (long) this.numerator * other.denominator
                - (long) this.denominator * other.numerator;
        long denominator = (long) this.denominator * other.denominator;
        return reduce(numerator, denominator);
    }

    /**
     * multiple.
     */
    public Solution multiple(Solution other) {
        if (other.denominator == 0) {
            return this;
        }
        long numerator = (long) this.numerator * other.numerator;
        long denominator = (long) this.denominator * other.denominator;
        return reduce(numerator, denominator);
    }

    /**
     * divide.
     */
    public Solution divide(Solution other) {
        if (other.numerator != 0) {
            long numerator = (long) this.numerator * other.denominator;
            long denominator = (long) this.denominator * other.numerator;
            return reduce(numerator, denominator);
        }
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