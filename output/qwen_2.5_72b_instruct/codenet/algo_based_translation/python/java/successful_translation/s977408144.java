
import java.util.*;

public class s977408144 {
    static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    static int mod = 1000000007;
    static long inf = 1000000000000000000L;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        List<String> S = new ArrayList<>();
        for (int a = 0; a < n; a++) {
            S.add(scanner.next());
        }
        Collections.sort(S);
        System.out.println(String.join("", S));
    }

    public static void yn(boolean b) {
        if (b) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static void Yn(boolean b) {
        if (b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void YN(boolean b) {
        if (b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static class UnionFind {
        int n;
        int[] P;
        int[] rank;

        UnionFind(int n) {
            this.n = n;
            P = new int[n];
            rank = new int[n];
            for (int a = 0; a < n; a++) {
                P[a] = a;
            }
        }

        int find(int x) {
            if (x != P[x]) {
                P[x] = find(P[x]);
            }
            return P[x];
        }

        boolean same(int x, int y) {
            return find(x) == find(y);
        }

        void link(int x, int y) {
            if (rank[x] < rank[y]) {
                P[x] = y;
            } else if (rank[y] < rank[x]) {
                P[y] = x;
            } else {
                P[x] = y;
                rank[y]++;
            }
        }

        void unite(int x, int y) {
            link(find(x), find(y));
        }

        int size() {
            Set<Integer> S = new HashSet<>();
            for (int a = 0; a < n; a++) {
                S.add(find(a));
            }
            return S.size();
        }
    }

    public static boolean isPower(int a, int b) {
        long now = b;
        while (now < a) {
            now *= b;
        }
        return now == a;
    }

    public static List<Integer> bin(int num, int size) {
        List<Integer> A = new ArrayList<>(Collections.nCopies(size, 0));
        for (int a = 0; a < size; a++) {
            if (((num >> (size - a - 1)) & 1) == 1) {
                A.set(a, 1);
            } else {
                A.set(a, 0);
            }
        }
        return A;
    }

    public static List<Integer> getFacs(int n, int mod_) {
        List<Integer> A = new ArrayList<>(Collections.nCopies(n + 1, 1));
        for (int a = 2; a < A.size(); a++) {
            A.set(a, A.get(a - 1) * a);
            if (mod_ > 0) {
                A.set(a, A.get(a) % mod_);
            }
        }
        return A;
    }

    public static int comb(int n, int r, int mod, List<Integer> fac) {
        if (n - r < 0) {
            return 0;
        }
        return (int) ((long) fac.get(n) * pow(fac.get(n - r), mod - 2, mod) % mod * pow(fac.get(r), mod - 2, mod) % mod) % mod;
    }

    public static int pow(long base, int exp, int mod) {
        long result = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = result * base % mod;
            }
            base = base * base % mod;
            exp >>= 1;
        }
        return (int) result;
    }

    public static int nextComb(int num, int size) {
        int x = num & (-num);
        int y = num + x;
        int z = num & (~y);
        z /= x;
        z >>= 1;
        num = y | z;
        if (num >= (1 << size)) {
            return -1;
        } else {
            return num;
        }
    }

    public static List<Integer> getPrimes(int n, String type) {
        boolean[] A = new boolean[n + 1];
        Arrays.fill(A, true);
        A[0] = false;
        A[1] = false;
        for (int a = 2; a <= n; a++) {
            if (A[a]) {
                for (int b = a * 2; b <= n; b += a) {
                    A[b] = false;
                }
            }
        }
        if (type.equals("bool")) {
            List<Integer> B = new ArrayList<>();
            for (int a = 0; a <= n; a++) {
                if (A[a]) {
                    B.add(a);
                }
            }
            return B;
        } else {
            List<Integer> B = new ArrayList<>();
            for (int a = 0; a <= n; a++) {
                if (A[a]) {
                    B.add(a);
                }
            }
            return B;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 2) {
            return false;
        }
        int i = 2;
        while (i * i <= num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static <T> T ifelse(boolean a, T b, T c) {
        if (a) {
            return b;
        } else {
            return c;
        }
    }

    public static String join(List<?> A, String c) {
        int n = A.size();
        List<String> strList = new ArrayList<>();
        for (Object a : A) {
            strList.add(a.toString());
        }
        StringBuilder s = new StringBuilder();
        for (int a = 0; a < n; a++) {
            s.append(strList.get(a));
            if (a < n - 1) {
                s.append(c);
            }
        }
        return s.toString();
    }

    public static Map<Integer, Integer> factorize(int n, String type_) {
        int b = 2;
        List<Integer> list_ = new ArrayList<>();
        while (b * b <= n) {
            while (n % b == 0) {
                n /= b;
                list_.add(b);
            }
            b++;
        }
        if (n > 1) {
            list_.add(n);
        }
        if (type_.equals("dict")) {
            Map<Integer, Integer> dic = new HashMap<>();
            for (int a : list_) {
                dic.put(a, dic.getOrDefault(a, 0) + 1);
            }
            return dic;
        } else if (type_.equals("list")) {
            return null;
        } else {
            return null;
        }
    }

    public static int floor(int n, int x) {
        return x * (n / x);
    }

    public static int ceil(int n, int x) {
        return x * ((n + x - 1) / x);
    }

    public static int hani(int x, int min_, int max_) {
        int ret = x;
        if (x < min_) {
            ret = min_;
        }
        if (x > max_) {
            ret = max_;
        }
        return ret;
    }

    public static int seifu(int x) {
        return x / Math.abs(x);
    }
}

