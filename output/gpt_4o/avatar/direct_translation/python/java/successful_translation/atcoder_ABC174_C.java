
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class atcoder_ABC174_C {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(stdin.readLine().trim());
        int t = 0;
        for (int i = 1; i <= k; i++) {
            t = (t % k) * 10 + 7;
            if (t % k == 0) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}

