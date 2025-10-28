
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class atcoder_ABC112_C {
    public static void main(String[] args) {
        Object[] input = readQuestion();
        int n = (Integer) input[0];
        List<int[]> lsXYH = (List<int[]>) input[1];
        System.out.println(solve(n, lsXYH));
    }

    private static String solve(int n, List<int[]> lsXYH) {
        int x0 = 0, y0 = 0, h0 = 0;
        for (int[] point : lsXYH) {
            if (point[2] > 0) {
                x0 = point[0];
                y0 = point[1];
                h0 = point[2];
                break;
            }
        }

        List<int[]> cands = new ArrayList<>();
        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                cands.add(new int[]{cx, cy, h0 + Math.abs(cx - x0) + Math.abs(cy - y0)});
            }
        }

        for (int[] point : lsXYH) {
            List<int[]> filtered = new ArrayList<>();
            for (int[] cand : cands) {
                int calcH = Math.max(cand[2] - Math.abs(cand[0] - point[0]) - Math.abs(cand[1] - point[1]), 0);
                if (calcH == point[2]) {
                    filtered.add(cand);
                }
            }
            cands = filtered;
        }

        return String.format("%d %d %d", cands.get(0)[0], cands.get(0)[1], cands.get(0)[2]);
    }

    private static Object[] readQuestion() {
        Scanner scanner = new Scanner(System.in);
        String[] firstLine = scanner.nextLine().trim().split("\\s+");
        int n = Integer.parseInt(firstLine[0]);
        List<int[]> lsXYH = new ArrayList<>();

        for (int j = 0; j < n; j++) {
            String[] parts = scanner.nextLine().trim().split("\\s+");
            lsXYH.add(new int[]{
                Integer.parseInt(parts[0]),
                Integer.parseInt(parts[1]),
                Integer.parseInt(parts[2])
            });
        }
        scanner.close();
        return new Object[]{n, lsXYH};
    }
}

