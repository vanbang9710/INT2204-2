public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * Constructor.
     */
    public Shape() {

    }

    /**
     * Constructor.
     */
    public Shape(String c, boolean f) {
        color = c;
        filled = f;
    }

    /**
     * getter.
     */
    public String getColor() {
        return color;
    }

    /**
     * setter.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * getter.
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * setter.
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * getArea.
     */
    public abstract double getArea();

    /**
     * getPerimeter.
     */
    public abstract double getPerimeter();

    /**
     * toString.
     */
    public String toString() {
        return "Shape[" + "color=" + color + ",filled=" + filled + ']';
    }
}
