
import java.util.*;
import java.util.stream.*;
import java.io.*;

public class atcoder_ABC112_C {
    public static String solve(int n, List<int[]> lsXyH) {
        int x0 = 0, y0 = 0, h0 = 0;
        for (int i = 0; i < n; i++) {
            if (lsXyH.get(i)[2] > 0) {
                x0 = lsXyH.get(i)[0];
                y0 = lsXyH.get(i)[1];
                h0 = lsXyH.get(i)[2];
                break;
            }
        }
        List<int[]> cands = new ArrayList<>();
        for (int cx = 0; cx <= 100; cx++) {
            for (int cy = 0; cy <= 100; cy++) {
                cands.add(new int[]{cx, cy, h0 + Math.abs(cx - x0) + Math.abs(cy - y0)});
            }
        }
        for (int[] xyh : lsXyH) {
            cands = cands.stream()
                    .filter(cand -> Math.max(cand[2] - Math.abs(cand[0] - xyh[0]) - Math.abs(cand[1] - xyh[1]), 0) == xyh[2])
                    .collect(Collectors.toList());
        }
        int[] result = cands.get(0);
        return result[0] + " " + result[1] + " " + result[2];
    }

    public static Object[] readQuestion() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        List<int[]> lsXyH = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            String[] parts = br.readLine().trim().split(" ");
            int[] arr = new int[3];
            arr[0] = Integer.parseInt(parts[0]);
            arr[1] = Integer.parseInt(parts[1]);
            arr[2] = Integer.parseInt(parts[2]);
            lsXyH.add(arr);
        }
        return new Object[]{n, lsXyH};
    }

    public static void main(String[] args) throws IOException {
        Object[] input = readQuestion();
        int n = (int) input[0];
        List<int[]> lsXyH = (List<int[]>) input[1];
        System.out.println(solve(n, lsXyH));
    }
}

