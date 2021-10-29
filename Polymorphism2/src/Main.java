public class Main {
    static final double EPS = 0.001;

    public static void main(String[] args) {
        Shape s1 = new Circle(new Point(0, 1), 5.5, "RED", false);
        Circle c1 = (Circle)s1;
        Rectangle r2 = new Rectangle(new Point(0, 1), 1.0, 2.0, "RED", false);
        Rectangle r1 = new Rectangle(new Point(1, 1), 1.0, 2.0, "RED", false);
        Shape s4 = new Square(new Point(0, 1), 2.0, "RED", false);
        Square sq1 = (Square)s4;
        Layer l = new Layer();
        l.addShape(c1);
        l.addShape(r1);
        l.addShape(c1);
        l.addShape(r2);
        l.addShape(sq1);
        l.addShape(r1);
        System.out.println(l.getInfo());
        //l.removeCircles();
        //System.out.println(l.getInfo());
        l.removeDuplicates();
        System.out.println(l.getInfo());
    }
}
