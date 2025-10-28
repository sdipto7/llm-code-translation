
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
            int mid = (n + 1) / 2 - 1;
            System.out.println(high[mid] - low[mid] + 1);
        } else {
            int mid1 = n / 2 - 1;
            int mid2 = n / 2;
            double hh = (high[mid1] + high[mid2]) / 2.0;
            double ll = (low[mid1] + low[mid2]) / 2.0;
            System.out.println((int) ((hh - ll) * 2 + 1));
        }
    }
}

