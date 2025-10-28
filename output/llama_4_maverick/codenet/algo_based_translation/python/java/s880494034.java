
import java.util.Scanner;

public class s880494034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.nextLine();
        String[] XSString = scanner.nextLine().split(" ");
        int[] XS = new int[XSString.length];
        for (int i = 0; i < XSString.length; i++) {
            XS[i] = Integer.parseInt(XSString[i]);
        }
        long m = 9999999999L;
        for (int i = 1; i <= 100; i++) {
            long c = 0;
            for (int x : XS) {
                c += (long) Math.pow(x - i, 2);
            }
            if (c < m) {
                m = c;
            }
        }
        System.out.println(m);
        scanner.close();
    }
}

