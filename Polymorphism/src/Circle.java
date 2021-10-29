public class Circle extends Shape {
    protected double radius;

    /**
     * Constructor.
     */
    public Circle() {
        super();
    }

    /**
     * Constructor.
     */
    public Circle(double r) {
        radius = r;
    }

    /**
     * Constructor.
     */
    public Circle(double r, String c, boolean f) {
        super(c, f);
        radius = r;
    }

    /**
     * getter.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * setter.
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * getArea.
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * getPerimeter.
     */
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    /**
     * toString.
     */
    public String toString() {
        return "Circle[" + "radius=" + radius + ",color=" + color + ",filled=" + filled + ']';
    }
}
