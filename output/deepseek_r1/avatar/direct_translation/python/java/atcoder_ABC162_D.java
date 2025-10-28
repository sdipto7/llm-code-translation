
import java.util.Scanner;

public class atcoder_ABC162_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String S = scanner.nextLine();
        calculate(N, S);
    }

    public static void calculate(int n, String s) {
        char[] arr = s.toCharArray();
        int rNum = 0, gNum = 0, bNum = 0;
        for (char c : arr) {
            if (c == 'R') rNum++;
            else if (c == 'G') gNum++;
            else if (c == 'B') bNum++;
        }
        long sum = 0;
        int maxStep = (int) Math.ceil(n / 2.0) + 1;
        for (int step = 1; step < maxStep; step++) {
            for (int i = 0; i <= n - 3 * step; i++) {
                char c1 = arr[i];
                char c2 = arr[i + step];
                char c3 = arr[i + 2 * step];
                if ((c1 == 'R' && c2 == 'G' && c3 == 'B') ||
                    (c1 == 'R' && c2 == 'B' && c3 == 'G') ||
                    (c1 == 'B' && c2 == 'G' && c3 == 'R') ||
                    (c1 == 'B' && c2 == 'R' && c3 == 'G') ||
                    (c1 == 'G' && c2 == 'B' && c3 == 'R') ||
                    (c1 == 'G' && c2 == 'R' && c3 == 'B')) {
                    sum++;
                }
            }
        }
        long total = (long) rNum * gNum * bNum - sum;
        System.out.println(total);
    }
}

