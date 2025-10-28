
import java.util.Scanner;

public class codeforces_242_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int id = 0;
        for (int i = 1; i < n; i++) {
            int li = scanner.nextInt();
            int ri = scanner.nextInt();
            if (li <= l && r <= ri) {
                id = i;
            } else if (li < l || ri > r) {
                id = n;
            }
            l = Math.min(l, li);
            r = Math.max(r, ri);
        }
        System.out.println(id == n ? -1 : id + 1);
    }
}

