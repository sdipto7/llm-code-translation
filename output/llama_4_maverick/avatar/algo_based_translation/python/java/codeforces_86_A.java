
import java.util.Scanner;

public class codeforces_86_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int l = Integer.parseInt(input[0]);
        int r = Integer.parseInt(input[1]);
        int curr = r;
        int s = 0;
        while (curr != 0) {
            s += 1;
            curr /= 10;
        }
        int first = (int) Math.pow(10, s);
        int second = first / 2;
        long ans = -1;
        for (int i : new int[]{l, r, first, second}) {
            if (i >= l && i <= r) {
                curr = i;
                StringBuilder rev = new StringBuilder();
                for (char k : String.valueOf(curr).toCharArray()) {
                    rev.append(9 - Character.getNumericValue(k));
                }
                ans = Math.max(ans, (long) curr * Long.parseLong(rev.toString()));
            }
        }
        System.out.println(ans);
    }
}

