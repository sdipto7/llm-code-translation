import java.util.*;

public class s259116349 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
        int[][] divs = new int[100][primes.length];
        for (int i = 1; i <= 100; i++) {
            int tmp = i;
            for (int j = 0; j < primes.length; j++) {
                int p = primes[j];
                divs[i-1][j] = 0;
                while (tmp % p == 0) {
                    tmp /= p;
                    divs[i-1][j]++;
                }
            }
        }
        int[] divsum = new int[primes.length];
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < primes.length; j++) {
                divsum[j] += divs[i-1][j];
            }
        }
        int ans = 0;
        ans += num(75, divsum);
        ans += num(15, divsum) * (num(5, divsum) - 1);
        ans += num(25, divsum) * (num(3, divsum) - 1);
        ans += num(5, divsum) * (num(5, divsum) - 1) * (num(3, divsum) - 2) / 2;
        System.out.println(ans);
    }
    private static int num(int n, int[] divsum) {
        int count = 0;
        for (int d : divsum) {
            if (d >= n - 1) count++;
        }
        return count;
    }
}
