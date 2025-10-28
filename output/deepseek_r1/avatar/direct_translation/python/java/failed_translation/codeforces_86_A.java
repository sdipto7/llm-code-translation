
import java.util.Scanner;

public class codeforces_86_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int curr = r;
        int s = 0;
        while (curr != 0) {
            s++;
            curr /= 10;
        }
        int first = (int) Math.pow(10, s);
        int second = first / 2;
        int[] candidates = {l, r, first, second};
        int ans = -1;
        for (int i : candidates) {
            if (i >= l && i <= r) {
                String currStr = Integer.toString(i);
                StringBuilder revBuilder = new StringBuilder();
                for (char k : currStr.toCharArray()) {
                    revBuilder.append(9 - (k - '0'));
                }
                int rev = Integer.parseInt(revBuilder.toString());
                ans = Math.max(ans, rev * i);
            }
        }
        System.out.println(ans);
    }
}

