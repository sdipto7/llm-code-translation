
import java.util.*;
import java.util.stream.Collectors;

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
        
        int mod = 998244353;
        
        if (D[0] != 0) {
            System.out.println(0);
            return;
        }
        
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int num : D) {
            cnt.put(num, cnt.getOrDefault(num, 0) + 1);
        }
        
        if (cnt.getOrDefault(0, 0) > 1) {
            System.out.println(0);
            return;
        }
        
        long res = 1;
        
        int maxD = Arrays.stream(D).max().getAsInt();
        for (int i = 1; i <= maxD; i++) {
            if (!cnt.containsKey(i - 1) || cnt.get(i - 1) == 0) {
                System.out.println(0);
                return;
            }
            if (cnt.get(i - 1) == 1) {
                continue;
            }
            int prevCount = cnt.get(i - 1);
            int currentCount = cnt.getOrDefault(i, 0);
            long power = 1;
            for (int j = 0; j < currentCount; j++) {
                power = (power * prevCount) % mod;
            }
            res = (res * power) % mod;
        }
        
        System.out.println(res);
    }
}

