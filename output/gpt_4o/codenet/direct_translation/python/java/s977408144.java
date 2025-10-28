
import java.util.*;

public class s977408144 {
    static final long mod = (long)1e9 + 7;
    static final long inf = (long)1e20;

    static void yn(boolean b) {
        if (b) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    static void Yn(boolean b) {
        if (b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static void YN(boolean b) {
        if (b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static class UnionFind {
        int[] P;
        int[] rank;

        UnionFind(int n) {
            P = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                P[i] = i;
                rank[i] = 0;
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
            for (int i = 0; i < P.length; i++) {
                S.add(find(i));
            }
            return S.size();
        }
    }

    static boolean is_power(int a, int b) {
        long now = b;
        while (now < a) {
            now *= b;
        }
        return now == a;
    }

    static int[] bin_(int num, int size) {
        int[] A = new int[size];
        for (int i = 0; i < size; i++) {
            if ((num >> (size - i - 1) & 1) == 1) {
                A[i] = 1;
            } else {
                A[i] = 0;
            }
        }
        return A;
    }

    static long[] get_facs(int n, long mod_) {
        long[] A = new long[n + 1];
        A[0] = 1;
        for (int i = 2; i < A.length; i++) {
            A[i] = A[i - 1] * i;
            if (mod_ > 0) {
                A[i] %= mod_;
            }
        }
        return A;
    }

    static long comb(int n, int r, long mod, long[] fac) {
        if (n - r < 0) return 0;
        return (fac[n] * pow(fac[n - r], mod - 2, mod) % mod) * pow(fac[r], mod - 2, mod) % mod;
    }

    static int next_comb(int num, int size) {
        int x = num & (-num);
        int y = num + x;
        int z = num & (~y);
        z /= x;
        z = z >> 1;
        num = (y | z);
        if (num >= (1 << size)) return -1;
        return num;
    }

    static List<Integer> get_primes(int n, String type) {
        boolean[] A = new boolean[n + 1];
        Arrays.fill(A, true);
        A[0] = false;
        A[1] = false;
        for (int i = 2; i <= n; i++) {
            if (A[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    A[j] = false;
                }
            }
        }
        List<Integer> B = new ArrayList<>();
        if (type.equals("bool")) {
            for (int i = 0; i <= n; i++) {
                if (A[i]) B.add(i);
            }
        }
        return B;
    }

    static boolean is_prime(int num) {
        if (num <= 2) return false;
        int i = 2;
        while (i * i <= num) {
            if (num % i == 0) return false;
            i++;
        }
        return true;
    }

    static long pow(long base, long exp, long mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) result = result * base % mod;
            base = base * base % mod;
            exp >>= 1;
        }
        return result;
    }

    static String join(List<Integer> A, String c) {
        int n = A.size();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            s.append(A.get(i));
            if (i < n - 1) s.append(c);
        }
        return s.toString();
    }

    static Map<Integer, Integer> factorize(int n, String type) {
        int b = 2;
        List<Integer> list_ = new ArrayList<>();
        while (b * b <= n) {
            while (n % b == 0) {
                n /= b;
                list_.add(b);
            }
            b++;
        }
        if (n > 1) list_.add(n);
        if (type.equals("dict")) {
            Map<Integer, Integer> dic = new HashMap<>();
            for (int a : list_) {
                dic.put(a, dic.getOrDefault(a, 0) + 1);
            }
            return dic;
        } else if (type.equals("list")) {
            return list_;
        } else {
            return null;
        }
    }

    static long floor_(long n, long x) {
        return x * (n / x);
    }

    static long ceil_(long n, long x) {
        return x * ((n + x - 1) / x);
    }

    static long hani(long x, long min_, long max_) {
        long ret = x;
        if (x < min_) ret = min_;
        if (x > max_) ret = max_;
        return ret;
    }

    static long seifu(long x) {
        return x / Math.abs(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        String[] S = new String[n];
        for (int i = 0; i < n; i++) {
            S[i] = sc.next();
        }
        Arrays.sort(S);
        StringBuilder result = new StringBuilder();
        for (String s : S) {
            result.append(s);
        }
        System.out.println(result.toString());
    }
}

