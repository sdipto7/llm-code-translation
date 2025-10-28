
import java.util.Scanner;

public class s814885508 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long X = scanner.nextLong();
        long K = scanner.nextLong();
        long D = scanner.nextLong();

        long r = X / D;
        if (Math.abs(r) > K) {
            System.out.println(Math.abs(X) - K * D);
            return;
        }
        long a = X - r * D;
        if ((K - r) % 2 == 0) {
            System.out.println(a);
        } else {
            System.out.println(Math.abs(D - a));
        }
    }
}

