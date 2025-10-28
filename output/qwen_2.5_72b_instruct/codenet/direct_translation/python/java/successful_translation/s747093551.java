import java.util.Scanner;
public class s747093551 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int[] x = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = scanner.nextInt();
        }
        int[] y = new int[M];
        for (int i = 0; i < M; i++) {
            y[i] = scanner.nextInt();
        }
        int maxX = x[0];
        for (int i = 1; i < N; i++) {
            if (x[i] > maxX) {
                maxX = x[i];
            }
        }
        int minY = y[0];
        for (int i = 1; i < M; i++) {
            if (y[i] < minY) {
                minY = y[i];
            }
        }
        System.out.println((maxX < minY && X < minY && maxX < Y) ? "No War" : "War");
        scanner.close();
    }
}
