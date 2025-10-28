
import java.util.*;

public class atcoder_AGC006_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        if (X == 1 || X == N * 2 - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            int[] xs;
            if (X == N * 2 - 2) {
                xs = new int[N * 2 - 1];
                for (int i = 0; i < N - 1; i++) xs[i] = N - 1 + i;
                for (int i = 0; i < N - 1; i++) xs[N - 1 + i] = i + 1;
            } else {
                List<Integer> ys = new ArrayList<>();
                for (int i = 1; i < X - 1; i++) ys.add(i);
                for (int i = X + 3; i < N * 2; i++) ys.add(i);
                xs = new int[N * 2 - 1];
                for (int i = 0; i < N - 3; i++) xs[i] = ys.get(i);
                xs[N - 3] = X + 2;
                xs[N - 2] = X - 1;
                xs[N - 1] = X;
                xs[N] = X + 1;
                for (int i = N + 1; i < N * 2 - 1; i++) xs[i] = ys.get(i - (N + 1));
            }
            for (int x : xs) System.out.println(x);
        }
    }

    private static List<Integer> sub(List<Integer> y, boolean debug) {
        if (debug) System.out.println("D " + y);
        while (y.size() > 1) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < y.size() - 2; i++) {
                List<Integer> sublist = Arrays.asList(y.get(i), y.get(i + 1), y.get(i + 2));
                Collections.sort(sublist);
                temp.add(sublist.get(1));
            }
            y = temp;
            if (debug) System.out.println("D " + y);
        }
        return y;
    }

    private static int calc(List<Integer> x) {
        List<Integer> y = sub(x, false);
        if (y.get(0) == 2) {
            sub(x, true);
            System.out.println("= " + x);
        }
        return y.get(0);
    }
}

