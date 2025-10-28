
import java.util.*;

public class atcoder_ABC128_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();

        List<List<Integer>> conditions = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String[] parts = scanner.nextLine().split(" ");
            List<Integer> condition = new ArrayList<>();
            for (int j = 1; j < parts.length; j++) {
                condition.add(Integer.parseInt(parts[j]));
            }
            conditions.add(condition);
        }

        String[] parityParts = scanner.nextLine().split(" ");
        List<Integer> parities = new ArrayList<>();
        for (String part : parityParts) {
            parities.add(Integer.parseInt(part));
        }

        Set<Integer> q = new HashSet<>();
        for (List<Integer> condition : conditions) {
            q.addAll(condition);
        }

        Set<Integer> r = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            r.add(i);
        }

        Set<Integer> v = new HashSet<>(r);
        v.removeAll(q);

        int ans = 0;
        List<Integer> qList = new ArrayList<>(q);

        for (int subsetSize = 0; subsetSize <= qList.size(); subsetSize++) {
            List<List<Integer>> subsets = generateCombinations(qList, subsetSize);
            for (List<Integer> subset : subsets) {
                Set<Integer> subsetSet = new HashSet<>(subset);
                boolean valid = true;
                for (int condIdx = 0; condIdx < m; condIdx++) {
                    List<Integer> cond = conditions.get(condIdx);
                    int parity = parities.get(condIdx);
                    int count = 0;
                    for (int num : cond) {
                        if (subsetSet.contains(num)) {
                            count++;
                        }
                    }
                    if (count % 2 != parity) {
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    ans += (1 << v.size());
                }
            }
        }

        System.out.println(ans);
    }

    private static List<List<Integer>> generateCombinations(List<Integer> elements, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (k == 0) {
            result.add(new ArrayList<>());
            return result;
        }
        if (elements.isEmpty() || k > elements.size()) {
            return result;
        }

        Integer first = elements.get(0);
        List<Integer> rest = elements.subList(1, elements.size());

        List<List<Integer>> withFirst = generateCombinations(rest, k - 1);
        for (List<Integer> combo : withFirst) {
            List<Integer> newCombo = new ArrayList<>(combo);
            newCombo.add(first);
            result.add(newCombo);
        }

        List<List<Integer>> withoutFirst = generateCombinations(rest, k);
        result.addAll(withoutFirst);

        return result;
    }
}

