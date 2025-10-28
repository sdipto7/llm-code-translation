
import java.util.*;

public class s957164965 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int[] p = new int[N];
        for (int i = 0; i < N; i++) {
            p[i] = sc.nextInt();
        }
        Arrays.sort(p);
        Map<Integer, List<Integer>> candidates = new HashMap<>();
        for (int i = -1; i <= 101; i++) {
            boolean contains = false;
            for (int num : p) {
                if (num == i) {
                    contains = true;
                    break;
                }
            }
            if (contains) continue;
            int diff = Math.abs(X - i);
            if (!candidates.containsKey(diff)) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                candidates.put(diff, list);
            } else {
                candidates.get(diff).add(i);
            }
        }
        int smallest = Collections.min(candidates.keySet());
        List<Integer> list = candidates.get(smallest);
        int minNum = Collections.min(list);
        System.out.println(minNum);
    }
}

