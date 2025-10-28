
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC112_C {
    public static void main(String[] args) {
        System.out.println(solve(readQuestion()));
    }

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
                cands.add(new int[]{cx, cy, h0 + Math.abs(cx - x0) + Math.abs(cy - y0)});
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
                if (Math.max(ch - Math.abs(cx - x) - Math.abs(cy - y), 0) == h) {
                    newCands.add(cand);
                }
            }
            cands = newCands;
        }
        int[] result = cands.get(0);
        return result[0] + " " + result[1] + " " + result[2];
    }

    public static Tuple<Integer, List<List<Integer>>> readQuestion() {
        Scanner scanner = new Scanner(System.in);
        String[] ws = scanner.nextLine().strip().split(" ");
        int n = Integer.parseInt(ws[0]);
        List<List<Integer>> ls_xyh = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            String[] line = scanner.nextLine().strip().split(" ");
            List<Integer> point = new ArrayList<>();
            for (String num : line) {
                point.add(Integer.parseInt(num));
            }
            ls_xyh.add(point);
        }
        return new Tuple<>(n, ls_xyh);
    }

    static class Tuple<X, Y> {
        public final X x;
        public final Y y;

        public Tuple(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}

