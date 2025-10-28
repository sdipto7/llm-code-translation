
import java.util.*;

public class atcoder_ABC112_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<int[]> lsXYH = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int h = scanner.nextInt();
            lsXYH.add(new int[]{x, y, h});
        }
        System.out.println(solve(n, lsXYH));
    }

    static String solve(int n, List<int[]> lsXYH) {
        int[] first = null;
        for (int[] point : lsXYH) {
            if (point[2] > 0) {
                first = point;
                break;
            }
        }
        int x0 = first[0], y0 = first[1], h0 = first[2];
        List<int[]> candidates = new ArrayList<>();
        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                int ch = h0 + Math.abs(cx - x0) + Math.abs(cy - y0);
                candidates.add(new int[]{cx, cy, ch});
            }
        }
        for (int[] point : lsXYH) {
            int x = point[0], y = point[1], h = point[2];
            List<int[]> temp = new ArrayList<>();
            for (int[] c : candidates) {
                int cx = c[0], cy = c[1], ch = c[2];
                int calc = ch - Math.abs(cx - x) - Math.abs(cy - y);
                if (Math.max(calc, 0) == h) {
                    temp.add(c);
                }
            }
            candidates = temp;
        }
        int[] ans = candidates.get(0);
        return ans[0] + " " + ans[1] + " " + ans[2];
    }
}

