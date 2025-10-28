
import java.util.*;
import java.io.*;

public class s977408144 {
    static final String alphabet = "abcdefghijklmnopqrstuvwxyz";
    static final int mod = (int) (1e9 + 7);
    static final long inf = (long) (1e20);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int l = Integer.parseInt(line[1]);
        String[] S = new String[n];
        for (int i = 0; i < n; i++) {
            S[i] = br.readLine();
        }
        Arrays.sort(S);
        pw.println(String.join("", S));
        pw.close();
    }

    public static void yn(boolean b) {
        System.out.println(b ? "yes" : "no");
    }

    public static void Yn(boolean b) {
        System.out.println(b ? "Yes" : "No");
    }

    public static void YN(boolean b) {
        System.out.println(b ? "YES" : "NO");
    }

    public static boolean isPower(int a, int b) {
        int now = b;
        while (now < a) {
            now *= b;
        }
        return now == a;
    }

    public static int[] bin(int num, int size) {
        int[] A = new int[size];
        for (int i = 0; i < size; i++) {
            A[i] = (num >> (size - i - 1)) & 1;
        }
        return A;
    }

    public static long[] getFacs(int n, int mod) {
        long[] A = new long[n + 1];
        A[0] = 1;
        for (int i = 1; i <= n; i++) {
            A[i] = (A[i - 1] * i) % mod;
        }
        return A;
    }

    public static long comb(int n, int r, int mod, long[] fac) {
        if (n - r < 0) return 0;
        return (fac[n] * modInverse(fac[n - r], mod) % mod * modInverse(fac[r], mod)) % mod;
    }

    public static int nextComb(int num, int size) {
        int x = num & -num;
        int y = num + x;
        int z = num & (~y);
        z /= x;
        z >>= 1;
        num = (y | z);
        return num >= (1 << size) ? -1 : num;
    }

    public static boolean[] getPrimes(int n) {
        boolean[] A = new boolean[n + 1];
        Arrays.fill(A, true);
        A[0] = A[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (A[i]) {
                for (int j = i * i; j <= n; j += i) {
                    A[j] = false;
                }
            }
        }
        return A;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static long modInverse(long a, int mod) {
        return power(a, mod - 2, mod);
    }

    public static long power(long x, long y, int mod) {
        long res = 1;
        x = x % mod;
        while (y > 0) {
            if ((y & 1) == 1) res = (res * x) % mod;
            y = y >> 1;
            x = (x * x) % mod;
        }
        return res;
    }

    public static int floor(int n, int x) {
        return x * (n / x);
    }

    public static int ceil(int n, int x) {
        return x * ((n + x - 1) / x);
    }

    public static int hani(int x, int min, int max) {
        return Math.min(Math.max(x, min), max);
    }

    public static int seifu(int x) {
        return x / Math.abs(x);
    }
}

class UnionFind {
    int[] P;
    int[] rank;

    public UnionFind(int n) {
        P = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            P[i] = i;
        }
    }

    public int find(int x) {
        if (x != P[x]) P[x] = find(P[x]);
        return P[x];
    }

    public boolean same(int x, int y) {
        return find(x) == find(y);
    }

    public void link(int x, int y) {
        if (rank[x] < rank[y]) {
            P[x] = y;
        } else if (rank[y] < rank[x]) {
            P[y] = x;
        } else {
            P[x] = y;
            rank[y]++;
        }
    }

    public void unite(int x, int y) {
        link(find(x), find(y));
    }

    public int size() {
        Set<Integer> S = new HashSet<>();
        for (int i = 0; i < P.length; i++) {
            S.add(find(i));
        }
        return S.size();
    }
}

