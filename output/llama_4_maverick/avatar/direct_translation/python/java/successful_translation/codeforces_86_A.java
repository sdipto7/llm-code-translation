
import java.util.Scanner;

public class codeforces_86_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        long l = Long.parseLong(input[0]);
        long r = Long.parseLong(input[1]);
        long curr = r;
        int s = 0;
        while (curr > 0) {
            s += 1;
            curr /= 10;
        }
        long first = (long) Math.pow(10, s);
        long second = first / 2;
        long ans = -1;
        long[] arr = {l, r, first, second};
        for (long i : arr) {
            if (i >= l && i <= r) {
                curr = i;
                String strCurr = Long.toString(curr);
                StringBuilder rev = new StringBuilder();
                for (int j = 0; j < strCurr.length(); j++) {
                    rev.append(9 - Character.getNumericValue(strCurr.charAt(j)));
                }
                ans = Math.max(ans, Long.parseLong(rev.toString()) * curr);
            }
        }
        System.out.println(ans);
    }
}

