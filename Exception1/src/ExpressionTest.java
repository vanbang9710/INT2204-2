public class ExpressionTest {
    public static void main(String[] args) {
        Numeral n = new Numeral(10);
        Square s = new Square(n);
        Addition a = new Addition(s, new Numeral(-3));
        Multiplication m = new Multiplication(new Numeral(4), new Numeral(3));
        Addition a1 = new Addition(a, m);
        Square s1 = new Square(a1);
        Division d = new Division(s1, new Numeral(0));
        Expression ans = d;
        System.out.println(ans.toString());
        System.out.println(ans.evaluate());
    }
}
