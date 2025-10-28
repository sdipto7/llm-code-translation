import java.util.*;

public class codeforces_400_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            solve(scanner);
        }
    }

    static void solve(Scanner scanner) {
        String x = scanner.next();
        List<Integer> s = new ArrayList<>();
        for (char c : x.toCharArray()) {
            if (c == 'O') {
                s.add(0);
            } else {
                s.add(1);
            }
        }
        List<int[]> tot = new ArrayList<>();
        for (int i = 1; i < 13; i++) {
            if (12 % i == 0) {
                if (help(i, 12 / i, s)) {
                    tot.add(new int[]{12 / i, i});
                }
            }
        }
        System.out.print(tot.size() + " ");
        Collections.sort(tot, Comparator.comparingInt((int[] a) -> a[0]).thenComparingInt(a -> a[1]));
        for (int[] a : tot) {
            System.out.print(a[0] + "x" + a[1] + " ");
        }
        System.out.println();
    }

    static boolean help(int a, int b, List<Integer> l) {
        List<List<Integer>> tot = new ArrayList<>();
        for (int i = 0; i < b; i++) {
            tot.add(l.subList(i * a, i * a + a));
        }
        for (List<Integer> i : transpose(tot)) {
            if (i.stream().mapToInt(Integer::intValue).sum() == b) {
                return true;
            }
        }
        return false;
    }

    static List<List<Integer>> transpose(List<List<Integer>> lists) {
        List<List<Integer>> transposed = new ArrayList<>();
        for (int i = 0; i < lists.get(0).size(); i++) {
            List<Integer> row = new ArrayList<>();
            for (List<Integer> list : lists) {
                row.add(list.get(i));
            }
            transposed.add(row);
        }
        return transposed;
    }
}
