
import java.util.Scanner;
import java.util.Arrays;
import java.math.BigInteger;

public class atcoder_ABC155_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        long[] A = new long[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextLong();
        }
        Arrays.sort(A);
        
        long ll = -1000000000000000001L;
        long rr = 1000000000000000001L;
        
        while (ll + 1 < rr) {
            long x = ll + (rr - ll) / 2;
            long tot = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] < 0) {
                    int l = -1;
                    int r = N;
                    while (l + 1 < r) {
                        int c = (l + r) / 2;
                        BigInteger product = BigInteger.valueOf(A[i]).multiply(BigInteger.valueOf(A[c]));
                        if (product.compareTo(BigInteger.valueOf(x)) < 0) {
                            r = c;
                        } else {
                            l = c;
                        }
                    }
                    tot += (long)N - r;
                } else {
                    int l = -1;
                    int r = N;
                    while (l + 1 < r) {
                        int c = (l + r) / 2;
                        BigInteger product = BigInteger.valueOf(A[i]).multiply(BigInteger.valueOf(A[c]));
                        if (product.compareTo(BigInteger.valueOf(x)) < 0) {
                            l = c;
                        } else {
                            r = c;
                        }
                    }
                    tot += (long)r;
                }
                BigInteger square = BigInteger.valueOf(A[i]).multiply(BigInteger.valueOf(A[i]));
                if (square.compareTo(BigInteger.valueOf(x)) < 0) {
                    tot--;
                }
            }
            tot /= 2;
            if (tot < K) {
                ll = x;
            } else {
                rr = x;
            }
        }
        System.out.println(ll);
    }
}

