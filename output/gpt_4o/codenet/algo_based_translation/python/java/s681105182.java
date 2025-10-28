
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class s681105182 {

    public static final long INF = (long) 1e18;
    public static final int MOD = (int) 1e9 + 7;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine().trim());
        int[] a_li = Arrays.stream(reader.readLine().trim().split(" "))
                           .mapToInt(Integer::parseInt)
                           .toArray();

        Arrays.sort(a_li);

        int n = a_li[N - 1];

        long dif = INF;
        long prev_dif = dif;
        int r = 0;

        for (int i = 0; i < N - 1; i++) {
            int a = a_li[i];
            long current_dif = Math.abs(n / 2.0 - a);
            if (current_dif < dif) {
                dif = current_dif;
                r = a;
            }
        }

        System.out.println(n + " " + r);
    }
}

