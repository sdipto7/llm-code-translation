
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class atcoder_AGC006_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        scanner.close();

        if (X == 1 || X == N * 2 - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            List<Integer> xs = new ArrayList<>();
            if (X == N * 2 - 2) {
                for (int i = N - 1; i <= X + 1; i++) {
                    xs.add(i);
                }
                for (int i = 1; i < N - 1; i++) {
                    xs.add(i);
                }
            } else {
                List<Integer> ys = new ArrayList<>();
                for (int i = 1; i < X; i++) {
                    ys.add(i);
                }
                for (int i = X + 3; i < N * 2; i++) {
                    ys.add(i);
                }
                xs.addAll(ys.subList(0, N - 3));
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
        return sub(x).get(0);
    }

    public static List<Integer> sub(List<Integer> y, int debug) {
        while (y.size() > 1) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < y.size() - 2; i++) {
                List<Integer> sublist = y.subList(i, i + 3);
                Collections.sort(sublist);
                temp.add(sublist.get(1));
            }
            y = temp;
            if (debug == 1) {
                System.out.print("D ");
                for (int val : y) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }
        return y;
    }
}

