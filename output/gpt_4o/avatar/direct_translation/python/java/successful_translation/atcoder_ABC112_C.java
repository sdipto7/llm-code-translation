
import java.util.*;
import java.io.*;

public class atcoder_ABC112_C {
    public static String solve(int n, int[][] ls_xyh) {
        Integer x0 = null, y0 = null, h0 = null;
        for (int i = 0; i < n; i++) {
            if (ls_xyh[i][2] > 0) {
                x0 = ls_xyh[i][0];
                y0 = ls_xyh[i][1];
                h0 = ls_xyh[i][2];
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
            int x = xyh[0], y = xyh[1], h = xyh[2];
            cands.removeIf(cand -> Math.max(cand[2] - Math.abs(cand[0] - x) - Math.abs(cand[1] - y), 0) != h);
        }
        int[] result = cands.get(0);
        return result[0] + " " + result[1] + " " + result[2];
    }

    public static int[] readIntArray(BufferedReader br) throws IOException {
        String[] ws = br.readLine().trim().split(" ");
        int[] res = new int[ws.length];
        for (int i = 0; i < ws.length; i++) {
            res[i] = Integer.parseInt(ws[i]);
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[][] ls_xyh = new int[n][3];
        for (int j = 0; j < n; j++) {
            ls_xyh[j] = readIntArray(br);
        }
        System.out.println(solve(n, ls_xyh));
    }
}

