
import java.util.Scanner;

public class s880494034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();
        String[] XS = scanner.nextLine().split("\\s+");
        int[] xs = new int[XS.length];
        for (int i = 0; i < XS.length; i++) {
            xs[i] = Integer.parseInt(XS[i]);
        }
        long m = 9999999999L;
        for (int i = 1; i <= 100; i++) {
            long c = 0;
            for (int x : xs) {
                c += (long) Math.pow(x - i, 2);
            }
            if (m > c) {
                m = c;
            }
        }
        System.out.println(m);
    }
}

