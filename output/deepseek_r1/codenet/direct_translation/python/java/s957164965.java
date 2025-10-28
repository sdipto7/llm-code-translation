
import java.util.*;

public class s957164965 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int N = scanner.nextInt();
        List<Integer> pList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            pList.add(scanner.nextInt());
        }
        Set<Integer> pSet = new HashSet<>(pList);
        Map<Integer, List<Integer>> candidates = new HashMap<>();

        for (int i = -1; i <= 101; i++) {
            if (pSet.contains(i)) continue;
            int diff = Math.abs(X - i);
            if (!candidates.containsKey(diff)) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                candidates.put(diff, list);
            } else {
                candidates.get(diff).add(i);
            }
        }

        int minDiff = Integer.MAX_VALUE;
        for (int key : candidates.keySet()) {
            if (key < minDiff) minDiff = key;
        }

        List<Integer> minList = candidates.get(minDiff);
        int minNum = Integer.MAX_VALUE;
        for (int num : minList) {
            if (num < minNum) minNum = num;
        }

        System.out.println(minNum);
    }
}

