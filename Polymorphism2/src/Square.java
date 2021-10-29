public class Square extends Rectangle {
    static final double EPS = 0.001;

    /**
     * Constructor.
     */
    public Square() {
        super();
    }

    /**
     * Constructor.
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * Constructor.
     */
    public Square(double side, String c, boolean f) {
        super(side, side, c, f);
    }

    /**
     * Constructor.
     */
    public Square(Point t, double side, String c, boolean f) {
        super(t, side, side, c, f);
    }

    /**
     * getter.
     */
    public double getSide() {
        return super.getWidth();
    }

    /**
     * setter.
     */
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    /**
     * setter.
     */
    public void setWidth(double side) {
        setSide(side);
    }

    /**
     * setter.
     */
    public void setLength(double side) {
        setSide(side);
    }

    /**
     * Equals.
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Rectangle o = (Rectangle) obj;
        if (topLeft == null) {
            return false;
        }
        return (topLeft.equals(o.topLeft) && Math.abs(width - o.width) <= EPS
                && Math.abs(length - o.length) <= EPS);
    }

    /**
     * toString.
     */
    public String toString() {
        return "Square[" + "topLeft=" + topLeft.toString() + ",side=" + width
                + ",color=" + color + ",filled=" + filled + ']';
    }
}
