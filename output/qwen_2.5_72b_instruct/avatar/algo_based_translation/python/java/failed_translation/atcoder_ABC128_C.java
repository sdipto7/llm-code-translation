
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class atcoder_ABC128_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<List<Integer>> li = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> row = Arrays.stream(scanner.nextLine().split(" "))
                                     .skip(1)
                                     .map(Integer::parseInt)
                                     .collect(Collectors.toList());
            li.add(row);
        }
        scanner.nextLine(); // Consume leftover newline
        Tuple p = new Tuple(Arrays.stream(scanner.nextLine().split(" "))
                                  .map(Integer::parseInt)
                                  .toArray());
        Set<Integer> q = li.stream()
                           .flatMap(List::stream)
                           .collect(Collectors.toSet());
        Set<Integer> r = IntStream.rangeClosed(1, n)
                                  .boxed()
                                  .collect(Collectors.toSet());
        Set<Integer> v = new HashSet<>(r);
        v.removeAll(q);
        int ans = 0;
        for (int i = 0; i <= q.size(); i++) {
            for (Set<Integer> s : combinations(q, i)) {
                boolean valid = true;
                for (int j = 0; j < li.size(); j++) {
                    List<Integer> u = li.get(j);
                    int w = p.get(j);
                    long intersectionSize = s.stream()
                                              .filter(u::contains)
                                              .count();
                    if (intersectionSize % 2 != w) {
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    ans += Math.pow(2, v.size());
                }
            }
        }
        System.out.println(ans);
    }

    private static List<Set<Integer>> combinations(Set<Integer> set, int k) {
        List<Set<Integer>> result = new ArrayList<>();
        combinationsHelper(new ArrayList<>(set), k, 0, new HashSet<>(), result);
        return result;
    }

    private static void combinationsHelper(List<Integer> elements, int k, int start, Set<Integer> current, List<Set<Integer>> result) {
        if (current.size() == k) {
            result.add(new HashSet<>(current));
            return;
        }
        for (int i = start; i < elements.size(); i++) {
            current.add(elements.get(i));
            combinationsHelper(elements, k, i + 1, current, result);
            current.remove(elements.get(i));
        }
    }

    static class Tuple {
        private final int[] values;

        public Tuple(int[] values) {
            this.values = values;
        }

        public int get(int index) {
            return values[index];
        }
    }
}

