
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Candidate {
    int x, y, h;

    Candidate(int x, int y, int h) {
        this.x = x;
        this.y = y;
        this.h = h;
    }
}

public class atcoder_ABC112_C {
    public static String solve(int n, List<List<Integer>> ls_xyh) {
        int x0 = 0;
        for (int i = 0; i < n; i++) {
            if (ls_xyh.get(i).get(2) > 0) {
                x0 = ls_xyh.get(i).get(0);
                break;
            }
        }
        List<Candidate> cands = new ArrayList<>();
        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                int h0 = ls_xyh.get(i).get(2);
                int y0 = ls_xyh.get(i).get(1);
                cands.add(new Candidate(cx, cy, h0 + Math.abs(cx - x0) + Math.abs(cy - y0)));
            }
        }
        for (List<Integer> point : ls_xyh) {
            int x = point.get(0);
            int y = point.get(1);
            int h = point.get(2);
            List<Candidate> newCands = new ArrayList<>();
            for (Candidate cand : cands) {
                int ch = cand.h;
                if (Math.max(ch - Math.abs(cand.x - x) - Math.abs(cand.y - y), 0) == h) {
                    newCands.add(cand);
                }
            }
            cands = newCands;
        }
        Candidate result = cands.get(0);
        return result.x + " " + result.y + " " + result.h;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<List<Integer>> ls_xyh = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            List<Integer> point = new ArrayList<>();
            for (int k = 0; k < 3; k++) {
                point.add(scanner.nextInt());
            }
            ls_xyh.add(point);
        }
        System.out.println(solve(n, ls_xyh));
    }
}

