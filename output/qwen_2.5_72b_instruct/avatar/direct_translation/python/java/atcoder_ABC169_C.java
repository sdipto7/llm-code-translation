
import java.util.Scanner;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int P = 1000000007;
        int INF = 1000000010;
        String sa = stdin.next();
        String sb = stdin.next();
        int a = Integer.parseInt(sa);
        int b = (int) (Float.parseFloat(sb) * 100 + 0.1);
        System.out.println(a * b / 100);
    }
}

