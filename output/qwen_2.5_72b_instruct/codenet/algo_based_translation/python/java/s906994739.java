import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class s906994739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<int[]> F = new ArrayList<>();
        List<int[]> P = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int[] f = new int[10];
            for (int j = 0; j < 10; j++) {
                f[j] = scanner.nextInt();
            }
            F.add(f);
        }

        for (int i = 0; i < n; i++) {
            int[] p = new int[10];
            for (int j = 0; j < 10; j++) {
                p[j] = scanner.nextInt();
            }
            P.add(p);
        }

        long ans = -1000000000000000000L;

        for (int i = 1; i < (1 << 10); i++) {
            long tmp = 0;
            int[] lst = new int[n];

            for (int j = 0; j < 10; j++) {
                if ((i & (1 << j)) != 0) {
                    for (int k = 0; k < n; k++) {
                        lst[k] += F.get(k)[j];
                    }
                }
            }

            for (int k = 0; k < n; k++) {
                tmp += P.get(k)[lst[k]];
            }

            ans = Math.max(ans, tmp);
        }

        System.out.println(ans);
    }
}
