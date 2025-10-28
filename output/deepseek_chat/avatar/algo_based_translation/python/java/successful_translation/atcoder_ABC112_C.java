
import java.util.*;
import java.io.*;

public class atcoder_ABC112_C {
    public static String solve(int n, List<List<Integer>> ls_xyh) {
        Integer x0 = null;
        int y0 = 0;
        int h0 = 0;
        for (int i = 0; i < n; i++) {
            if (ls_xyh.get(i).get(2) > 0) {
                x0 = ls_xyh.get(i).get(0);
                y0 = ls_xyh.get(i).get(1);
                h0 = ls_xyh.get(i).get(2);
                break;
            }
        }
        List<int[]> cands = new ArrayList<>();
        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                int ch = h0 + Math.abs(cx - x0) + Math.abs(cy - y0);
                cands.add(new int[]{cx, cy, ch});
            }
        }
        for (List<Integer> point : ls_xyh) {
            int x = point.get(0);
            int y = point.get(1);
            int h = point.get(2);
            List<int[]> newCands = new ArrayList<>();
            for (int[] cand : cands) {
                int cx = cand[0];
                int cy = cand[1];
                int ch = cand[2];
                int calculated = Math.max(ch - Math.abs(cx - x) - Math.abs(cy - y), 0);
                if (calculated == h) {
                    newCands.add(cand);
                }
            }
            cands = newCands;
        }
        int[] result = cands.get(0);
        return result[0] + " " + result[1] + " " + result[2];
    }

    public static Object[] readQuestion() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ws = br.readLine().trim().split(" ");
        int n = Integer.parseInt(ws[0]);
        List<List<Integer>> ls_xyh = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            String[] parts = br.readLine().trim().split(" ");
            List<Integer> point = new ArrayList<>();
            for (String part : parts) {
                point.add(Integer.parseInt(part));
            }
            ls_xyh.add(point);
        }
        return new Object[]{n, ls_xyh};
    }

    public static void main(String[] args) throws IOException {
        Object[] result = readQuestion();
        int n = (Integer) result[0];
        @SuppressWarnings("unchecked")
        List<List<Integer>> ls_xyh = (List<List<Integer>>) result[1];
        System.out.println(solve(n, ls_xyh));
    }
}

