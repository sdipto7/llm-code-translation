
import java.util.Scanner;

public class atcoder_ABC112_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ws = scanner.nextLine().trim().split(" ");
        int n = Integer.parseInt(ws[0]);
        int[][] ls_xyh = new int[n][3];
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().trim().split(" ");
            for (int j = 0; j < 3; j++) {
                ls_xyh[i][j] = Integer.parseInt(line[j]);
            }
        }
        System.out.println(solve(n, ls_xyh));
    }

    public static String solve(int n, int[][] ls_xyh) {
        Integer[] x0 = findFirstPositiveHeight(ls_xyh);
        int[][] cands = generateCandidates(x0[0], x0[1], x0[2]);
        cands = filterCandidates(cands, ls_xyh);
        return cands[0][0] + " " + cands[0][1] + " " + cands[0][2];
    }

    private static Integer[] findFirstPositiveHeight(int[][] ls_xyh) {
        for (int i = 0; i < ls_xyh.length; i++) {
            if (ls_xyh[i][2] > 0) {
                return new Integer[]{ls_xyh[i][0], ls_xyh[i][1], ls_xyh[i][2]};
            }
        }
        return null;
    }

    private static int[][] generateCandidates(int x0, int y0, int h0) {
        int[][] cands = new int[101 * 101][3];
        int index = 0;
        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                int ch = h0 + Math.abs(cx - x0) + Math.abs(cy - y0);
                cands[index][0] = cx;
                cands[index][1] = cy;
                cands[index][2] = ch;
                index++;
            }
        }
        return cands;
    }

    private static int[][] filterCandidates(int[][] cands, int[][] ls_xyh) {
        for (int[] xyh : ls_xyh) {
            int x = xyh[0];
            int y = xyh[1];
            int h = xyh[2];
            int count = 0;
            for (int i = 0; i < cands.length; i++) {
                int cx = cands[i][0];
                int cy = cands[i][1];
                int ch = cands[i][2];
                int calcH = Math.max(ch - Math.abs(cx - x) - Math.abs(cy - y), 0);
                if (calcH == h) {
                    cands[count][0] = cx;
                    cands[count][1] = cy;
                    cands[count][2] = ch;
                    count++;
                }
            }
            int[][] newCands = new int[count][3];
            System.arraycopy(cands, 0, newCands, 0, count);
            cands = newCands;
        }
        return cands;
    }
}

