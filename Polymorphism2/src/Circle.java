public class Circle extends Shape {
    static final double EPS = 0.001;

    protected Point center;
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
     * Constructor.
     */
    public Circle(Point p, double r, String c, boolean f) {
        super(c, f);
        center = p;
        radius = r;
    }

    /**
     * getter.
     */
    public Point getCenter() {
        return center;
    }

    /**
     * setter.
     */
    public void setCenter(Point center) {
        this.center = center;
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
     * Equals.
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Circle o = (Circle) obj;
        if (center == null) {
            return false;
        }
        return (center.equals(o.center) && Math.abs(radius - o.radius) <= EPS);
    }

    /**
     * toString.
     */
    public String toString() {
        return "Circle[" + "center=" + center.toString() + ",radius=" + radius
                + ",color=" + color + ",filled=" + filled + ']';
    }
}
