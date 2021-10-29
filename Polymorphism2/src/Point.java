import java.util.Objects;

public class Point {
    static final double EPS = 0.001;

    private double pointX;
    private double pointY;

    /**
     * Constructor.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * getter.
     */
    public double getPointX() {
        return pointX;
    }

    /**
     * setter.
     */
    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * getter.
     */
    public double getPointY() {
        return pointY;
    }

    /**
     * setter.
     */
    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * distance between 2 points this and o.
     */
    public double distance(Point o) {
        return Math.sqrt((pointX - o.pointX) * (pointX - o.pointX)
                + (pointY - o.pointY) * (pointY - o.pointY));
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
        Point o = (Point) obj;
        return (Math.abs(pointX - o.pointX) <= EPS && Math.abs(pointY - o.pointY) <= EPS);
    }

    /**
     * toString.
     */
    public String toString() {
        return "(" + pointX + "," + pointY + ")";
    }
}
