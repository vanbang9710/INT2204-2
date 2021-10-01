import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        int a = 1;
        int b = 2;
        int c = -1;
        int d = -2;
        Solution f = new Solution(a, b);
        Solution g = new Solution(c, d);
        f.multiply(g);
        //f.divide(g);
        //System.out.println(f.equals(g));
        System.out.println(f.getNumerator());
        System.out.println(f.getDenominator());
    }
}
