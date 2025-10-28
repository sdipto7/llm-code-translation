
import java.util.Arrays;
import java.util.Scanner;

public class s747093551 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[M];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < M; i++) {
            y[i] = sc.nextInt();
        }
        Arrays.sort(x);
        Arrays.sort(y);
        System.out.println(Math.max(x[x.length - 1], X) < Math.min(y[0], Y) ? "No War" : "War");
    }
}

