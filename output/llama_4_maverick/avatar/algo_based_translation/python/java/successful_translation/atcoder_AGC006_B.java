
import java.util.Scanner;

public class atcoder_AGC006_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        if (X == 1 || X == 2 * N - 1) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            if (X == 2 * N - 2) {
                for (int i = N - 1; i <= X + 1; i++) {
                    System.out.println(i);
                }
                for (int i = 1; i <= N - 2; i++) {
                    System.out.println(i);
                }
            } else {
                int[] ys = new int[2 * N - 3];
                int index = 0;
                for (int i = 1; i <= X - 2; i++) {
                    ys[index++] = i;
                }
                for (int i = X + 3; i <= 2 * N - 1; i++) {
                    ys[index++] = i;
                }
                for (int i = 0; i <= N - 4; i++) {
                    System.out.println(ys[i]);
                }
                System.out.println(X + 2);
                System.out.println(X - 1);
                System.out.println(X);
                System.out.println(X + 1);
                for (int i = N - 3; i < 2 * N - 3; i++) {
                    System.out.println(ys[i]);
                }
            }
        }
    }
}

