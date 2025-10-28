
import java.util.Scanner;

public class codeforces_86_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int curr = r;
        int s = 0;
        while (curr != 0) {
            s += 1;
            curr /= 10;
        }
        int first = (int) Math.pow(10, s);
        int second = first / 2;
        int ans = -1;
        int[] candidates = {l, r, first, second};
        for (int i : candidates) {
            if (i >= l && i <= r) {
                curr = i;
                String rev = "";
                for (char k : String.valueOf(curr).toCharArray()) {
                    rev += String.valueOf(9 - (k - '0'));
                }
                ans = Math.max(ans, Integer.parseInt(rev) * curr);
            }
        }
        System.out.println(ans);
    }
}

