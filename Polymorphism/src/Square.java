public class Square extends Rectangle {
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
     * toString.
     */
    public String toString() {
        return "Square[" + "side=" + width + ",color=" + color + ",filled=" + filled + ']';
    }
}
