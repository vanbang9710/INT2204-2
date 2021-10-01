public class Main {
    public static void main(String[] args) {
	    Circle circle = new Circle(2.0);
        System.out.println(circle.toString());
        System.out.println(circle.getArea());
        Cylinder cylinder = new Cylinder(2.0, 3.0);
        System.out.println(cylinder.toString());
        System.out.println(cylinder.getVolume());
    }
}
