
import java.util.*;

public class atcoder_AGC006_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();

        if (X == 1 || X == 2 * N - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            List<Integer> xs;
            if (X == 2 * N - 2) {
                xs = new ArrayList<>();
                for (int i = N - 1; i <= X + 1; i++) xs.add(i);
                for (int i = 1; i <= N - 2; i++) xs.add(i);
            } else {
                List<Integer> ys = new ArrayList<>();
                for (int i = 1; i <= X - 2; i++) ys.add(i);
                for (int i = X + 3; i <= 2 * N - 1; i++) ys.add(i);
                
                int partASize = Math.max(0, N - 3);
                List<Integer> partA = ys.subList(0, partASize);
                List<Integer> partB = Arrays.asList(X + 2, X - 1, X, X + 1);
                List<Integer> partC = ys.subList(partASize, ys.size());
                
                xs = new ArrayList<>();
                xs.addAll(partA);
                xs.addAll(partB);
                xs.addAll(partC);
            }
            for (int num : xs) System.out.println(num);
        }
    }

    public static int calc(List<Integer> x) {
        List<Integer> result = sub(x);
        if (result.get(0) == 2) {
            sub(x, true);
            System.out.println("= " + x);
        }
        return result.get(0);
    }

    private static List<Integer> sub(List<Integer> y) {
        return sub(y, false);
    }

    private static List<Integer> sub(List<Integer> y, boolean debug) {
        List<Integer> current = new ArrayList<>(y);
        while (current.size() > 1) {
            List<Integer> next = new ArrayList<>();
            for (int i = 0; i < current.size() - 2; i++) {
                List<Integer> triplet = Arrays.asList(
                    current.get(i),
                    current.get(i + 1),
                    current.get(i + 2)
                );
                Collections.sort(triplet);
                next.add(triplet.get(1));
            }
            current = next;
            if (debug) {
                System.out.print("D ");
                for (int num : current) System.out.print(num + " ");
                System.out.println();
            }
        }
        return current;
    }
}

