
import java.util.Scanner;

public class codeforces_92_A {

    public static int distributeCandies(int n, int m) {
        int i = 1;
        while (m >= i) {
            m -= i;
            i = (i % n) + 1;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        
        int remainingCandies = distributeCandies(n, m);
        System.out.println(remainingCandies);
    }
}

