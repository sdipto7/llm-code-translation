
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeforces_629_B {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final int N = 368;
        int[] m = new int[N];
        int[] f = new int[N];

        int numberOfLines = Integer.parseInt(reader.readLine().trim());
        for (int i = 0; i < numberOfLines; i++) {
            String[] input = reader.readLine().trim().split(" ");
            String x = input[0];
            int a = Integer.parseInt(input[1]);
            int b = Integer.parseInt(input[2]) + 1;

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
            if (Math.min(a, b) > c) {
                c = Math.min(a, b);
            }
        }

        System.out.println(c);
    }
}

