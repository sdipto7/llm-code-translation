
import java.util.Scanner;

public class codeforces_544_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int maxL = (n * n + 1) / 2;
        if (k > maxL) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            int x = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((i % 2 == j % 2) && x < k) {
                        System.out.print('L');
                        x++;
                    } else {
                        System.out.print('S');
                    }
                }
                System.out.println();
            }
        }
    }
}

