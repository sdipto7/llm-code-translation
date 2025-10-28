
import java.util.Scanner;

public class s259116349 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
        int[][] divs = new int[100][primes.length];

        for (int i = 1; i <= 100; i++) {
            int[] tmp = new int[primes.length];
            int num = i;
            for (int j = 0; j < primes.length; j++) {
                int p = primes[j];
                tmp[j] = 0;
                while (num % p == 0) {
                    num /= p;
                    tmp[j]++;
                }
            }
            divs[i - 1] = tmp;
        }

        int[] divsum = new int[primes.length];
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < primes.length; j++) {
                divsum[j] += divs[i - 1][j];
            }
        }

        int num(int n) {
            int count = 0;
            for (int i = 0; i < divsum.length; i++) {
                if (divsum[i] >= n - 1) {
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

However, the above code will not compile because Java does not support nested methods. Here is the corrected version:


import java.util.Scanner;

public class s259116349 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
        int[][] divs = new int[100][primes.length];

        for (int i = 1; i <= 100; i++) {
            int[] tmp = new int[primes.length];
            int num = i;
            for (int j = 0; j < primes.length; j++) {
                int p = primes[j];
                tmp[j] = 0;
                while (num % p == 0) {
                    num /= p;
                    tmp[j]++;
                }
            }
            divs[i - 1] = tmp;
        }

        int[] divsum = new int[primes.length];
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < primes.length; j++) {
                divsum[j] += divs[i - 1][j];
            }
        }

        long ans = 0;
        ans += count(divsum, 75);
        ans += (long) count(divsum, 15) * (count(divsum, 5) - 1);
        ans += (long) count(divsum, 25) * (count(divsum, 3) - 1);
        ans += (long) count(divsum, 5) * (count(divsum, 5) - 1) * (count(divsum, 3) - 2) / 2;

        System.out.println(ans);
    }

    public static int count(int[] divsum, int n) {
        int count = 0;
        for (int i = 0; i < divsum.length; i++) {
            if (divsum[i] >= n - 1) {
                count++;
            }
        }
        return count;
    }
}

