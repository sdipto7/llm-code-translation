import java.util.ArrayList;
import java.util.List;

public class s259116349 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int N = scanner.nextInt();

        List<Integer> primes = List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47);
        List<List<Integer>> divs = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            List<Integer> tmp = new ArrayList<>();
            for (int j = 0; j < primes.size(); j++) {
                tmp.add(0);
            }
            int val = i;
            for (int j = 0; j < primes.size(); j++) {
                int p = primes.get(j);
                while (val / p == val / (double) p) {
                    val /= p;
                    tmp.set(j, tmp.get(j) + 1);
                }
            }
            divs.add(tmp);
        }

        List<Integer> divsum = new ArrayList<>();
        for (int j = 0; j < primes.size(); j++) {
            divsum.add(0);
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < primes.size(); j++) {
                divsum.set(j, divsum.get(j) + divs.get(i - 1).get(j));
            }
        }

        int ans = 0;
        ans += num(75, divsum);
        ans += num(15, divsum) * (num(5, divsum) - 1);
        ans += num(25, divsum) * (num(3, divsum) - 1);
        ans += num(5, divsum) * (num(5, divsum) - 1) * (num(3, divsum) - 2) / 2;
        System.out.println(ans);
    }

    public static int num(int n, List<Integer> divsum) {
        int count = 0;
        for (int x : divsum) {
            if (x >= n - 1) {
                count++;
            }
        }
        return count;
    }
}
