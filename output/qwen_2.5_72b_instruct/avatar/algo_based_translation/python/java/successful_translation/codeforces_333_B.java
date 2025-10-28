import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class codeforces_333_B {
    public static void main(String[] args) {
        Scanner I = new Scanner(System.in);
        int n = I.nextInt();
        int m = I.nextInt();
        List<Integer> b = new ArrayList<>();
        for (int j = 0; j < 2 * n; j++) {
            b.add(1);
        }
        b.set(0, 0);
        b.set(n - 1, 0);
        b.set(n, 0);
        b.set(2 * n - 1, 0);
        for (int i = 0; i < m; i++) {
            int r = I.nextInt();
            int c = I.nextInt();
            b.set(r - 1, 0);
            b.set(n + c - 1, 0);
        }
        if (n % 2 != 0 && b.get(n / 2) != 0 && b.get(n + n / 2) != 0) {
            b.set(n / 2, 0);
        }
        int sum = 0;
        for (int value : b) {
            sum += value;
        }
        System.out.println(sum);
        I.close();
    }
}
