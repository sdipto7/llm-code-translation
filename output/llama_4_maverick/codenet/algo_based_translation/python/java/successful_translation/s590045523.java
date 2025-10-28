
import java.util.Scanner;

public class s590045523 {
    public static int countValidTriangles(int N, int[] L) {
        int ans = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int a = L[i];
                    int b = L[j];
                    int c = L[k];
                    if (a == b || b == c || c == a) {
                        continue;
                    }
                    if (a + b > c && b + c > a && c + a > b) {
                        ans += 1;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] L = new int[N];
        for (int i = 0; i < N; i++) {
            L[i] = scanner.nextInt();
        }
        System.out.println(countValidTriangles(N, L));
        scanner.close();
    }
}

