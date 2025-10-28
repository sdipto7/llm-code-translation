
import java.util.Scanner;

public class atcoder_ABC158_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long mod = (long) Math.pow(10, 9) + 7;
        long N = scanner.nextLong();
        long A = scanner.nextLong();
        long B = scanner.nextLong();
        long ans = 0;
        long rep = N / (A + B);
        ans += rep * A;
        long res = N - rep * (A + B);
        ans += Math.min(res, A);
        System.out.println(ans);
    }
}

