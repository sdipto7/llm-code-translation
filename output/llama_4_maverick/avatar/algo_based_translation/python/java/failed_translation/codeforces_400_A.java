
import java.util.*;

public class codeforces_400_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            solve(scanner);
        }
    }

    public static void solve(Scanner scanner) {
        List<int[]> tot = new ArrayList<>();
        String x = scanner.next();
        int[] s = new int[x.length()];
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'O') {
                s[i] = 0;
            } else {
                s[i] = 1;
            }
        }
        for (int i = 1; i <= 12; i++) {
            if (12 % i == 0) {
                if (help(i, 12 / i, s)) {
                    tot.add(new int[]{12 / i, i});
                }
            }
        }
        Collections.sort(tot, (a, b) -> a[0] - b[0]);
        System.out.print(tot.size() + " ");
        for (int[] pair : tot) {
            System.out.print(pair[0] + "x" + pair[1] + " ");
        }
        System.out.println();
    }

    public static boolean help(int a, int b, int[] l) {
        int[][] tot = new int[b][a];
        for (int i = 0; i < b; i++) {
            System.arraycopy(l, i * a, tot[i], 0, a);
        }
        for (int j = 0; j < a; j++) {
            int sum = 0;
            for (int i = 0; i < b; i++) {
                sum += tot[i][j];
            }
            if (sum == b) {
                return true;
            }
        }
        return false;
    }
}

