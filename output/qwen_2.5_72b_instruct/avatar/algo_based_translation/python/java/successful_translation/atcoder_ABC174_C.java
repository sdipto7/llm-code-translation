
import java.util.Scanner;

public class atcoder_ABC174_C {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int mod = 1000000007;
        int k = stdin.nextInt();
        int t = 0;
        for (int i = 1; i <= k; i++) {
            t = (t % k) * 10 + 7;
            if (t % k == 0) {
                System.out.println(i);
                break;
            }
        }
        if (t % k != 0) {
            System.out.println(-1);
        }
        stdin.close();
    }
}

