
import java.util.*;

public class s681105182 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int n = a[N - 1];
        double dif = Double.MAX_VALUE;
        double prevDif = Double.MAX_VALUE;
        int r = 0;
        for (int i = 0; i < N - 1; i++) {
            int ai = a[i];
            double currentDiff = Math.abs((double) n / 2 - ai);
            double oldDif = dif;
            double newDif = Math.min(currentDiff, oldDif);
            if (newDif != prevDif) {
                r = ai;
                prevDif = newDif;
            }
            dif = newDif;
        }
        System.out.println(n + " " + r);
    }
}

