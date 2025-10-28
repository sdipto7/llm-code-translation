
import java.util.*;

public class s664563518 {
    static Scanner scanner = new Scanner(System.in);

    public static int I() {
        return scanner.nextInt();
    }

    public static String input() {
        return scanner.next();
    }

    public static void main(String[] args) {
        int N = I();
        String[] s = new String[N];
        int[] t = new int[N];

        for (int i = 0; i < N; i++) {
            s[i] = input();
            t[i] = I();
        }

        String X = input();
        int xi = 0;

        for (int i = 0; i < N; i++) {
            if (s[i].equals(X)) {
                xi = i;
                break;
            }
        }

        int ans = 0;

        for (int i = 0; i < N; i++) {
            if (xi < i) {
                ans += t[i];
            }
        }

        System.out.println(ans);
    }
}

