
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class atcoder_ABC178_A {

    public static void main(String[] args) throws IOException {
        int tcs = 1;
        int tc = 1;
        while (tc <= tcs) {
            solve(tc);
            tc++;
        }
    }
    
    public static void solve(int tc) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine().trim());
        if (a == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

