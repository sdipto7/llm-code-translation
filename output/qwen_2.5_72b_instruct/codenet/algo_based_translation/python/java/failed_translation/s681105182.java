
import java.util.Arrays;
import java.util.Scanner;

public class s681105182 {
    static final long INF = (long) 1e18;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\s+");

        int N = scanner.nextInt();
        int[] a_li = new int[N];
        for (int i = 0; i < N; i++) {
            a_li[i] = scanner.nextInt();
        }

        Arrays.sort(a_li);

        int n = a_li[N - 1];
        long dif = INF;
        long prev_dif = dif;
        int r = 0;

        for (int i = 0; i < N - 1; i++) {
            int a = a_li[i];
            dif = Math.min(Math.abs(n / 2.0 - a), dif);
            if (dif != prev_dif) {
                r = a;
                prev_dif = dif;
            }
        }

        System.out.println(n + " " + r);
    }
}

