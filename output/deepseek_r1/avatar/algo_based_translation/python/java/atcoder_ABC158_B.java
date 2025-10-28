
import java.util.Scanner;

public class atcoder_ABC158_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int mod = (int) 1e9 + 7;
        int ans = 0;
        int rep = n / (a + b);
        ans += rep * a;
        int res = n - rep * (a + b);
        ans += Math.min(res, a);
        System.out.println(ans);
    }
}

