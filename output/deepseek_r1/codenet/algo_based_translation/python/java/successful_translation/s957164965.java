
import java.util.*;

public class s957164965 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int N = scanner.nextInt();
        int[] p = new int[N];
        for (int i = 0; i < N; i++) {
            p[i] = scanner.nextInt();
        }
        Arrays.sort(p);
        HashMap<Integer, ArrayList<Integer>> candidates = new HashMap<>();
        for (int i = -1; i <= 101; i++) {
            if (Arrays.binarySearch(p, i) >= 0) continue;
            int diff = Math.abs(X - i);
            if (!candidates.containsKey(diff)) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                candidates.put(diff, list);
            } else {
                candidates.get(diff).add(i);
            }
        }
        int smallest = Collections.min(candidates.keySet());
        int minNum = Collections.min(candidates.get(smallest));
        System.out.println(minNum);
    }
}

