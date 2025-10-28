
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_AGC006_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        scanner.close();

        if (X == 1 || X == 2 * N - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            List<Integer> xs;
            if (X == 2 * N - 2) {
                xs = new ArrayList<>();
                for (int i = N - 1; i <= 2 * N - 1; i++) {
                    xs.add(i);
                }
                for (int i = 1; i <= N - 2; i++) {
                    xs.add(i);
                }
            } else {
                List<Integer> ys = new ArrayList<>();
                for (int i = 1; i <= X - 2; i++) {
                    ys.add(i);
                }
                for (int i = X + 3; i <= 2 * N - 1; i++) {
                    ys.add(i);
                }
                xs = new ArrayList<>();
                int firstPartSize = Math.min(N - 3, ys.size());
                xs.addAll(ys.subList(0, firstPartSize));
                xs.add(X + 2);
                xs.add(X - 1);
                xs.add(X);
                xs.add(X + 1);
                xs.addAll(ys.subList(firstPartSize, ys.size()));
            }

