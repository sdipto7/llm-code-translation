
import java.util.*;
import java.io.*;

public class s137613418 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = load(sc);
        List<Integer> A = loadList(sc, " ");
        if (n == new HashSet<>(A).size()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static int load(Scanner sc) {
        return Integer.parseInt(sc.nextLine().trim());
    }

    public static List<Integer> loadList(Scanner sc, String separator) {
        String[] tokens = sc.nextLine().trim().split(separator);
        List<Integer> list = new ArrayList<>();
        for (String token : tokens) {
            list.add(Integer.parseInt(token));
        }
        return list;
    }

    public static List<Deque<Integer>> permSub(List<Integer> li, Set<Integer> used) {
        if (li.size() == used.size()) {
            List<Deque<Integer>> result = new ArrayList<>();
            result.add(new ArrayDeque<>());
            return result;
        }
        List<Deque<Integer>> k = new ArrayList<>();
        for (int i = 0; i < li.size(); i++) {
            if (used.contains(i)) continue;
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

    public static List<Deque<Integer>> permLi(List<Integer> li) {
        return permSub(li, new HashSet<>());
    }

    public static List<Deque<Integer>> permN(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        return permSub(list, new HashSet<>());
    }

    public static String joinI(List<Integer> li, String sep) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < li.size(); i++) {
            if (i > 0) {
                sb.append(sep);
            }
            sb.append(li.get(i));
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
        for (String s : li) {
            result.add(Integer.parseInt(s));
        }
        return result;
    }

    public static List<Integer> primeList(int n) {
        List<Integer> li = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            li.add(i);
        }
        for (int i = 0; i < li.size(); i++) {
            if (li.get(i) >= Math.sqrt(n)) break;
            if (li.get(i) == -1) continue;
            for (int j = i + 1; j < li.size(); j++) {
                if (li.get(j) % li.get(i) == 0) {
                    li.set(j, -1);
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int num : li) {
            if (num != -1) {
                result.add(num);
            }
        }
        return result;
    }

    public static int gcd(int a, int b) {
        a = Math.max(a, b);
        b = Math.min(a, b);
        while (true) {
            int r = a % b;
            if (r == 0) return b;
            a = b;
            b = r;
        }
    }

    public static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    public static List<Set<Integer>> allSubset(List<Integer> li) {
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

    public static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static int mCn(int m, int n) {
        return (int) (factorialNTimes(m, n) / factorial(n));
    }

    private static long factorialNTimes(int m, int n) {
        long r = 1;
        while (n > 0) {
            r *= m;
            m--;
            n--;
        }
        return r;
    }
}

