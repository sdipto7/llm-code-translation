
import java.util.*;
import java.util.stream.*;

public class atcoder_AGC006_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        
        if (X == 1 || X == N * 2 - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            List<Integer> xs;
            if (X == N * 2 - 2) {
                xs = new ArrayList<>();
                for (int i = N - 1; i <= X + 1; i++) xs.add(i);
                for (int i = 1; i <= N - 2; i++) xs.add(i);
            } else {
                List<Integer> ys = new ArrayList<>();
                for (int i = 1; i <= X - 2; i++) ys.add(i);
                for (int i = X + 3; i <= N * 2 - 1; i++) ys.add(i);
                xs = new ArrayList<>(ys.subList(0, N - 3));
                xs.add(X + 2);
                xs.add(X - 1);
                xs.add(X);
                xs.add(X + 1);
                xs.addAll(ys.subList(N - 3, ys.size()));
            }
            for (int x : xs) {
                System.out.println(x);
            }
        }
    }
    
    public static int calc(List<Integer> x) {
        List<Integer> result = sub(x, 0);
        if (result.get(0) == 2) {
            sub(x, 1);
            System.out.print("=");
            System.out.println(x);
        }
        return result.get(0);
    }
    
    private static List<Integer> sub(List<Integer> y, int debug) {
        if (debug != 0) {
            System.out.print("D");
            System.out.println(y);
        }
        List<Integer> current = new ArrayList<>(y);
        while (current.size() > 1) {
            List<Integer> next = new ArrayList<>();
            for (int i = 0; i < current.size() - 2; i++) {
                List<Integer> triple = Arrays.asList(current.get(i), current.get(i + 1), current.get(i + 2));
                Collections.sort(triple);
                next.add(triple.get(1));
            }
            current = next;
            if (debug != 0) {
                System.out.print("D");
                System.out.println(current);
            }
        }
        return current;
    }
}

