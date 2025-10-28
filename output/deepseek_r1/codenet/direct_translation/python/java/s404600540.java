
import java.util.Scanner;

public class s404600540 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long q = scanner.nextLong();
        long h = scanner.nextLong();
        long s = scanner.nextLong();
        long d = scanner.nextLong();
        long n = scanner.nextLong();

        long min1 = Math.min(Math.min(q * 4, h * 2), Math.min(q * 2 + h, s));
        long min2 = Math.min(min1 * 2, d);

        long total = (n / 2) * min2 + (n % 2) * min1;
        System.out.println(total);
    }
}

