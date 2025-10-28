
import java.util.*;

public class s957164965 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int X = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        String[] pStr = scanner.nextLine().split(" ");
        int[] p = new int[N];
        for (int i = 0; i < N; i++) {
            p[i] = Integer.parseInt(pStr[i]);
        }
        Arrays.sort(p);
        Map<Integer, List<Integer>> candidates = new TreeMap<>();
        for (int i = -1; i <= 102; i++) {
            boolean found = false;
            for (int j : p) {
                if (i == j) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                int diff = Math.abs(X - i);
                candidates.computeIfAbsent(diff, k -> new ArrayList<>()).add(i);
            }
        }
        int smallest = candidates.keySet().iterator().next();
        List<Integer> list = candidates.get(smallest);
        System.out.println(Collections.min(list));
    }
}

