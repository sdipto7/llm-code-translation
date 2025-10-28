
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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
                xs = new ArrayList<>(range(N - 1, X + 2));
                xs.addAll(range(1, N - 1));
            } else {
                List<Integer> ys = new ArrayList<>(range(1, X - 1));
                ys.addAll(range(X + 3, N * 2));
                xs = new ArrayList<>(ys.subList(0, N - 3));
                xs.addAll(Arrays.asList(X + 2, X - 1, X, X + 1));
                xs.addAll(ys.subList(N - 3, ys.size()));
            }
            for (int x : xs) {
                System.out.println(x);
            }
        }
    }

    static List<Integer> range(int start, int end) {
        List<Integer> result = new ArrayList<>();
        for (int i = start; i < end; i++) {
            result.add(i);
        }
        return result;
    }

    static int calc(List<Integer> x) {
        return sub(x);
    }

    static int sub(List<Integer> y) {
        while (y.size() > 1) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < y.size() - 2; i++) {
                List<Integer> subList = y.subList(i, i + 3);
                Collections.sort(subList);
                temp.add(subList.get(1));
            }
            y = temp;
        }
        return y.get(0);
    }
}

