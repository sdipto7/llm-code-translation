
import java.util.Scanner;

public class s827462150 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        int x = 1, y = 1, z = 1;
        while (x*x + y*y + z*z + x*y + y*z + z*x <= n) {
            y = 1;
            z = 1;
            while (x*x + y*y + z*z + x*y + y*z + z*x <= n) {
                z = 1;
                while (x*x + y*y + z*z + x*y + y*z + z*x <= n) {
                    int i = x*x + y*y + z*z + x*y + y*z + z*x;
                    if (i <= n) {
                        A[i-1]++;
                    }
                    z++;
                }
                y++;
            }
            x++;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(A[i]);
        }
        scanner.close();
    }
}

