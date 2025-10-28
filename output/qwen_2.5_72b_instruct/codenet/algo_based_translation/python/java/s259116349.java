import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class s259116349 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
        List<int[]> divs = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            int[] tmp = new int[primes.length];
            for (int j = 0; j < primes.length; j++) {
                int p = primes[j];
                tmp[j] = 0;
                while (i / p == (double) i / p) {
                    i = i / p;
                    tmp[j]++;
                }
            }
            divs.add(tmp);
        }

        int[] divsum = new int[primes.length];
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < primes.length; j++) {
                divsum[j] += divs.get(i - 1)[j];
            }
        }

        int ans = 0;
        ans += num(divsum, 75);
        ans += num(divsum, 15) * (num(divsum, 5) - 1);
        ans += num(divsum, 25) * (num(divsum, 3) - 1);
        ans += num(divsum, 5) * (num(divsum, 5) - 1) * (num(divsum, 3) - 2) / 2;
        System.out.println(ans);
    }

    public static int num(int[] divsum, int n) {
        int count = 0;
        for (int value : divsum) {
            if (value >= n - 1) {
                count++;
            }
        }
        return count;
    }
}
