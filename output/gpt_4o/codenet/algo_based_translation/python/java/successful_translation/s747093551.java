
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class s747093551 {

    public static String checkWarStatus(int N, int M, int X, int Y, List<Integer> x, List<Integer> y) {
        int maxX = Math.max(X, x.stream().max(Integer::compare).orElse(Integer.MIN_VALUE));
        int minY = Math.min(Y, y.stream().min(Integer::compare).orElse(Integer.MAX_VALUE));

        if (maxX < minY) {
            return "No War";
        } else {
            return "War";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        List<Integer> x = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            x.add(scanner.nextInt());
        }

        List<Integer> y = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            y.add(scanner.nextInt());
        }

        String result = checkWarStatus(N, M, X, Y, x, y);
        System.out.println(result);

        scanner.close();
    }
}

