
import java.util.*;
import java.io.*;

public class codeforces_400_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        for (int t = 0; t < testCases; t++) {
            solve(br.readLine());
        }
    }

    private static void solve(String x) {
        ArrayList<int[]> tot = new ArrayList<>();
        int[] s = new int[12];
        for (int i = 0; i < x.length(); i++) {
            s[i] = (x.charAt(i) == 'O') ? 0 : 1;
        }
        for (int i = 1; i <= 12; i++) {
            if (12 % i == 0) {
                if (help(i, 12 / i, s)) {
                    tot.add(new int[]{12 / i, i});
                }
            }
        }
        System.out.print(tot.size() + " ");
        tot.sort(Comparator.comparingInt(a -> a[0]));
        for (int[] ab : tot) {
            System.out.print(ab[0] + "x" + ab[1] + " ");
        }
        System.out.println();
    }

    private static boolean help(int a, int b, int[] l) {
        for (int i = 0; i < b; i++) {
            int sum = 0;
            for (int j = 0; j < a; j++) {
                sum += l[i * a + j];
            }
            if (sum == b) return true;
        }
        return false;
    }
}

