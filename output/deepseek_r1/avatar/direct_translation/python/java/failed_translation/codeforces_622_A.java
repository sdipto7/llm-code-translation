
import java.util.Scanner;

public class codeforces_622_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long l = 1;
        long r = n;
        while (l < r) {
            long mid = l + (r - l) / 2;
            long idxcnt = mid * (mid + 1) / 2;
            if (idxcnt < n) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        l--;
        long idxcnt = l * (l + 1) / 2;
        System.out.println(n - idxcnt);
    }
}

