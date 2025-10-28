
import java.util.*;
import java.util.stream.*;

class BIT {
    private int size;
    private int[] tree;
    
    public BIT(int N) {
        this.size = N;
        this.tree = new int[N + 1];
    }
    
    private int _bitsum(int i) {
        int ret = 0;
        while (i > 0) {
            ret += tree[i];
            i ^= i & -i;
        }
        return ret;
    }
    
    public int bitsum(int l) {
        return _bitsum(l);
    }
    
    public int bitsum(int l, int r) {
        return _bitsum(r) - _bitsum(l);
    }
    
    public void bitadd(int i, int x) {
        i++;
        while (i <= size) {
            tree[i] += x;
            i += i & -i;
        }
    }
}

public class atcoder_ABC107_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = n * (n + 1) / 4;
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        Set<Integer> set = new TreeSet<>();
        set.add(0);
        for (int num : a) {
            set.add(num);
        }
        List<Integer> _a = new ArrayList<>(set);
        
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 0; i < _a.size(); i++) {
            d.put(_a.get(i), i);
        }
        
        int[] mappedA = new int[n];
        for (int i = 0; i < n; i++) {
            mappedA[i] = d.get(a[i]);
        }
        
        java.util.function.Function<Integer, Boolean> check = (X) -> {
            int[] b = new int[n + 1];
            b[0] = 0;
            for (int i = 0; i < n; i++) {
                b[i + 1] = (mappedA[i] >= X ? 1 : -1);
            }
            
            for (int i = 0; i < n; i++) {
                b[i + 1] += b[i];
            }
            
            int c = Arrays.stream(b).min().getAsInt();
            for (int i = 0; i < b.length; i++) {
                b[i] -= c;
            }
            
            int maxVal = Arrays.stream(b).max().getAsInt();
            BIT bit = new BIT(maxVal + 2);
            long ans = 0;
            
            for (int x : b) {
                ans += bit.bitsum(x + 1);
                bit.bitadd(x, 1);
            }
            
            return ans >= m;
        };
        
        int[] t = new int[]{_a.size(), 0};
        while (t[0] - t[1] > 1) {
            int mid = (t[0] + t[1]) / 2;
            if (check.apply(mid)) {
                t[0] = mid;
            } else {
                t[1] = mid;
            }
        }
        
        System.out.println(_a.get(t[1]));
    }
}

