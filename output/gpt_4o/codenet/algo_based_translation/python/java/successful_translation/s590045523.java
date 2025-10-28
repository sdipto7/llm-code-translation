
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class s590045523 {

    public static int countValidTriangles(int N, List<Integer> L) {
        int ans = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int a = L.get(i);
                    int b = L.get(j);
                    int c = L.get(k);
                    if (a == b || b == c || c == a) {
                        continue;
                    }
                    if (a + b > c && b + c > a && c + a > b) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> L = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            L.add(scanner.nextInt());
        }
        scanner.close();
        
        int result = countValidTriangles(N, L);
        System.out.println(result);
    }
}

