
import java.util.Scanner;

public class codeforces_11_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        sc.nextLine();
        String[] xStr = sc.nextLine().split(" ");
        int[] x = new int[xStr.length];
        for (int i = 0; i < xStr.length; i++) {
            x[i] = Integer.parseInt(xStr[i]);
        }
        int m = 0;
        for (int a = 0; a < x.length - 1; a++) {
            if (x[a] >= x[a + 1]) {
                int q = (x[a] - x[a + 1]) / d + 1;
                m += q;
                x[a + 1] += q * d;
            }
        }
        System.out.println(m);
    }
}

