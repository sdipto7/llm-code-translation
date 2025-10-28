
import java.util.Scanner;

public class s752993784 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char[] s = input.toCharArray();
        int[] countRemainder = new int[2019];
        long cnt = 0;
        long m = 1;
        long mod = 0;
        for (int i = s.length - 1; i >= 0; i--) {
            mod += (s[i] - '0') * m;
            mod %= 2019;
            m *= 10;
            m %= 2019;
            countRemainder[(int) mod]++;
        }
        countRemainder[0]++;
        for (int i = 0; i < 2019; i++) {
            cnt += (long) countRemainder[i] * (countRemainder[i] - 1) / 2;
        }
        System.out.println(cnt);
    }
}

