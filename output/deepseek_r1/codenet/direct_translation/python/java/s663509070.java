
import java.util.*;

public class s663509070 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D = scanner.nextInt();
        List<int[]> mat = new ArrayList<>();
        for (int d = 0; d < N; d++) {
            int[] row = new int[D];
            for (int k = 0; k < D; k++) {
                row[k] = scanner.nextInt();
            }
            mat.add(row);
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                long sum = 0;
                int[] a = mat.get(i);
                int[] b = mat.get(j);
                for (int k = 0; k < D; k++) {
                    int diff = a[k] - b[k];
                    sum += (long) diff * diff;
                }
                double sqrtSum = Math.sqrt(sum);
                int intSqrt = (int) sqrtSum;
                if ((long) intSqrt * intSqrt == sum) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

