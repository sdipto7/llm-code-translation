
import java.util.Scanner;

public class s827462150 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        int x = 1;

        while (true) {
            int sumX = x * x + 1 + 1 + x * 1 + 1 * 1 + x * 1;
            if (sumX > n) break;

            int y = 1;
            while (true) {
                int sumY = x * x + y * y + 1 + x * y + y * 1 + x * 1;
                if (sumY > n) break;

                int z = 1;
                while (true) {
                    int sumZ = x * x + y * y + z * z + x * y + y * z + z * x;
                    if (sumZ > n) break;
                    A[sumZ - 1]++;
                    z++;
                }
                y++;
            }
            x++;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(A[i]);
        }
    }
}

