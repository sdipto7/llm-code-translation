
import java.util.*;

public class s957164965 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int X = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);
        String[] nums = scanner.nextLine().split(" ");
        int[] p = new int[N];
        for (int i = 0; i < N; i++) {
            p[i] = Integer.parseInt(nums[i]);
        }
        Arrays.sort(p);
        Map<Integer, List<Integer>> candidates = new HashMap<>();
        for (int i = -1; i <= 101; i++) {
            if (Arrays.binarySearch(p, i) >= 0) {
                continue;
            }
            int diff = Math.abs(X - i);
            if (!candidates.containsKey(diff)) {
                candidates.put(diff, new ArrayList<>(Arrays.asList(i)));
            } else {
                candidates.get(diff).add(i);
            }
        }
        int smallest = Collections.min(candidates.keySet());
        int minNum = Collections.min(candidates.get(smallest));
        System.out.println(minNum);
    }
}

