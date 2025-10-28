
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
        int first = (int)Math.pow(10, s);
        int second = first / 2;
        int ans = -1;
        int[] candidates = {l, r, first, second};
        for (int i : candidates) {
            if (i >= l && i <= r) {
                curr = i;
                String numStr = Integer.toString(curr);
                StringBuilder revBuilder = new StringBuilder();
                for (char k : numStr.toCharArray()) {
                    int digit = Character.getNumericValue(k);
                    revBuilder.append(9 - digit);
                }
                String revStr = revBuilder.toString();
                int revNum = Integer.parseInt(revStr);
                int product = revNum * curr;
                if (product > ans) {
                    ans = product;
                }
            }
        }
        System.out.println(ans);
    }
}

