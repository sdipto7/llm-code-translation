
import java.io.*;
import java.util.*;

public class codeforces_400_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String x = br.readLine().trim();
            boolean[] s = new boolean[12];
            for (int i = 0; i < 12; i++) {
                s[i] = x.charAt(i) == 'X';
            }
            List<int[]> list = new ArrayList<>();
            for (int i = 1; i <= 12; i++) {
                if (12 % i != 0) continue;
                int a = i;
                int b = 12 / i;
                if (check(a, b, s)) {
                    list.add(new int[]{b, a});
                }
            }
            Collections.sort(list, (o1, o2) -> {
                if (o1[0] != o2[0]) {
                    return Integer.compare(o1[0], o2[0]);
                } else {
                    return Integer.compare(o1[1], o2[1]);
                }
            });
            System.out.print(list.size() + " ");
            for (int[] pair : list) {
                System.out.print(pair[0] + "x" + pair[1] + " ");
            }
            System.out.println();
        }
    }

    private static boolean check(int a, int b, boolean[] s) {
        for (int col = 0; col < a; col++) {
            boolean allX = true;
            for (int row = 0; row < b; row++) {
                int index = row * a + col;
                if (index >= s.length || !s[index]) {
                    allX = false;
                    break;
                }
            }
            if (allX) return true;
        }
        return false;
    }
}

