
import java.util.*;

public class atcoder_ABC167_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        int[] elements = new int[N + 1];
        elements[0] = -1;
        for (int i = 1; i <= N; i++) {
            elements[i] = sc.nextInt();
        }
        List<Integer> path = new ArrayList<>();
        path.add(1);
        Map<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, 0);
        boolean flag = false;
        int t = -1;
        int x = 1;
        for (int i = 0; i <= N; i++) {
            int ne = elements[x];
            if (hashMap.containsKey(ne)) {
                t = hashMap.get(ne);
                flag = true;
                break;
            }
            path.add(ne);
            hashMap.put(ne, path.size() - 1);
            x = ne;
        }
        if (flag) {
            List<Integer> loop = new ArrayList<>(path.subList(t, path.size()));
            if (K < path.size()) {
                System.out.println(path.get((int) K));
            } else {
                K -= path.size();
                K %= loop.size();
                System.out.println(loop.get((int) K));
            }
        } else {
            System.out.println(path.get((int) K - 1));
        }
    }
}

