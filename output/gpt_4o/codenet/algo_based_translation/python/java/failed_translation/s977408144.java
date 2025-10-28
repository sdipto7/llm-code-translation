
import java.util.*;

class Main {
    // Helper functions to print "yes", "Yes", "YES" based on boolean input
    static void yn(boolean b) {
        if (b) System.out.println("yes");
        else System.out.println("no");
    }

    static void Yn(boolean b) {
        if (b) System.out.println("Yes");
        else System.out.println("No");
    }

    static void YN(boolean b) {
        if (b) System.out.println("YES");
        else System.out.println("NO");
    }

    // Union-Find class
    static class UnionFind {
        int n;
        int[] parent;
        int[] rank;

        public UnionFind(int n) {
            this.n = n;
            this.parent = new int[n];
            this.rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                rank[i] = 0;
            }
        }

        int find(int x) {
            if (x != parent[x]) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        boolean same(int x, int y) {
            return find(x) == find(y);
        }

        void link(int x, int y) {
            if (rank[x] < rank[y]) {
                parent[x] = y;
            } else if (rank[y] < rank[x]) {
                parent[y] = x;
            } else {
                parent[x] = y;
                rank[y]++;
            }
        }

        void unite(int x, int y) {
            link(find(x), find(y));
        }

        int size() {
            Set<Integer> set = new HashSet<>();
            for (int i = 0; i < n; i++) {
                set.add(find(i));
            }
            return set.size();
        }
    }

    static boolean isPower(int a, int b) {
        int now = b;
        while (now < a) {
            now *= b;
        }
        return now == a;
    }

    static List<Integer> bin_(int num, int size) {
        List<Integer> A = new ArrayList<>(Collections.nCopies(size, 0));
        for (int a = 0; a < size; a++) {
            if ((num >> (size - a - 1) & 1) == 1) {
                A.set(a, 1);
            } else {
                A.set(a, 0);
            }
        }
        return A;
    }

    static List<Integer> getFacs(int n, int mod_) {
        List<Integer> A = new ArrayList<>(Collections.nCopies(n + 1, 1));
        for (int a = 2; a < A.size(); a++) {
            A.set(a, A.get(a - 1) * a);
            if (mod_ > 0) {
                A.set(a, A.get(a) % mod_);
            }
        }
        return A;
    }

    static int comb(int n, int r, int mod, List<Integer> fac) {
        if (n - r < 0) return 0;
        return (int) ((fac.get(n) * 
                Math.pow(fac.get(n - r), mod - 2) % mod * 
                Math.pow(fac.get(r), mod - 2) % mod) % mod);
    }

    static Integer nextComb(int num, int size) {
        int x = num & (-num);
        int y = num + x;
        int z = num & (~y);
        z /= x;
        z >>= 1;
        num = (y | z);
        if (num >= (1 << size)) return null;
        else return num;
    }

    static List<Integer> getPrimes(int n, String type) {
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
            List<Boolean> result = new ArrayList<>();
            for (boolean b : A) result.add(b);
            return result;
        } else {
            List<Integer> B = new ArrayList<>();
            for (int a = 0; a <= n; a++) {
                if (A[a]) B.add(a);
            }
            return B;
        }
    }

    static boolean isPrime(int num) {
        if (num <= 2) return false;
        int i = 2;
        while (i * i <= num) {
            if (num % i == 0) return false;
            i++;
        }
        return true;
    }

    static <T> T ifelse(boolean a, T b, T c) {
        if (a) return b;
        else return c;
    }

    static String join(List<?> A, String c) {
        StringBuilder s = new StringBuilder();
        for (int a = 0; a < A.size(); a++) {
            s.append(A.get(a).toString());
            if (a < A.size() - 1) s.append(c);
        }
        return s.toString();
    }

    static Map<Integer, Integer> factorize(int n, String type_) {
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
        if (type_.equals("dict")) {
            Map<Integer, Integer> dic = new HashMap<>();
            for (int a : list_) {
                dic.put(a, dic.getOrDefault(a, 0) + 1);
            }
            return dic;
        } else if (type_.equals("list")) {
            return list_;
        } else {
            return null;
        }
    }

    static int floor_(int n, int x) {
        return x * (n / x);
    }

    static int ceil_(int n, int x) {
        return x * ((n + x - 1) / x);
    }

    static int hani(int x, int min_, int max_) {
        int ret = x;
        if (x < min_) ret = min_;
        if (x > max_) ret = max_;
        return ret;
    }

    static int seifu(int x) {
        return x / Math.abs(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input reading, variable declaration, and data processing
        int n = sc.nextInt();
        int l = sc.nextInt();
        sc.nextLine(); // consume newline
        String[] S = new String[n];
        for (int a = 0; a < n; a++) {
            S[a] = sc.nextLine();
        }

        // Sorting and output
        Arrays.sort(S);
        StringBuilder result = new StringBuilder();
        for (String s : S) {
            result.append(s);
        }
        System.out.println(result.toString());

        sc.close();
    }
}

