
import java.util.*;
import java.util.stream.Collectors;

public class s269975433 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Q = scanner.nextInt();

        List<List<Integer>> Q_groups = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            Q_groups.add(Arrays.stream(scanner.nextLine().split(" "))
                                .map(Integer::parseInt)
                                .collect(Collectors.toList()));
        }

        int max_score = 0;
        List<Integer> range = new ArrayList<>();
        for (int i = 1; i <= M; i++) {
            range.add(i);
        }

        List<List<Integer>> combinations = generateCombinationsWithReplacement(range, N);
        for (List<Integer> p : combinations) {
            int temp_score = 0;
            for (List<Integer> q : Q_groups) {
                if (p.get(q.get(1) - 1) - p.get(q.get(0) - 1) == q.get(2)) {
                    temp_score += q.get(3);
                }
            }
            max_score = Math.max(max_score, temp_score);
        }

        System.out.println(max_score);
    }

    private static List<List<Integer>> generateCombinationsWithReplacement(List<Integer> list, int k) {
        List<List<Integer>> result = new ArrayList<>();
        generateCombinationsWithReplacementHelper(list, k, 0, new ArrayList<>(), result);
        return result;
    }

    private static void generateCombinationsWithReplacementHelper(List<Integer> list, int k, int start, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < list.size(); i++) {
            current.add(list.get(i));
            generateCombinationsWithReplacementHelper(list, k, i, current, result);
            current.remove(current.size() - 1);
        }
    }
}

