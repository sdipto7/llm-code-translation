
import java.util.Scanner;

public class atcoder_ABC178_B {
    static final long inf = (long) 1e20;
    static final int mod = (int) (1e9 + 7);
    static final int[][] dd = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static final int[][] ddn = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(main(a, b, c, d));
    }

    public static long main(int a, int b, int c, int d) {
        long ac = (long) a * c;
        long bd = (long) b * d;
        long ad = (long) a * d;
        long bc = (long) b * c;
        return Math.max(Math.max(ac, bd), Math.max(ad, bc));
    }
}

