
import java.util.*;
import java.util.stream.*;

public class atcoder_ABC128_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<List<Integer>> li = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int k = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                list.add(scanner.nextInt());
            }
            li.add(list);
        }
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = scanner.nextInt();
        }
        Set<Integer> q = li.stream().flatMap(List::stream).collect(Collectors.toSet());
        Set<Integer> r = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toSet());
        Set<Integer> v = new HashSet<>(r);
        v.removeAll(q);
        long ans = 0;
        List<Integer> qList = new ArrayList<>(q);
        int qSize = qList.size();
        for (int i = 0; i <= qSize; i++) {
            List<Set<Integer>> combinations = combinations(qList, i);
            for (Set<Integer> s : combinations) {
                boolean valid = true;
                for (int j = 0; j < m; j++) {
                    List<Integer> u = li.get(j);
                    int w = p[j];
                    Set<Integer> uSet = new HashSet<>(u);
                    uSet.retainAll(s);
                    if (uSet.size() % 2 != w) {
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

    private static List<Set<Integer>> combinations(List<Integer> list, int k) {
        List<Set<Integer>> result = new ArrayList<>();
        combinationsHelper(list, new HashSet<>(), k, 0, result);
        return result;
    }

    private static void combinationsHelper(List<Integer> list, Set<Integer> current, int k, int index, List<Set<Integer>> result) {
        if (current.size() == k) {
            result.add(new HashSet<>(current));
            return;
        }
        for (int i = index; i < list.size(); i++) {
            current.add(list.get(i));
            combinationsHelper(list, current, k, i + 1, result);
            current.remove(list.get(i));
        }
    }
}

