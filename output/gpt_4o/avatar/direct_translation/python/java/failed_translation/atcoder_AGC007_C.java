
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class atcoder_AGC007_C {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        double d = Double.parseDouble(input[1]);
        double x = Double.parseDouble(input[2]);
        System.out.println(main(N, d, x));
    }

    public static double main(int N, double d, double x) {
        double ret = 0;
        while (N > 0) {
            ret += d + (N - 0.5) * x;
            d = d + (d / N) + (5 * x) / (2 * N);
            x += 2 * x / N;
            N -= 1;
        }
        return ret;
    }
}

