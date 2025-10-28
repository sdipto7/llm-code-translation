
import java.util.*;

public class atcoder_ABC167_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        List<Integer> L = new ArrayList<>();
        L.add(-1); // Insert -1 at the start of the list
        
        for (int i = 0; i < N; i++) {
            L.add(scanner.nextInt());
        }
        
        System.out.println(findKthElementInPath(N, K, L));
        scanner.close();
    }

    public static int findKthElementInPath(int N, int K, List<Integer> L) {
        List<Integer> path = new ArrayList<>();
        path.add(1);
        int ind = 0, x = 1, t = -1;
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
                return path.get(K);
            } else {
                K = K - path.size();
                K = K % loop.size();
                return loop.get(K);
            }
        } else {
            return path.get(K - 1);
        }
    }
}

