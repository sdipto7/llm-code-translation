
import java.util.*;
import java.io.*;

public class s137613418 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = load(reader, Integer::parseInt);
        List<Integer> A = loadList(reader, " ", Integer::parseInt);
        if (n == new HashSet<>(A).size()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static <T> T load(BufferedReader reader, Function<String, T> converter) throws IOException {
        return converter.apply(reader.readLine().trim());
    }

    static <T> List<T> loadList(BufferedReader reader, String separator, Function<String, T> converter) throws IOException {
        String[] parts = reader.readLine().trim().split(separator);
        List<T> list = new ArrayList<>();
        for (String part : parts) {
            list.add(converter.apply(part));
        }
        return list;
    }

    static void exit() {
        System.exit(0);
    }

    static List<Deque<Integer>> permSub(List<Integer> li, Set<Integer> used) {
        if (li.size() == used.size()) {
            return Collections.singletonList(new ArrayDeque<>());
        }
        List<Deque<Integer>> k = new ArrayList<>();
        for (int i = 0; i < li.size(); i++) {
            if (used.contains(i)) {
                continue;
            }
            used.add(i);
            List<Deque<Integer>> subList = permSub(li, used);
            for (Deque<Integer> sub : subList) {
                sub.addFirst(li.get(i));
            }
            k.addAll(subList);
            used.remove(i);
        }
        return k;
    }

    static List<Deque<Integer>> permLi(List<Integer> li) {
        return permSub(li, new HashSet<>());
    }

    static List<Deque<Integer>> permN(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        return permSub(list, new HashSet<>());
    }

    static String joinI(List<Integer> li, String sep) {
        return li.stream().map(String::valueOf).collect(Collectors.joining(sep));
    }

    static int li2n(List<Integer> li) {
        int n = 0, base = 1;
        for (int i = li.size() - 1; i >= 0; i--) {
            n += li.get(i) * base;
            base *= 10;
        }
        return n;
    }

    static List<Integer> sli2ili(List<String> li) {
        List<Integer> result = new ArrayList<>();
        for (String s : li) {
            result.add(Integer.parseInt(s));
        }
        return result;
    }

    static List<Integer> primeList(int n) {
        List<Integer> li = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            li.add(i);
        }
        for (int i = 0; i < li.size(); i++) {
            if (li.get(i) >= Math.sqrt(n)) {
                break;
            }
            if (li.get(i) == -1) {
                continue;
            }
            for (int j = i + 1; j < li.size(); j++) {
                if (li.get(j) % li.get(i) == 0) {
                    li.set(j, -1);
                }
            }
        }
        li.removeIf(val -> val == -1);
        return li;
    }

    static int gcd(int a, int b) {
        a = Math.max(a, b);
        b = Math.min(a, b);
        while (true) {
            int r = a % b;
            if (r == 0) {
                return b;
            }
            a = b;
            b = r;
        }
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    static List<Set<Integer>> allSubset(List<Integer> li) {
        List<Set<Integer>> s = new ArrayList<>();
        int n = li.size();
        for (int bit = 0; bit < (1 << (n + 1)); bit++) {
            Set<Integer> ss = new HashSet<>();
            for (int i = 0; i < n; i++) {
                if ((bit & (1 << i)) != 0) {
                    ss.add(li.get(i));
                }
            }
            s.add(ss);
        }
        return s;
    }

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static int mCn(int m, int n) {
        return factorialNTimes(m, n) / factorial(n);
    }

    static int factorialNTimes(int m, int n) {
        int r = 1;
        while (n > 0) {
            r *= m;
            m--;
            n--;
        }
        return r;
    }
}

