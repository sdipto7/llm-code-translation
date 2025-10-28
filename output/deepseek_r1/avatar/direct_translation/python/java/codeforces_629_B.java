
import java.util.Scanner;

public class codeforces_629_B {
    public static void main(String[] args) {
        int N = 368;
        int[] m = new int[N];
        int[] f = new int[N];
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split("\\s+");
            String x = parts[0];
            int a = Integer.parseInt(parts[1]);
            int b = Integer.parseInt(parts[2]) + 1;
            if (x.equals("M")) {
                m[a] += 2;
                if (b < N) {
                    m[b] -= 2;
                }
            } else {
                f[a] += 2;
                if (b < N) {
                    f[b] -= 2;
                }
            }
        }
        int sumM = 0, sumF = 0, max = 0;
        for (int i = 0; i < N; i++) {
            sumM += m[i];
            sumF += f[i];
            int currentMin = Math.min(sumM, sumF);
            if (currentMin > max) {
                max = currentMin;
            }
        }
        System.out.println(max);
    }
}

