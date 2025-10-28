
import java.util.Scanner;

public class codeforces_86_A {

    public static int calculateMaximumProduct(int l, int r) {
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
                StringBuilder rev = new StringBuilder();
                for (char k : String.valueOf(curr).toCharArray()) {
                    rev.append(9 - Character.getNumericValue(k));
                }
                int product = Integer.parseInt(rev.toString()) * curr;
                ans = Math.max(ans, product);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        scanner.close();

        int result = calculateMaximumProduct(l, r);
        System.out.println(result);
    }
}

