
import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC169_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] low = new int[n];
        int[] high = new int[n];
        
        for (int i = 0; i < n; i++) {
            low[i] = scanner.nextInt();
            high[i] = scanner.nextInt();
        }
        
        Arrays.sort(low);
        Arrays.sort(high);
        
        if (n % 2 == 1) {
            int medianIndex = (n + 1) / 2 - 1;
            System.out.println(high[medianIndex] - low[medianIndex] + 1);
        } else {
            int mid = n / 2 - 1;
            double upperMedian = (high[mid] + high[mid + 1]) / 2.0;
            double lowerMedian = (low[mid] + low[mid + 1]) / 2.0;
            System.out.println((int) ((upperMedian - lowerMedian) * 2 + 1));
        }
    }
}

