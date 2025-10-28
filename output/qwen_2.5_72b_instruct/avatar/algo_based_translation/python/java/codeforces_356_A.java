import java.util.Scanner;
import java.util.Arrays;

public class codeforces_356_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] out = new int[n];
        int[] comp = new int[n];
        
        for (int i = 0; i < n; i++) {
            comp[i] = i + 2;
        }
        
        for (int i = 0; i < m; i++) {
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            int x = scanner.nextInt();
            int t = l;
            
            while (t <= r) {
                int next_val = comp[t - 1];
                if (out[t - 1] == 0 && t != x) {
                    out[t - 1] = x;
                }
                if (t >= x) {
                    comp[t - 1] = r + 1;
                } else {
                    comp[t - 1] = x;
                }
                t = next_val;
            }
        }
        
        System.out.println(Arrays.toString(out).replaceAll("[\\[\\],]", ""));
        scanner.close();
    }
}
