
import java.util.*;
import java.io.*;

public class atcoder_ABC112_C {

    public static void main(String[] args) {
        System.out.println(solve(readQuestion()));
    }

    public static String solve(int n, List<int[]> ls_xyh) {
        Integer x0 = null, y0 = null, h0 = null;
        for (int i = 0; i < n; i++) {
            if (ls_xyh.get(i)[2] > 0) {
                x0 = ls_xyh.get(i)[0];
                y0 = ls_xyh.get(i)[1];
                h0 = ls_xyh.get(i)[2];
                break;
            }
        }
        List<int[]> cands = new ArrayList<>();
        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                cands.add(new int[]{cx, cy, h0 + Math.abs(cx - x0) + Math.abs(cy - y0)});
            }
        }
        for (int[] xyh : ls_xyh) {
            int x = xyh[0];
            int y = xyh[1];
            int h = xyh[2];
            cands.removeIf(c -> Math.max(c[2] - Math.abs(c[0] - x) - Math.abs(c[1] - y), 0) != h);
        }
        int[] result = cands.get(0);
        return result[0] + " " + result[1] + " " + result[2];
    }

    public static int[] readQuestion() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<int[]> ls_xyh = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int h = scanner.nextInt();
            ls_xyh.add(new int[]{x, y, h});
        }
        int[] result = new int[n * 3 + 1];
        result[0] = n;
        for (int i = 0; i < ls_xyh.size(); i++) {
            result[i * 3 + 1] = ls_xyh.get(i)[0];
            result[i * 3 + 2] = ls_xyh.get(i)[1];
            result[i * 3 + 3] = ls_xyh.get(i)[2];
        }
        return result;
    }
}

