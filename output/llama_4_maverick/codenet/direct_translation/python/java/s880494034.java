
import java.util.Scanner;

public class s880494034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        String[] XS = scanner.nextLine().split(" ");
        long m = 9999999999L;
        for (int i = 1; i <= 100; i++) {
            long c = 0;
            for (String x : XS) {
                c += (long) Math.pow(Integer.parseInt(x) - i, 2);
            }
            if (m > c) {
                m = c;
            }
        }
        System.out.println(m);
    }
}

