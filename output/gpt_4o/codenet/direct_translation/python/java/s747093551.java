
import java.util.Scanner;
import java.util.Arrays;

public class s747093551 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int[] x = new int[N];
        int[] y = new int[M];
        for (int i = 0; i < N; i++) {
            x[i] = scanner.nextInt();
        }
        for (int i = 0; i < M; i++) {
            y[i] = scanner.nextInt();
        }
        int max_x = Arrays.stream(x).max().getAsInt();
        int min_y = Arrays.stream(y).min().getAsInt();
        System.out.println(Math.max(max_x, X) < Math.min(min_y, Y) ? "No War" : "War");
    }
}

