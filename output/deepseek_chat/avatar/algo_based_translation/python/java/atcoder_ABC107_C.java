
import java.util.*;

public class atcoder_ABC107_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            lst.add(scanner.nextInt());
        }
        
        List<Integer> lst_p = new ArrayList<>();
        List<Integer> lst_m = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            int num = lst.get(i);
            if (num == 0) {
                K--;
            }
            if (num > 0) {
                lst_p.add(num);
            } else if (num < 0) {
                lst_m.add(num);
            }
        }
        
        Collections.sort(lst_p);
        Collections.sort(lst_m);
        
        int lastx = lst_p.size();
        int lasty = lst_m.size();
        
        System.out.println(check(K, lst_p, lst_m, lastx, lasty));
    }
    
    public static int check(int k, List<Integer> lst_p, List<Integer> lst_m, int lastx, int lasty) {
        int ans = (int)1e9;
        
        for (int j = 0; j <= k; j++) {
            if (j > lastx || (k - j) > lasty) {
                continue;
            }
            
            int p;
            if (j == 0) {
                p = 0;
            } else {
                p = lst_p.get(j - 1);
            }
            
            int m;
            if ((k - j) == 0) {
                m = 0;
            } else {
                m = lst_m.get(lasty - (k - j));
            }
            
            ans = Math.min(ans, Math.min(2 * p + Math.abs(m), p + 2 * Math.abs(m)));
        }
        
        return ans;
    }
}

