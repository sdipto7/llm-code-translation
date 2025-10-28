
import java.util.*;
import java.math.*;

public class s137613418 {
    public static int load() {
        return Integer.parseInt(new Scanner(System.in).nextLine().trim());
    }

    public static <T> List<T> load_list(String separator, Class<T> vtype) {
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().trim().split(separator);
        List<T> result = new ArrayList<>();
        for (String part : parts) {
            if (vtype == Integer.class) {
                result.add(vtype.cast(Integer.parseInt(part)));
            }
        }
        return result;
    }

    public static List<Deque<Integer>> perm_sub(List<Integer> li, Set<Integer> used) {
        if (li.size() == used.size()) {
            return new ArrayList<>(Collections.singleton(new LinkedList<>()));
        }
        List<Deque<Integer>> k = new ArrayList<>();
        for (int i = 0; i < li.size(); i++) {
            if (used.contains(i)) continue;
            used.add(i);
            List<Deque<Integer>> subList = perm_sub(li, used);
            for (Deque<Integer> sub : subList) {
                sub.addFirst(li.get(i));
            }
            k.addAll(subList);
            used.remove(i);
        }
        return k;
    }

    public static List<Deque<Integer>> perm_li(List<Integer> li) {
        return perm_sub(li, new HashSet<>());
    }

    public static List<Deque<Integer>> perm_n(int n) {
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < n; i++) li.add(i);
        return perm_sub(li, new HashSet<>());
    }

    public static String join_i(List<?> li, String sep) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < li.size(); i++) {
            sb.append(li.get(i).toString());
            if (i < li.size() - 1) sb.append(sep);
        }
        return sb.toString();
    }

    public static int li2n(List<Integer> li) {
        int n = 0, base = 1;
        for (int i = li.size() - 1; i >= 0; i--) {
            n += li.get(i) * base;
            base *= 10;
        }
        return n;
    }

    public static List<Integer> sli2ili(List<String> li) {
        List<Integer> result = new ArrayList<>();
        for (String s : li) result.add(Integer.parseInt(s));
        return result;
    }

    public static List<Integer> prime_list(int n) {
        List<Integer> li = new ArrayList<>();
        for (int i = 2; i <= n; i++) li.add(i);
        for (int i = 0; i < li.size(); i++) {
            int current = li.get(i);
            if (current > Math.sqrt(n)) break;
            if (current == -1) continue;
            for (int j = i + 1; j < li.size(); j++) {
                if (li.get(j) % current == 0) li.set(j, -1);
            }
        }
        List<Integer> primes = new ArrayList<>();
        for (int num : li) if (num != -1) primes.add(num);
        return primes;
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static List<Set<Integer>> all_subset(List<Integer> li) {
        List<Set<Integer>> subsets = new ArrayList<>();
        int n = li.size();
        for (int bit = 0; bit < (1 << (n + 1)); bit++) {
            Set<Integer> subset = new HashSet<>();
            for (int i = 0; i < n; i++) {
                if ((bit & (1 << i)) != 0) subset.add(li.get(i));
            }
            subsets.add(subset);
        }
        return subsets;
    }

    public static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static int mCn(int m, int n) {
        return factorial_ntimes(m, n) / factorial(n);
    }

    private static int factorial_ntimes(int m, int n) {
        int result = 1;
        while (n-- > 0) result *= m--;
        return result;
    }

    public static void main(String[] args) {
        int n = load();
        List<Integer> A = load_list(" ", Integer.class);
        Set<Integer> setA = new HashSet<>(A);
        System.out.println(n == setA.size() ? "YES" : "NO");
    }
}

