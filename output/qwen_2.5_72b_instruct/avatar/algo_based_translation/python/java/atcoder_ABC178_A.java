
import java.util.Scanner;

public class atcoder_ABC178_A {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int tcs = 1;
        int tc = 1;
        while (tc <= tcs) {
            solve(tc);
            tc += 1;
        }
    }

    public static void solve(int tc) {
        int a = stdin.nextInt();
        System.out.println(a == 0 ? 1 : 0);
    }
}

