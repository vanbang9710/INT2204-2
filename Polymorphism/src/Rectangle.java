public class Rectangle extends Shape {
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
     * toString.
     */
    public String toString() {
        return "Rectangle[" + "width=" + width + ",length=" + length
                + ",color=" + color + ",filled=" + filled + ']';
    }
}
