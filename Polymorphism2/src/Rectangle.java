public class Rectangle extends Shape {
    static final double EPS = 0.001;

    protected Point topLeft;
    protected double width;
    protected double length;

    /**
     * Constructor.
     */
    public Rectangle() {
        super();
    }

    /**
     * Constructor.
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor.
     */
    public Rectangle(double width, double length, String c, boolean f) {
        super(c, f);
        this.width = width;
        this.length = length;
    }

    /**
     * Constructor.
     */
    public Rectangle(Point t, double width, double length, String c, boolean f) {
        super(c, f);
        topLeft = t;
        this.width = width;
        this.length = length;
    }

    /**
     * getter.
     */
    public double getWidth() {
        return width;
    }

    /**
     * setter.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * getter.
     */
    public double getLength() {
        return length;
    }

    /**
     * setter.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * getArea.
     */
    public double getArea() {
        return width * length;
    }

    /**
     * getPerimeter.
     */
    public double getPerimeter() {
        return 2 * (width + length);
    }

    /**
     * getter.
     */
    public Point getTopLeft() {
        return topLeft;
    }

    /**
     * setter.
     */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
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
        return "Rectangle[" + "topLeft=" + topLeft.toString() + ",width=" + width
                + ",length=" + length + ",color=" + color + ",filled=" + filled + ']';
    }
}
