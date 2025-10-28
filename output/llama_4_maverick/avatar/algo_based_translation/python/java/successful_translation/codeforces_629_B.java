
import java.util.Scanner;

public class codeforces_629_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 368;
        int[] m = new int[N];
        int[] f = new int[N];
        int iterations = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < iterations; i++) {
            String[] line = scanner.nextLine().split(" ");
            String x = line[0];
            int a = Integer.parseInt(line[1]);
            int b = Integer.parseInt(line[2]) + 1;
            if (x.equals("M")) {
                m[a] += 2;
                m[b] -= 2;
            } else {
                f[a] += 2;
                f[b] -= 2;
            }
        }
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < N; i++) {
            a += m[i];
            b += f[i];
            c = Math.max(c, Math.min(a, b));
        }
        System.out.println(c);
    }
}

