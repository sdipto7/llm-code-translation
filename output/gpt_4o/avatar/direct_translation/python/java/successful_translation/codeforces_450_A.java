
import java.util.*;

public class codeforces_450_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] l = new int[n];
        
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        
        int[] l2 = new int[n];
        for (int i = 0; i < n; i++) {
            if (l[i] % m == 0) {
                l2[i] = l[i] / m;
            } else {
                l2[i] = l[i] / m + 1;
            }
        }
        
        int mx = l2[0];
        for (int i = 1; i < n; i++) {
            if (l2[i] > mx) {
                mx = l2[i];
            }
        }
        
        int ind = 0;
        for (int i = 0; i < n; i++) {
            if (l2[i] == mx) {
                ind = i;
            }
        }
        
        System.out.println(ind + 1);
    }
}

