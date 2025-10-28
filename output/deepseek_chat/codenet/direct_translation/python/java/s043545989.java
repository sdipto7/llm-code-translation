
import java.util.*;

public class s043545989 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        Map<Integer, Integer> B = new HashMap<>();
        for (int num : a) {
            B.put(num, B.getOrDefault(num, 0) + 1);
        }
        Set<Integer> k = B.keySet();
        List<Integer> v = new ArrayList<>(B.values());
        if (B.size() == 3) {
            Integer[] keys = k.toArray(new Integer[0]);
            if ((keys[0] ^ keys[1] ^ keys[2]) == 0 && v.get(0).equals(v.get(1)) && v.get(1).equals(v.get(2))) {
                System.out.println("Yes");
                return;
            }
        }
        if (B.size() == 2 && k.contains(0)) {
            int v1 = v.get(0);
            int v2 = v.get(1);
            if (v1 == 2 * v2 || v2 == 2 * v1) {
                System.out.println("Yes");
                return;
            }
        }
        if (B.size() == 1 && k.contains(0)) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }
}

