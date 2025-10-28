
import java.util.Scanner;
import java.util.HashMap;

public class s534639230 {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int[] D = new int[N];
        for (int i = 0; i < N; i++) {
            D[i] = scanner.nextInt();
        }
        
        final int mod = 998244353;
        
        if (D[0] != 0) {
            System.out.println(0);
            return;
        }
        
        HashMap<Integer, Integer> cnt = new HashMap<>();
        for (int d : D) {
            cnt.put(d, cnt.getOrDefault(d, 0) + 1);
        }
        
        if (cnt.getOrDefault(0, 0) > 1) {
            System.out.println(0);
            return;
        }
        
        long res = 1;
        
        for (int i = 1; i <= getMax(D); i++) {
            if (cnt.getOrDefault(i - 1, 0) == 1) {
                continue;
            }
            res *= Math.pow(cnt.getOrDefault(i - 1, 0), cnt.getOrDefault(i, 0)) % mod;
            res %= mod;
        }
        
        System.out.println(res);
    }
    
    private static int getMax(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}

