
import java.util.*;
import java.util.stream.Collectors;
import java.math.BigInteger;

public class s137613418 {
    
    public static int load() {
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine().trim());
    }
    
    public static List<Integer> loadList(String separator) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().trim().split(separator);
        return Arrays.stream(parts)
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
    }
    
    public static List<Integer> loadList() {
        return loadList(" ");
    }
    
    public static void exit() {
        System.exit(0);
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
    
    public static String joinI(List<?> li, String sep) {
        return li.stream()
                .map(Object::toString)
                .collect(Collectors.joining(sep));
    }
    
    public static String joinI(List<?> li) {
        return joinI(li, "");
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
        return li.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
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
        
        return li.stream()
                .filter(num -> num != -1)
                .collect(Collectors.toList());
    }
    
    public static int gcd(int a, int b) {
        int maxVal = Math.max(a, b);
        int minVal = Math.min(a, b);
        int tempA = maxVal;
        int tempB = minVal;
        
        while (true) {
            int r = tempA % tempB;
            if (r == 0) return tempB;
            tempA = tempB;
            tempB = r;
        }
    }
    
    public static int lcm(int a, int b) {
        return (int)((long)a * b / gcd(a, b));
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
    
    public static BigInteger factorial(int n) {
        if (n == 1) return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }
    
    public static BigInteger factorialNtimes(int m, int n) {
        BigInteger r = BigInteger.ONE;
        int tempM = m;
        int tempN = n;
        while (tempN > 0) {
            r = r.multiply(BigInteger.valueOf(tempM));
            tempM--;
            tempN--;
        }
        return r;
    }
    
    public static BigInteger mCn(int m, int n) {
        return factorialNtimes(m, n).divide(factorial(n));
    }
    
    public static void main(String[] args) {
        int n = load();
        List<Integer> A = loadList();
        Set<Integer> uniqueSet = new HashSet<>(A);
        
        if (n == uniqueSet.size()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

