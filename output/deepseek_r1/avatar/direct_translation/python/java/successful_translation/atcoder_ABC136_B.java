
import java.util.Scanner;

public class atcoder_ABC136_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long ans = 0;
        long current = 10;
        long prev = 1;
        while (current <= N) {
            ans += current - prev;
            long nextPrev = current * 10;
            current *= 100;
            prev = nextPrev;
        }
        ans += Math.max(0, N - prev + 1);
        System.out.println(ans);
    }
}

