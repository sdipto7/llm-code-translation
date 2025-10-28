
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class s259116349 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47);
        List<List<Integer>> divs = new ArrayList<>();
        
        for (int i = 1; i <= 100; i++) {
            List<Integer> tmp = new ArrayList<>();
            for (int k = 0; k < primes.size(); k++) {
                tmp.add(0);
            }
            
            int current = i;
            for (int j = 0; j < primes.size(); j++) {
                int p = primes.get(j);
                int count = 0;
                while (current % p == 0) {
                    current /= p;
                    count++;
                }
                tmp.set(j, count);
            }
            divs.add(tmp);
        }
        
        List<Integer> divsum = new ArrayList<>();
        for (int k = 0; k < primes.size(); k++) {
            divsum.add(0);
        }
        
        for (int i = 1; i <= N; i++) {
            List<Integer> currentDivs = divs.get(i - 1);
            for (int j = 0; j < primes.size(); j++) {
                divsum.set(j, divsum.get(j) + currentDivs.get(j));
            }
        }
        
        java.util.function.Function<Integer, Integer> num = n -> {
            int count = 0;
            for (int value : divsum) {
                if (value >= n - 1) {
                    count++;
                }
            }
            return count;
        };
        
        int ans = 0;
        ans += num.apply(75);
        ans += num.apply(15) * (num.apply(5) - 1);
        ans += num.apply(25) * (num.apply(3) - 1);
        ans += num.apply(5) * (num.apply(5) - 1) * (num.apply(3) - 2) / 2;
        
        System.out.println(ans);
    }
}

