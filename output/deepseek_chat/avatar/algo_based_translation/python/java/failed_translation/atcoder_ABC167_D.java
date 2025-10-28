
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class atcoder_ABC167_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        
        List<Integer> L = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            L.add(scanner.nextInt());
        }
        L.add(0, -1);
        
        List<Integer> path = new ArrayList<>();
        path.add(1);
        int ind = 0;
        int x = 1;
        int t = -1;
        boolean flag = false;
        Map<Integer, Integer> hash = new HashMap<>();
        
        for (int i = 0; i <= N; i++) {
            int ne = L.get(x);
            if (hash.containsKey(ne)) {
                flag = true;
                t = hash.get(ne);
                break;
            }
            path.add(ne);
            ind++;
            hash.put(ne, ind);
            x = ne;
        }
        
        if (flag) {
            List<Integer> loop = path.subList(t, path.size());
            if (K < path.size()) {
                System.out.println(path.get(K));
            } else {
                K = K - path.size();
                K = K % loop.size();
                System.out.println(loop.get(K));
            }
        } else {
            System.out.println(path.get(K - 1));
        }
    }
}

