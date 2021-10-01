public class Circle {
    protected static final double PI = Math.PI;
    private double radius = 1.0;
    private String color = "red";

    /**
     * Constructor1.
     */
    public Circle() {
    }

    /**
     * Constructor2.
     */
    public Circle(double r) {
        radius = r;
    }

    /**
     * Constructor3.
     */
    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    /**
     * getter of radius.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * setter of radius.
     */
    public void setRadius(double r) {
        radius = r;
    }

    /**
     * getter of color.
     */
    public String getColor() {
        return color;
    }

    /**
     * setter of color.
     */
    public void setColor(String c) {
        color = c;
    }

    /**
     * Area of the circle.
     */
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * convert to String.
     */
    public String toString() {
        return "Circle[" + radius + "," + color + "]";
    }
}
