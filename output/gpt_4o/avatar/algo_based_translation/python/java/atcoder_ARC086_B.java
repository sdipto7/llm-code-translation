
import java.util.*;
import java.io.*;

public class atcoder_ARC086_B {
    static final int MOD = 1000000007;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = I();
        int[] a = III(N);

        int maxVal = 0;
        int maxSign = 0;
        int maxIndex = -1;

        for (int i = 0; i < N; i++) {
            int a0 = a[i];
            if (Math.abs(a0) > maxVal) {
                maxVal = Math.abs(a0);
                maxSign = mySign(a0);
                maxIndex = i;
            }
        }

        if (maxSign == 0) {
            System.out.println(0);
        } else if (maxSign == 1) {
            System.out.println(2 * N - 1);
            for (int i = 0; i < N; i++) {
                System.out.println((maxIndex + 1) + " " + (i + 1));
            }
            for (int i = 0; i < N - 1; i++) {
                System.out.println((i + 1) + " " + (i + 2));
            }
        } else {
            System.out.println(2 * N - 1);
            for (int i = 0; i < N; i++) {
                System.out.println((maxIndex + 1) + " " + (i + 1));
            }
            for (int i = N - 1; i > 0; i--) {
                System.out.println((i + 1) + " " + i);
            }
        }
    }

    static int I() throws IOException {
        return Integer.parseInt(br.readLine().trim());
    }

    static int[] III(int N) throws IOException {
        int[] array = new int[N];
        String[] parts = br.readLine().trim().split(" ");
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(parts[i]);
        }
        return array;
    }

    static int mySign(int x) {
        return Integer.compare(x, 0);
    }
}

