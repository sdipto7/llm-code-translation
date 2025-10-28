
import java.util.*;

public class atcoder_ABC169_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if (n == 1) {
            System.out.println(0);
            return;
        }
        
        List<Integer> factors = primeFactorization(n);
        Map<Integer, Integer> factorCounts = countExponents(factors);
        int result = 0;
        
        for (Map.Entry<Integer, Integer> entry : factorCounts.entrySet()) {
            int exponent = entry.getValue();
            int current = exponent;
            int step = 1;
            
            while (current >= step) {
                current -= step;
                result++;
                step++;
            }
        }
        
        System.out.println(result);
    }
    
    private static List<Integer> primeFactorization(int n) {
        List<Integer> factors = new ArrayList<>();
        
        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }
        
        int factor = 3;
        while (factor * factor <= n) {
            while (n % factor == 0) {
                factors.add(factor);
                n /= factor;
            }
            factor += 2;
        }
        
        if (n > 1) {
            factors.add(n);
        }
        
        return factors;
    }
    
    private static Map<Integer, Integer> countExponents(List<Integer> factors) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : factors) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        return counts;
    }
}

