
import java.util.Arrays;
import java.util.Scanner;

public class s934308496 {

    public static int calculateMinCoins(int n, int x, int[] coinValues) {
        Arrays.sort(coinValues);
        int totalSum = 0;
        for (int value : coinValues) {
            totalSum += value;
        }
        int remaining = x - totalSum;
        int additionalCoins = remaining / coinValues[0];
        int totalCoins = n + additionalCoins;
        return totalCoins;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] coinValues = new int[n];
        for (int i = 0; i < n; i++) {
            coinValues[i] = scanner.nextInt();
        }
        int result = calculateMinCoins(n, x, coinValues);
        System.out.println(result);
    }
}

