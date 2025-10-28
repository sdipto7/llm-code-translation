
import java.util.Scanner;

public class codeforces_622_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = 1;
        int r = n;
        
        while (l < r) {
            int mid = l + (r - l) / 2;
            int idxcnt = mid * (mid + 1) / 2;
            if (idxcnt < n) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        
        l--;
        int idxcnt = l * (l + 1) / 2;
        int result = n - idxcnt;
        System.out.println(result);
    }
}

