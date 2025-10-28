
import java.util.Scanner;

public class s814885508 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long X = scanner.nextLong();
        long K = scanner.nextLong();
        long D = scanner.nextLong();
        scanner.close();

        long r = Math.floorDiv(X, D);
        if (Math.abs(r) > K) {
            System.out.println(Math.abs(X) - K * D);
            return;
        }
        long a = X - r * D;
        if ((K - r) % 2 == 0) {
            System.out.println(Math.abs(a));
        } else {
            System.out.println(Math.abs(D - Math.abs(a)));
        }
    }
}

