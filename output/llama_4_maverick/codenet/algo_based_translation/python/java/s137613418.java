
import java.util.*;
import java.lang.Math;
import java.io.*;

public class s137613418 {

    public static int load() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine().trim());
    }

    public static List<Integer> loadList(String separator) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().trim().split(separator);
        List<Integer> list = new ArrayList<>();
        for (String str : strArr) {
            list.add(Integer.parseInt(str));
        }
        return list;
    }

    public static void exit() {
        System.exit(0);
    }

    public static List<Deque<Integer>> permSub(List<Integer> li, Set<Integer> used) {
        if (li.size() == used.size()) {
            List<Deque<Integer>> k = new ArrayList<>();
            Deque<Integer> deque = new ArrayDeque<>();
            k.add(deque);
            return k;
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

    public static List<Deque<Integer>> permLi(List<Integer> li) {
        return permSub(li, new HashSet<>());
    }

    public static List<Deque<Integer>> permN(int n) {
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            li.add(i);
        }
        return permSub(li, new HashSet<>());
    }

    public static String joinI(List<Integer> li, String sep) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < li.size(); i++) {
            sb.append(li.get(i));
            if (i < li.size() - 1) {
                sb.append(sep);
            }
        }
        return sb.toString();
    }

    public static int li2n(List<Integer> li) {
        int n = 0;
        int base = 1;
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
        while (b != 0) {
            int r = a % b;
            if (r == 0) {
                return b;
            }
            a = b;
            b = r;
        }
        return b;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
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
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int mCn(int m, int n) {
        int r = factorialNtimes(m, n);
        return r / factorial(n);
    }

    public static int factorialNtimes(int m, int n) {
        int r = 1;
        while (n > 0) {
            r *= m;
            m--;
            n--;
        }
        return r;
    }

    public static void main(String[] args) throws IOException {
        int n = load();
        List<Integer> A = loadList(" ");
        if (new HashSet<>(A).size() == n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

