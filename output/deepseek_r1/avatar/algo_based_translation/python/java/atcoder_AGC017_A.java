
import java.util.Scanner;

public class atcoder_AGC017_A {
    private static long combi(int n, int k) {
        long result = 1;
        for (int i = 0; i < k; i++) {
            result *= n - i;
            result /= i + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        
        int[] parityList = new int[n];
        for (int i = 0; i < n; i++) {
            parityList[i] = scanner.nextInt() % 2;
        }

        int oddCount = 0;
        for (int num : parityList) {
            if (num == 1) oddCount++;
        }
        int evenCount = n - oddCount;

        long evenCombinations = (long) Math.pow(2, evenCount);
        long validOddCombinations = 0;
        
        for (int k = 0; k <= oddCount; k++) {
            if (k % 2 == p) {
                validOddCombinations += combi(oddCount, k);
            }
        }

        System.out.println(validOddCombinations * evenCombinations);
    }
}

