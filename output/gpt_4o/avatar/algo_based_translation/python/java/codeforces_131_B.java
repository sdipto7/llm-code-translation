
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class codeforces_131_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        String[] inputWeights = scanner.nextLine().trim().split(" ");
        int[] weights = new int[n];

        for (int i = 0; i < n; i++) {
            weights[i] = Integer.parseInt(inputWeights[i]);
        }

        int result = countPairsWithSumZero(n, weights);
        System.out.println(result);
    }

    public static int countPairsWithSumZero(int n, int[] weights) {
        Map<Integer, Integer> w = new HashMap<>();
        for (int weight : weights) {
            w.put(weight, w.getOrDefault(weight, 0) + 1);
        }

        int c = 0;
        for (Map.Entry<Integer, Integer> entry : w.entrySet()) {
            int i = entry.getKey();
            if (i == 0) {
                c += entry.getValue() * (entry.getValue() - 1);
            } else if (w.containsKey(-i)) {
                c += entry.getValue() * w.get(-i);
            }
        }
        return c / 2;
    }
}

