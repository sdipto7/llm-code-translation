
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class atcoder_ABC178_A {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int tcs = 1;
        int tc = 1;
        while (tc <= tcs) {
            solve(tc, stdin);
            tc++;
        }
    }

    public static void solve(int tc, BufferedReader stdin) throws IOException {
        int a = Integer.parseInt(stdin.readLine().trim());
        System.out.println(a == 0 ? 1 : 0);
    }
}

