
import java.util.Scanner;
import java.util.Arrays;

public class s747093551 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int[] x = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
        }
        int[] y = new int[M];
        for (int i = 0; i < M; i++) {
            y[i] = sc.nextInt();
        }
        int maxX = Arrays.stream(x).max().getAsInt();
        int minY = Arrays.stream(y).min().getAsInt();
        System.out.println(Math.max(maxX, X) < Math.min(minY, Y) ? "No War" : "War");
    }
}

