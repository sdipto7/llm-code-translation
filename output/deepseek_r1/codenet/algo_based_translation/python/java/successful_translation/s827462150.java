
import java.util.Scanner;

public class s827462150 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        int x = 1;

        while (x*x + 1 + 1 + x*1 + 1*1 + x*1 <= n) {
            int y = 1;
            while (x*x + y*y + 1 + x*y + y*1 + x*1 <= n) {
                int z = 1;
                while (x*x + y*y + z*z + x*y + y*z + z*x <= n) {
                    int i = x*x + y*y + z*z + x*y + y*z + z*x;
                    A[i-1]++;
                    z++;
                }
                y++;
            }
            x++;
        }

        for (int val : A) {
            System.out.println(val);
        }
    }
}

