import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        Solution f = new Solution(a, b);
        Solution g = new Solution(c, d);
        f.multiple(g);
        System.out.println(f.equals(g));
        System.out.println(f.getNumerator());
        System.out.println(f.getDenominator());
    }
}
