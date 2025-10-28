
import java.util.Scanner;

public class codeforces_544_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int maxAllowed = Math.max(n * n / 2, n * n - (n * n / 2));
        
        if (k <= maxAllowed) {
            System.out.println("YES");
            int x = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i % 2 == j % 2 && x < k) {
                        System.out.print('L');
                        x++;
                    } else {
                        System.out.print('S');
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}

