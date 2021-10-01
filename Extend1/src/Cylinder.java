public class Cylinder extends Circle {
    private double height = 1.0;

    /**
     * Constructor1.
     */
    public Cylinder() {
    }

    /**
     * Constructor2.
     */
    public Cylinder(double r) {
        super(r);
    }

    /**
     * Constructor3.
     */
    public Cylinder(double r, double h) {
        super(r);
        height = h;
    }

    /**
     * Constructor4.
     */
    public Cylinder(double r, double h, String c) {
        super(r, c);
        height = h;
    }

    /**
     * getter of height.
     */
    public double getHeight() {
        return height;
    }

    /**
     * setter of height.
     */
    public void setHeight(double h) {
        height = h;
    }

    /**
     * Volume of the cylinder.
     */
    public double getVolume() {
        return getArea() * height;
    }

    /**
     * convert to String.
     */
    public String toString() {
        return "Cylinder[" + super.toString() + "," + height + "]";
    }
}
