
import java.util.Scanner;

public class s259116349 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
        int[][] divs = new int[100][primes.length];
        for (int i = 1; i <= 100; i++) {
            int tmpI = i;
            for (int j = 0; j < primes.length; j++) {
                int p = primes[j];
                divs[i - 1][j] = 0;
                while (tmpI % p == 0) {
                    tmpI /= p;
                    divs[i - 1][j]++;
                }
            }
        }

        int[] divsum = new int[primes.length];
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < primes.length; j++) {
                divsum[j] += divs[i - 1][j];
            }
        }

        int num(int n) {
            int count = 0;
            for (int x : divsum) {
                if (x >= n - 1) {
                    count++;
                }
            }
            return count;
        }

        long ans = 0;
        ans += num(75);
        ans += (long) num(15) * (num(5) - 1);
        ans += (long) num(25) * (num(3) - 1);
        ans += (long) num(5) * (num(5) - 1) * (num(3) - 2) / 2;
        System.out.println(ans);
    }
}

