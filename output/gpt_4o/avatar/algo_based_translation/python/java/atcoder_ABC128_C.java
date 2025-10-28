
import java.util.*;
import java.util.stream.Collectors;

public class atcoder_ABC128_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<List<Integer>> li = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int size = scanner.nextInt();
            List<Integer> sublist = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                sublist.add(scanner.nextInt());
            }
            li.add(sublist);
        }
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = scanner.nextInt();
        }

        Set<Integer> q = li.stream()
                .flatMap(List::stream)
                .collect(Collectors.toSet());

        Set<Integer> r = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            r.add(i);
        }

        Set<Integer> v = new HashSet<>(r);
        v.removeAll(q);
        
        int ans = 0;
        List<Integer> qList = new ArrayList<>(q);
        int qSize = qList.size();
        
        for (int i = 0; i <= qSize; i++) {
            Iterator<int[]> combinations = combinations(qList, i);
            while (combinations.hasNext()) {
                int[] sArray = combinations.next();
                Set<Integer> s = Arrays.stream(sArray).boxed().collect(Collectors.toSet());

                boolean valid = true;
                for (int j = 0; j < m; j++) {
                    List<Integer> u = li.get(j);
                    int w = p[j];
                    Set<Integer> uSet = new HashSet<>(u);
                    if (s.stream().filter(uSet::contains).count() % 2 != w) {
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

    private static Iterator<int[]> combinations(List<Integer> list, int k) {
        int n = list.size();
        int[] indices = new int[k];
        for (int i = 0; i < k; i++) {
            indices[i] = i;
        }

        return new Iterator<int[]>() {
            private boolean hasNext = k <= n;

            @Override
            public boolean hasNext() {
                return hasNext;
            }

            @Override
            public int[] next() {
                if (!hasNext) {
                    throw new NoSuchElementException();
                }

                int[] result = new int[k];
                for (int i = 0; i < k; i++) {
                    result[i] = list.get(indices[i]);
                }

                for (int i = k - 1; i >= 0; i--) {
                    if (indices[i] < i + n - k) {
                        indices[i]++;
                        for (int j = i + 1; j < k; j++) {
                            indices[j] = indices[j - 1] + 1;
                        }
                        return result;
                    }
                }

                hasNext = false;
                return result;
            }
        };
    }
}

