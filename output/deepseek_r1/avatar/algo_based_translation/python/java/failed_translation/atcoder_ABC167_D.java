
import java.util.*;

public class atcoder_ABC167_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.nextLine();
        
        List<Integer> L = new ArrayList<>();
        L.add(-1);
        String[] elements = scanner.nextLine().split(" ");
        for (String element : elements) {
            L.add(Integer.parseInt(element));
        }
        
        List<Integer> path = new ArrayList<>();
        path.add(1);
        Map<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, 0);
        int ind = 0;
        int x = 1;
        int t = -1;
        boolean flag = false;
        
        for (int i = 0; i <= N; i++) {
            int ne = L.get(x);
            if (hashMap.containsKey(ne)) {
                flag = true;
                t = hashMap.get(ne);
                break;
            }
            path.add(ne);
            ind++;
            hashMap.put(ne, ind);
            x = ne;
        }
        
        if (flag) {
            List<Integer> loop = new ArrayList<>(path.subList(t, path.size()));
            if (K < path.size()) {
                System.out.println(path.get(K));
            } else {
                K -= path.size();
                K %= loop.size();
                System.out.println(loop.get(K));
            }
        } else {
            System.out.println(path.get(K - 1));
        }
    }
}

